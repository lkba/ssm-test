package com.lkb.test.za7za8;

public class synchronizedTest {
    private static final String A ="A";
    private static final String B ="B";

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A){
                    try {
                        Thread.sleep(2000);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (B){
                        System.out.println("1");
                    }
                }
            }
        });
        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    synchronized (A){
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }




}
