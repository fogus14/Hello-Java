package com.fogus14.tutorial.lang.string;

import java.util.ArrayList;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("def");
        System.out.println(sb);
        sb.append(new StringBuffer("AAA"));
        sb.insert(0, "NEW STRING");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
        int length = sb.length();
        System.out.println(length);
        sb.append("000");
        int capacity = sb.capacity();       // 효율에 맞게 해당 메모리 크기 설정
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize();                    // 해당 문자열에 최적화된 메모리 크기 설정
        System.out.println(sb.capacity());
    }
}
