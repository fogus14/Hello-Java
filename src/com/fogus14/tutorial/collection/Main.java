package com.fogus14.tutorial.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(1);
//
//        System.out.println(list1.toString());   // .toString을 오버라이드 한 것임!!
//        Set<Integer> set1 = new HashSet<>();
//
//        System.out.println(set1.add(1));
//        System.out.println(set1.add(1));
//
//        for (Integer integer : set1) {
//            System.out.println(integer);
//        }
//        System.out.println(set1);

        List<String> strings = Arrays.asList("a", "b", "c", "d");
        System.out.println(strings); // AbstractCollection 의 추상 클래스에서 toString을 재정의 하고 있기 때문입니다!
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(i + "번째 String : " + strings.get(i));
        }
    }
}
