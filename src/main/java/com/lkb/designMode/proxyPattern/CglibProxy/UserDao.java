package com.lkb.designMode.proxyPattern.CglibProxy;

/**
 * 目标对象,没有实现任何接口
 */
public class UserDao {

    public void save() {
        System.out.println("----已经保存数据!----");
    }

    public void save2(String str) {
        System.out.println("----已经保存数据!----"+str);
    }
}