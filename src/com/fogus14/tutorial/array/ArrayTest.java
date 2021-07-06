package com.fogus14.tutorial.array;

public class ArrayTest {

    public static void main(String[] args) {
        // 이차원 배열 : 방안에 방이 있다
        int[][] a = new int[5][5];
        // 접근 방법
        System.out.println(a[0][0]);    // 0번째 인덱스에 0번째 인덱스에 접근하겠다.
        System.out.println(a[0][1]);    // 0번째 인덱스에 0번째 인덱스에 접근하겠다.

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = i + j;
                System.out.println(a[i][j]);
            }
        }
    }
}