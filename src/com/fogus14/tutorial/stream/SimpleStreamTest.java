package com.fogus14.tutorial.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreamTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        // non-Stream
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        // Stream
//        Stream<Integer> stream = integers.stream();
////        stream.forEach(item -> System.out.println(item));
//        stream.forEach(System.out::println);
        integers.stream().forEach(System.out::println);
    }
}
