package com.fogus14.tutorial.thread.create.method2;

import com.fogus14.tutorial.thread.stop.flag.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable myRunnable = new MyRunnable();                     // Runnable interface를 구현한 클래스를 넣어주기
        Thread myThread = new Thread(myRunnable, "ABC");
        myThread.start();


        Thread.sleep(2000);
        myThread.interrupt();

        String mainThreadName = Thread.currentThread().getName();
        System.out.println("mainThreadName name is " + mainThreadName);

        System.out.println("myThread name is " + myThread.getName());
    }
}
