package com.lkb.test.thymeleaf;


import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args)  {

        // 1.上下文
        Context context = new Context();
//创建数据模型
        Map<String, Object> dataModel = new HashMap();
        dataModel.put("name", "青橙电商系统");
        context.setVariables(dataModel);
// 2.准备文件
        File dest = new File("d:/test_out.html");
// 3.生成页面
        try {
            PrintWriter writer = new PrintWriter(dest,"UTF-8");
            ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();//模板解析器
            resolver.setTemplateMode(TemplateMode.HTML);//模板模型
            resolver.setSuffix(".html");//后缀
            TemplateEngine engine = new TemplateEngine();//创建模板引擎
            engine.setTemplateResolver(resolver);//设置模板解析器
            engine.process("test", context, writer);//执行模板引擎
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
