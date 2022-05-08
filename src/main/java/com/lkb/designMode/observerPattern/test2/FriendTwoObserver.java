package com.lkb.designMode.observerPattern.test2;

public class FriendTwoObserver implements Observer {
    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println("FriendTwoObserver 知道了你发动态了" + message);
    }
}
