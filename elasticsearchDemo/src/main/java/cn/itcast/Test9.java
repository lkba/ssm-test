package cn.itcast;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;


import java.io.IOException;
import java.util.Map;

/**
 *分页查询
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        //1.连接rest接口,9200
        HttpHost httpHost=new HttpHost("127.0.0.1",9200,"http");//url地址封装
        RestClientBuilder builder= RestClient.builder(httpHost);//rest客户端构建器
        RestHighLevelClient restHighLevelClient=new RestHighLevelClient(builder);// rest高级客户端

        //2.封装请求对象\
        SearchRequest searchRequest=new SearchRequest("sku");//查询请求对象
        searchRequest.types("doc");
        SearchSourceBuilder searchSourceBuilder=new SearchSourceBuilder();//查询源构建器
        MatchQueryBuilder matchQueryBuilder= QueryBuilders.matchQuery("name","手机");//匹配查询构建器
        searchSourceBuilder.query(matchQueryBuilder);//query{}
//        查出数据在进行操作
        HighlightBuilder highlightBuilder=new HighlightBuilder();
        highlightBuilder.field("name").preTags("<font style='color:red'>").postTags("</font>");
        searchSourceBuilder.highlighter(highlightBuilder);



        searchRequest.source(searchSourceBuilder);

        //3.获取响应结果
        SearchResponse searchResponse=restHighLevelClient.search(searchRequest,RequestOptions.DEFAULT);
        SearchHits searchHits=searchResponse.getHits();
        long totalHits=searchHits.getTotalHits();
        System.out.println("记录数"+totalHits);
        SearchHit[] hits=searchHits.getHits();
        System.out.println("高亮结果:");
        for (SearchHit hit:hits){
//            String source=hit.getSourceAsString();
//            System.out.println(source);
            Map<String, HighlightField> highlightFieldMap=hit.getHighlightFields();
            HighlightField name=highlightFieldMap.get("name");
            Text[] fragments=name.fragments();
            String s=fragments[0].toString();
            System.out.println(s);
        }

        restHighLevelClient.close();

    }
}
