package com.lkb.designMode.singleton;

/**
 * 饿汉式 (可用):在类加载时就完成了初始化，所以类加载比较慢，但获取对象的速度快
 *
 * 在类加载的时候就完成了实例化，避免了多线程的同步问题。当然缺点也是有的，因为类加载时就实例化了，没有达到Lazy Loading (懒加载) 的效果，如果该实例没被使用，内存就浪费了。
 */
public class Singleton {

    private final static Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }

}
