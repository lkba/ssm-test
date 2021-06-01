package cn.itcast.Controller;

import cn.itcast.Service.SkuService;
import cn.itcast.goods.Sku;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
@RequestMapping("/TestSku")
public class TestSkuController {

//    public static void main(String[] args) throws IOException {
    @Autowired
    private SkuService skuService;

    @PostMapping("/addSkus")
    public void addSkus(){
        List<Sku> skuList=skuService.findAll();
        for(Sku sku:skuList){
            System.out.println(sku.getBrandName());
        }
    }


//        //1.连接rest接口,9200
//        HttpHost httpHost=new HttpHost("127.0.0.1",9200,"http");//url地址封装
//        RestClientBuilder builder= RestClient.builder(httpHost);//rest客户端构建器
//        RestHighLevelClient restHighLevelClient=new RestHighLevelClient(builder);// rest高级客户端
//
//        //2.封装请求对象\
//        BulkRequest bulkRequest=new BulkRequest();//多条增加
//        IndexRequest indexRequest=new IndexRequest("sku","doc","4");//： 新增或修改请求
//        Map skuMap =new HashMap();
//        skuMap.put("name","华为p30pro 新增新增4");
//        skuMap.put("brandName","华为4");
//        skuMap.put("categoryName","手机4");
//        skuMap.put("price",10102214);
//        skuMap.put("createTime","2019-05-01");
//        skuMap.put("saleNum",1010214);
//        skuMap.put("commentNum",101023214);
//        Map spec=new HashMap();
//        spec.put("网络制式","移动4G");
//        spec.put("屏幕尺寸","5");
//        skuMap.put("spec",spec);
//        indexRequest.source(skuMap);
//        bulkRequest.add(indexRequest);//多次添加
//
//        IndexRequest indexRequest2=new IndexRequest("sku","doc","5");//： 新增或修改请求
//        Map skuMap2 =new HashMap();
//        skuMap2.put("name","华为p30pro 新增新增5");
//        skuMap2.put("brandName","华为5");
//        skuMap2.put("categoryName","手机5");
//        skuMap2.put("price",10102215);
//        skuMap2.put("createTime","2019-05-01");
//        skuMap2.put("saleNum",1010215);
//        skuMap2.put("commentNum",101023215);
//        Map spec2=new HashMap();
//        spec2.put("网络制式","移动4G");
//        spec2.put("屏幕尺寸","5");
//        skuMap2.put("spec",spec2);
//        indexRequest2.source(skuMap2);
//        bulkRequest.add(indexRequest2);
//
//        //3.获取响应结果
//        BulkResponse response=restHighLevelClient.bulk(bulkRequest, RequestOptions.DEFAULT);
//        int status=response.status().getStatus();
//        System.out.println(status);
//
//        String message=response.buildFailureMessage();
//        System.out.println(message);
//        restHighLevelClient.close();

//    }
}
