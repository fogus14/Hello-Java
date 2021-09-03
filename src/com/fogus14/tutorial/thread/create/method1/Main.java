package com.fogus14.tutorial.thread.create.method1;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();


        try {
            Thread.sleep(2000);
            myThread.setFlag(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        while (true) {
//            try {
//                System.out.println("Main Thread is running");
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
