package com.fogus14.tutorial.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
//        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return - (i1 - i2);
//            }
//        });

        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.forEach(System.out::println);


    }

}
