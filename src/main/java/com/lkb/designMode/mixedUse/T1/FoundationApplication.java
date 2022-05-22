package com.lkb.designMode.mixedUse.T1;

import com.lkb.designMode.mixedUse.T1.handler.OpenAcctMethodEnum;
import com.lkb.designMode.mixedUse.T1.handler.OpenAcctService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class FoundationApplication implements InitializingBean {

    @Autowired
    private OpenAcctService openAcctService;

    public static void main(String[] args) {
        SpringApplication.run(FoundationApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        openAcctService.openAccount(OpenAcctMethodEnum.PARTLY.getType());
    }
}
