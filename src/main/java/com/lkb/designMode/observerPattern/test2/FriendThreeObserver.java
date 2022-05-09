package com.lkb.designMode.observerPattern.test2;

public class FriendThreeObserver implements Observer {
    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println("FriendThreeObserver 知道了你发动态了" + message);
    }
}
