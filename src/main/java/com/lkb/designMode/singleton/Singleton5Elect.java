package com.lkb.designMode.singleton;

/**
 * 枚举 (可用、推荐)
 *
 * 这种写法在《Effective JAVA》中大为推崇，它可以解决两个问题：
 *
 * 1）线程安全问题。因为Java虚拟机在加载枚举类的时候会使用ClassLoader的方法，这个方法使用了同步代码块来保证线程安全。
 *
 * 2）避免反序列化破坏对象，因为枚举的反序列化并不通过反射实现。
 */
public enum Singleton5Elect {
    INSTANCE;
}