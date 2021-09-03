package com.fogus14.tutorial.thread.stop.interrupt;


public class MyThread extends Thread{


    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("MyThread is running");
                Thread.sleep(1);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("InterruptedException 발생함!");
                System.out.println("MyThread 종료.");
                break;      // break가 있어야 종료됨을 까먹지말자~~
            }
        }
    }

}
