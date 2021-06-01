package cn.itcast;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;

/**
 * 范围查询
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        //1.连接rest接口,9200
        HttpHost httpHost=new HttpHost("127.0.0.1",9200,"http");//url地址封装
        RestClientBuilder builder= RestClient.builder(httpHost);//rest客户端构建器
        RestHighLevelClient restHighLevelClient=new RestHighLevelClient(builder);// rest高级客户端

        //2.封装请求对象\
        SearchRequest searchRequest=new SearchRequest("sku");//查询请求对象
        searchRequest.types("doc");

        SearchSourceBuilder searchSourceBuilder=new SearchSourceBuilder();//查询源构建器  {query:}

//        MatchQueryBuilder matchQueryBuilder= QueryBuilders.matchQuery("name","手机");//匹配查询构建器
//        searchSourceBuilder.query(matchQueryBuilder);
        RangeQueryBuilder rangeQueryBuilder=QueryBuilders.rangeQuery("price").gte(10000).lte(20000);//gte价格大于一万,lte价格xiao于2万
        searchSourceBuilder.query(rangeQueryBuilder);
        searchRequest.source(searchSourceBuilder);

        //3.获取响应结果
        SearchResponse searchResponse=restHighLevelClient.search(searchRequest,RequestOptions.DEFAULT);
        SearchHits searchHits=searchResponse.getHits();
        long totalHits=searchHits.getTotalHits();
        System.out.println("记录数"+totalHits);
        SearchHit[] hits=searchHits.getHits();
        for (SearchHit hit:hits){
            String source=hit.getSourceAsString();
            System.out.println(source);
        }

        restHighLevelClient.close();

    }
}
