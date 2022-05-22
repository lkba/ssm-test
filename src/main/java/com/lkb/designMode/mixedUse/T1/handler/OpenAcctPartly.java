package com.lkb.designMode.mixedUse.T1.handler;

import com.lkb.designMode.mixedUse.T1.observerPattern.UploadBasicInfoEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author winsonWu
 * @Description: 开户简略流程
 * @date Date : 2022.04.14 17:08
 **/
@Component("partly")
public class OpenAcctPartly implements OpenAccountHandler {

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void execute() {
        // 上传基础资料
        final String uploadBasicInfoMsg = uploadBasicInfo();
        // 结果上报到监控系统
        applicationEventPublisher.publishEvent(new UploadBasicInfoEvent(this, uploadBasicInfoMsg));
        // OCR检查
        final String OCRCheckMsg = OCRCheck();
        // 结果上报到监控系统
        applicationEventPublisher.publishEvent(new UploadBasicInfoEvent(this, OCRCheckMsg));
        //简略流程不涉及活体识别
        //aliveCheck();
        //简略流程不涉及绑卡
        //bindBankCard();
    }

    private String OCRCheck() {
        // 打印线程号，模拟执行OCR
        System.out.println(Thread.currentThread() + " doing OCR");
        return "OCRCheck";
    }

    private String uploadBasicInfo() {
        // 打印线程号，模拟执行上传基础资料
        System.out.println(Thread.currentThread() + " doing uploadBasicInfo");
        return "uploadBasicInfo";
    }
}
