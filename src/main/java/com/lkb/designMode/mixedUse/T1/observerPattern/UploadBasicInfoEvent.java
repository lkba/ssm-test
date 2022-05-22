package com.lkb.designMode.mixedUse.T1.observerPattern;

import org.springframework.context.ApplicationEvent;

//上传基础资料事件
public class UploadBasicInfoEvent extends ApplicationEvent {

    // 事件发布需要传入的消息，也是上报到监控系统的消息
    private String message;

    public UploadBasicInfoEvent(Object source) {
        super(source);
    }

    public UploadBasicInfoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
