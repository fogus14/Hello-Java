package com.fogus14.tutorial.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);

        System.out.println(list1.toString());   // .toString을 오버라이드 한 것임!!
        Set<Integer> set1 = new HashSet<>();

        System.out.println(set1.add(1));
        System.out.println(set1.add(1));

        for (Integer integer : set1) {
            System.out.println(integer);
        }
        System.out.println(set1);
    }
}
