package com.lkb.designMode.observerPattern.javaSelf;

import java.util.Observable;
import java.util.Observer;

public class App {
    public static class RealSubject extends Observable {

        public void makeChanged() {
            setChanged();
            notifyObservers();
        }
    }

    public static class RealObserver implements Observer {

        @Override
        public void update(Observable o, Object arg) {
            System.out.println("调用了-->");
        }
    }

    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        RealObserver observer = new RealObserver();
        subject.addObserver(observer);
        subject.makeChanged();
    }

}
