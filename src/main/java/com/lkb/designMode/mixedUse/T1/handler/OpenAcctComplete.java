package com.lkb.designMode.mixedUse.T1.handler;

import org.springframework.stereotype.Component;

@Component("complete")
public class OpenAcctComplete implements OpenAccountHandler{

    @Override
    public void execute() {
        // todo 后续观察者模式实现
    }
}
