package com.fogus14.tutorial.lang.string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringMethodsTest {
    public static void main(String[] args) {
        String str = "abcdef";

        // charAt
        System.out.println(str.charAt(1));

        // getBytes
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        // valueOf
        String s = String.valueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s);

        // codePointAt
        int aInt = str.codePointAt(0);
        System.out.println(aInt);

        // split
        String str2 = "a-b-c-d-e";
        String[] str2Split = str2.split("-");
        for (String s1 : str2Split) {
            System.out.println(s1);
        }

        // concat
        String strConcat = str.concat("ghijk");
        System.out.println(str);
        System.out.println(strConcat);

        // indexOf
        System.out.println(str.indexOf("b"));

        // contentEquals
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(str.contentEquals(sb));

        // join
        String joinStr = String.join("-", "a", "b", "c", "d");
        System.out.println(joinStr);

        // toUpperCase
        System.out.println("abc".toUpperCase(Locale.ROOT));

        // toLowerCase
        System.out.println("ABC".toLowerCase(Locale.ROOT));

        // trim
        System.out.println("         abc ".trim());

        // replace
        String str3 = "Java is Good";
        String replace = str3.replace("Good", "Great");
        System.out.println(str3);
        System.out.println(replace);

    }
}
