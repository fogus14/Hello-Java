package com.fogus14.tutorial.thread.threadpool.fixedthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업1");
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업2");
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업3");
            }
        });

    }
}
