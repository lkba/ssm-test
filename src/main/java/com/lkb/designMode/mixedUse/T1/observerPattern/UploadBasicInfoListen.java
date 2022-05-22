package com.lkb.designMode.mixedUse.T1.observerPattern;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 上传基础资料监听器
@Component
public class UploadBasicInfoListen implements ApplicationListener<UploadBasicInfoEvent> {

    @Override
    public void onApplicationEvent(UploadBasicInfoEvent event) {
        // 打印执行线程，模拟上报到监控系统
        System.out.println(Thread.currentThread() + " " + event.getMessage());
    }

}
