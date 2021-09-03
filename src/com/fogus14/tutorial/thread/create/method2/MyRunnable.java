package com.fogus14.tutorial.thread.create.method2;

import lombok.SneakyThrows;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("MyRunnable is running");
                Thread.sleep(300);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("InterruptedException 발생함!");
                System.out.println("MyRunnable is stopped");
                break;
            }
        }
    }

}
