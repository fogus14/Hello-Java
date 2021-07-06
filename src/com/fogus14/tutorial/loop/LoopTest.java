package com.fogus14.tutorial.loop;

import java.util.ArrayList;
import java.util.List;

public class LoopTest {

    public static void main(String[] args) {
//        boolean flag = true;
        // break, continue
        int num = 0;
        while (num < 10) {
            System.out.println(num);
            if (num % 2 == 0) {
                num++;
                continue;
            }
            num++;
        }
        System.out.println("끝");  // continue문을 만나면 반복문 바깥 처음파트로 이동하게 된다.



        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        // 향상된 for문 => for-each문
        System.out.println("for-each");
        for (Integer item : list) {
            if (item == 2) {
                continue;
            }
            System.out.println(item);
        }

    }
}
