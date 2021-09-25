package com.fogus14.tutorial.lang.string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringMethodsTest {
    public static void main(String[] args) {
        String str = "abcdef";

        // charAt : n번째 글자를 호출
        System.out.println(str.charAt(1));

        // getBytes : byte형태로 변환
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);

        // valueOf : string형태로 변환
        String s = String.valueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s);

        // codePointAt : n번째 문자의 유니코드화
        int aInt = str.codePointAt(0);
        System.out.println(aInt);

        // split : 분류기준을 지정하면 기준에 따라 문자를 분류해 줌
        String str2 = "a-b-c-d-e";
        String[] str2Split = str2.split("-");
        for (String s1 : str2Split) {
            System.out.println(s1);
        }

        // concat : 문자열을 이어줌
        String strConcat = str.concat("ghijk");
        System.out.println(str);
        System.out.println(strConcat);

        // indexOf : 해당 문자의 위치 칸수를 알려줌
        System.out.println(str.indexOf("b"));

        // contentEquals : 비교 지정된 StringBuffer를이 문자열로 사용
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(str.contentEquals(sb));

        // join : delimiter를 기준으로 요소들을 이어줌
        String joinStr = String.join("-", "a", "b", "c", "d");
        System.out.println(joinStr);

        // toUpperCase : 대문자로 변환
        System.out.println("abc".toUpperCase(Locale.ROOT));

        // toLowerCase : 소문자로 변환
        System.out.println("ABC".toLowerCase(Locale.ROOT));

        // trim : 문자열 좌우의 공백 제거
        System.out.println("         abc ".trim());

        // replace : target을 replacement의 요소로 바꾸어 줌 / 원형은 바뀌지 않는다.
        String str3 = "Java is Good";
        String replace = str3.replace("Good", "Great");
        System.out.println(str3);
        System.out.println(replace);

    }
}
