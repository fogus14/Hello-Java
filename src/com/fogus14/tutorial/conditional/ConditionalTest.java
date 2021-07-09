package com.fogus14.tutorial.conditional;

public class ConditionalTest {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
//        int a = 6;

        switch (a) {    // switch문은 break문으로 끊어주지 않으면 쭉 산출되어버린다
            case 0:
                System.out.println(0);
                break;
            case 1:
            System.out.println(1);
                break;
            case 2:
            System.out.println(2);
                break;
            case 3:
            System.out.println(3);
                break;
            case 4:
            System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("error");

        }
    }
}
