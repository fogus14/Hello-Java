package com.fogus14.tutorial.trycatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        try {
            System.out.println(nums[0]);
            System.out.println(nums[1]);
            System.out.println(nums[2]);
            throw new Exception();
//            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("final");
        }

        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(str);
            System.out.println("자원을 자동으로 종료해줘요.");
        }
    }

}
