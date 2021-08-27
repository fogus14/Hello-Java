package com.fogus14.tutorial.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

    public static void main(String[] args) {

        // 리스트는 Sequential 해서 순서가 있다.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.forEach(item -> System.out.print(item + " "));
        String s = arrayList.get(0);
        System.out.println(s);

        boolean a = arrayList.contains("a");
        System.out.println(a);
//        arrayList.containsAll(new ArrayList<>())
        /////////////////////////////////////////////////////
        System.out.println();
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        arrayList1.forEach(System.out::print);

    }

}
