package com.fogus14.tutorial.thread.stop.interrupt;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();


        try {
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
