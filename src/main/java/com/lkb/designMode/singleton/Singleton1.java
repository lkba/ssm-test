package com.lkb.designMode.singleton;

/**
 * 普通的懒汉式 (线程不安全，不可用):在类加载时不初始化，等到第一次被使用时才初始化。
 *
 * 只有在方法第一次被访问时才会实例化，达到了懒加载的效果。但是这种写法有个致命的问题，就是多线程的安全问题。假设对象还没被实例化，然后有两个线程同时访问，那么就可能出现多次实例化的结果，所以这种写法不可采用。
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
