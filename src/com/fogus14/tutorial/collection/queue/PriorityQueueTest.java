package com.fogus14.tutorial.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(1);

//        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

    }
}
