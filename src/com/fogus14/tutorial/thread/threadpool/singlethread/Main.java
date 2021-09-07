package com.fogus14.tutorial.thread.threadpool.singlethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        Executors
//        ExecutorService
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업1.");
            }
        });

        executorService.execute(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("작업2.");
            }
        });

    }
}
