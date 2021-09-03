package com.fogus14.tutorial.thread.stop.flag;

import lombok.Setter;

@Setter
public class MyThread extends Thread{

    private boolean flag = true;

    @Override
    public void run() {
        while (this.flag) {
            try {
                System.out.println("MyThread is running");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
