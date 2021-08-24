package com.fogus14.tutorial.array;

import java.util.Arrays;
import java.util.List;

public class ArraysClassTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "C");
        System.out.println(strings.get(0));
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        String[] strArr = new String[5];
        strArr[0] = "a";
        strArr[1] = "b";
        strArr[2] = "c";
        strArr[3] = "d";
        System.out.println("==========원본============");
        for (String s : strArr) System.out.print(s + " ");

        System.out.println();
        System.out.println("==========얕은 복사============");
        String[] newStrArr = strArr;
        newStrArr[0] = "new";
        for (String s : newStrArr) System.out.print(s + " ");

        System.out.println();
        System.out.println("==========깊은 복사============");
        String[] copyStrArr = Arrays.copyOf(strArr, 4);
        copyStrArr[0] = "real new";
        for (String s : strArr) System.out.print(s + " ");
        System.out.println();
        for (String s : newStrArr) System.out.print(s + " ");
        System.out.println();
        for (String s : copyStrArr) System.out.print(s + " ");


        /////////////////////////////////////////////////////////////////////
        // binarySearch
        /////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("======================binarySearch==========================");
        int[] intArr = new int[10];
        int j = 10;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = j;
            j--;
        }
        for (int i1 : intArr) {
            System.out.print(i1 + " ");
        }
        Arrays.sort(intArr);
        System.out.println();
        System.out.println("=============정렬 후==============");
        for (int i1 : intArr) {
            System.out.print(i1 + " ");
        }
        int i = Arrays.binarySearch(intArr, 1);     // 키는 내가 찾고자하는 값이다
        System.out.println();
        System.out.println("found index: " + i);


    }

}
