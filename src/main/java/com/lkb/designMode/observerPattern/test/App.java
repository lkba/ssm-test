package com.lkb.designMode.observerPattern.test;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static class RealSubject implements Subject {
        private List<Observer> observerList = new ArrayList<>();

        @Override
        public void attach(Observer observer) {
            observerList.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            observerList.remove(observer);
        }

        @Override
        public void notifyChanged() {
            for (Observer observer : observerList) {
                observer.update();
            }
        }
    }

    public static class RealObject implements Observer {
        @Override
        public void update() {
            System.out.println("接收到了通知");
        }
    }
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Observer observer = new RealObject();
        subject.attach(observer);
        subject.notifyChanged();
    }

}
