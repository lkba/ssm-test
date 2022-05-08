package com.lkb.test.za7za8;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SchedulerManager {

    @PostConstruct
    public void init(){
        System.out.println("被调用了");
    }

    public void test(){
        System.out.println("test");
    }
}
