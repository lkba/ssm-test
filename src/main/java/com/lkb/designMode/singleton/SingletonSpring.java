package com.lkb.designMode.singleton;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonSpring {
    private static final Object NULL_OBJECT = null;
    // 通过 ConcurrentHashMap（线程安全） 实现单例注册表
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(64);

    public Object getSingleton(String beanName, ObjectFactory<?> singletonFactory) {
        Assert.notNull(beanName, "'beanName' must not be null");
        synchronized (this.singletonObjects) {
            // 检查缓存中是否存在实例
            Object singletonObject = this.singletonObjects.get(beanName);
            if (singletonObject == null) {
                //...省略了很多代码
                singletonObject = singletonFactory.getObject();
                //...省略了很多代码
                // 如果实例对象在不存在，我们注册到单例注册表中。
                addSingleton(beanName, singletonObject);
            }
            return singletonObject ;
        }
    }
    //将对象添加到单例注册表
    protected void addSingleton(String beanName, Object singletonObject) {
        synchronized (this.singletonObjects) {
            this.singletonObjects.put(beanName, (singletonObject != null ? singletonObject : NULL_OBJECT));

        }
    }
}

