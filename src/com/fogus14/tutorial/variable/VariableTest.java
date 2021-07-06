package com.fogus14.tutorial.variable;

public class VariableTest {

    public static void main(String[] args) {
        final int a = 10;
        // a = 20;

        int b = 10;
        b += 10;    // b = b+10;과 동일한 의미
        System.out.println(b);

        b -= 10;
        b *= 10;    // b = b*10;
        System.out.println(b);

        b /= 10;
        System.out.println(b);


        // 삼항 연산자
        boolean flag = false;
        int c = flag ? 10 : 20;
        System.out.println(c);

    }

}
