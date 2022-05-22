package com.lkb.designMode.mixedUse.T1.observerPattern;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author winsonWu
 * @Description: 自定义广播器
 **/
@Configuration
public class MulticasterConfig {

    /**
     * 创建spring内置线程池
     * 线程池文章参考：https://juejin.cn/post/7086351322944913438
     * @return
     */
    @Bean
    public ThreadPoolTaskExecutor listenerExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setAllowCoreThreadTimeOut(true);
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(5);
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        taskExecutor.setThreadFactory(new CustomizableThreadFactory("event-listener-resolver"));
        taskExecutor.setAwaitTerminationSeconds(10);
        return taskExecutor;
    }

    /**
     * 创建广播器
     * @return
     */
    @Bean
    public SimpleApplicationEventMulticaster applicationEventMulticaster(ConfigurableListableBeanFactory beanFactory,
                                                                         @Qualifier("listenerExecutor") ThreadPoolTaskExecutor taskExecutor) {
        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster(beanFactory);
        multicaster.setTaskExecutor(taskExecutor);
        return multicaster;
    }
}
