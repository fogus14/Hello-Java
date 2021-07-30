package com.fogus14.tutorial.interfacepractice;

public interface Eatable {

    // 인터페이스 attributes 특징.
    // public static은 생략이 가능하다.
    // 생략하면 public static으로 변수 초기화와 할당이 이루어진다.
//    public static int age = 10;
    int age = 10;       // public static은 생략이 가능하다!

    // 인터페이스 attributes 안되는 경우!
//    private int a = 10;   // private는 불가!
//    private static int c;
//    public static int b;  // 선언만 하기는 불가!

    void eat();

    default String test(String name) {
        return "안녕하세요? " + name + "님";
    }

    static void test2 (String bankName) {
        System.out.println("interface static method");
    }

}
