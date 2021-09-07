package com.fogus14.tutorial.thread.daemon;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread autoSaveThread = new Thread(() -> {
            while (true) {
                System.out.println("자동 저장됨.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        Thread.sleep(1500);
        System.out.println(Thread.currentThread().getName() + " 종료됨.");

    }
}
