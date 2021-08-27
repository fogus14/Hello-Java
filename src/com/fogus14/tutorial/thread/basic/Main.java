package com.fogus14.tutorial.thread.basic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        - Program, Process, Thread

        -> 프로그램 : 컴퓨터 내에서 실행 가능한 시스템
        -> 프로세스 : 프로그램이 실행 중인 것
        -> 쓰레드 : 프로세스 내에서 실행 단위

         */
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main: " + i);
            Thread.sleep(500);
        }

    }
}
