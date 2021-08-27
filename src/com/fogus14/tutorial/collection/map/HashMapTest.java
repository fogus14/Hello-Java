package com.fogus14.tutorial.collection.map;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);

        Integer c = hashMap.get("c");
        System.out.println(c);

    }

}
