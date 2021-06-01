package com.lkb.test.snowflakeDemo;

public class snowflakeDemo {
    //
    public static void main(String[] args) {
        //在分布式系统中使用要加配置文件  用于传递机器ID和序列号
        IdWorker idWorker=new IdWorker();
        long id=idWorker.nextId();
        System.out.println(id);

    }
}
