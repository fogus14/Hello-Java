package com.fogus14.tutorial.thread.threadgroup;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");
        Thread thread1 = new Thread(myThreadGroup, () -> {
            while (true) {
                try {
                    System.out.println("Thread1");
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Thread1 is stopped");
                    break;
                }

            }
        });
        Thread thread2 = new Thread(myThreadGroup, () -> {
            while (true) {
                try {
                    System.out.println("Thread2");
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Thread2 is stopped");
                    break;
                }

            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(2000);
        myThreadGroup.interrupt();

        String myThreadGroupName = myThreadGroup.getName();
        System.out.println("my thread group name is " + myThreadGroupName);

    }
}
