package com.fogus14.tutorial.lang.string;

public class Main {

    public static void main(String[] args) {
        // String은 불변(immutable)이다.
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        // 새로운 객체가 아니라 주소값을 참조해서 할당한다.
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        str1 = "world";
        System.out.println(str1.hashCode());
        str1 += "!!!";
        // 문자열이 많이 변경되는 String 객체는 메모리를 많이 잡아 먹어서 추천하지 않는다.

        // 대안 방안
        // StringBuilder, StringBuffer
        // Thread safe 하냐 안하냐의 차이이다.
        // StringBuilder: Thread safe X
        // StringBuffer: Thread safe O      - 동기화를 지원해주기 때문에 속도가 StringBuilder보다 느리다.
        System.out.println("======================================");
        System.out.println("StringBuilder");
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb.hashCode());
        sb.append(" world");
        System.out.println(sb.hashCode());
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);
        int wIndex = sb.indexOf("w");
        System.out.println(wIndex);
        sb.replace(0, 5, "Good");
        System.out.println(sb);
    }

}
