package com.fogus14.tutorial.collection.queue;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.addFirst(10);
        linkedList.addLast(0);
        linkedList.forEach(System.out::println);


    }

}
