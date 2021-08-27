package com.fogus14.tutorial.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set1.add(3);

        // Set은 중복된 값을 허용하지 않는다!
        set1.forEach(System.out::println);

        System.out.println("=============================================");

        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

}
