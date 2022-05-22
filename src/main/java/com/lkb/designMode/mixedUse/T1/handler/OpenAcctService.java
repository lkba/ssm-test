package com.lkb.designMode.mixedUse.T1.handler;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OpenAcctService implements ApplicationContextAware {

    /**
     * 也可以直接注入map，key为bean的名称，如果未对key指定名称，则是类名把首字母改为小写
     * value则为bean
     * 另外spring也支持注入list
     */
    /*@Autowired
    private Map<String, OpenAccountHandler> openAccountHandlerMap;*/

    /**
     * 也可以直接注入容器,再获取bean
     */
    /*@Resource
    private ApplicationContext applicationContext;*/

    private Map<OpenAcctMethodEnum, OpenAccountHandler> openAccountHandlerMap;

    /**
     *
     * @param type 选择开户方式
     */
    public void openAccount(String type){
        openAccountHandlerMap.get(OpenAcctMethodEnum.getEnumByType(type)).execute();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        final Map<String, OpenAccountHandler> handlerMap = applicationContext.getBeansOfType(OpenAccountHandler.class);
        openAccountHandlerMap = new HashMap<>(handlerMap.size());
        handlerMap.forEach((type, handler) ->
                openAccountHandlerMap.put(OpenAcctMethodEnum.getEnumByType(type), handler));
    }
}
