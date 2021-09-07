package com.fogus14.tutorial.thread.cachethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업1");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업2");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업3");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
