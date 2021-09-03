package com.fogus14.tutorial.thread.create.method5;

// 익명클래스로 run 오버라이드 뚝딱
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("MyRunnable is running");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException 발생함!");
                        System.out.println("MyRunnable is stopped");
                        break;
                    }
                }
            }
        };

        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
    }
}
