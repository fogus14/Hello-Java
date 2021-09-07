package com.fogus14.tutorial.thread.create.method4;

// 람다
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(() -> {                // 생성자에 람다로 Runnable interface의 run 메서드 오버라이드하기
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
        });
        myThread.start();

        Thread.sleep(2000);
        myThread.interrupt();
    }

}
