package com.fogus14.tutorial.lambda;

public class Main {

    public static void main(String[] args) {
//        MyFunctionalInterface say = new MyFunctionalInterface() {
//            @Override
//            public void say() {
//                System.out.println("말하기");
//            }
//        };

        // 매개변수가 없고 리턴이 없는 함수일 때 람다.
        MyFunctionalInterface say = () -> {
            System.out.println("말하기");
            System.out.println("말하기1");
        };

        // 구현부가 한줄일 때 줄여 쓰는 방법 (꺽새가 사라질 수 있다!!)
        MyFunctionalInterface say2 = () -> System.out.println("말하기");

        // 매개변수가 하나인 함수
        // 매개변수가 하나일 때는 괄호 생략이 가능하다!
//        OneParam say3 = (str) -> System.out.println(str);

        OneParam say3 = str -> System.out.println(str);
        say3.say("래현 다왔어!");

        // 방법! => 클래스::함수명
        // 위에 것을 더 줄이는 방법.
        OneParam say4 = System.out::println;
        OneParam say5 = Main::myFunc;

        // 매개변수가 두개인 람다
        TwoParam saySum = (x, y) -> System.out.println(x + y);
        TwoParam saySum2 = Main::myFunc2;


        // 리턴이 있는 함수
        ReturnInterface sum = (x, y) -> {
            return x + y;
        };
        System.out.println(sum.sum(10, 10));

        // 리턴이 생략 가능한 경우
        ReturnInterface sum2 = (x, y) -> x + y;
        ReturnInterface sum3 = Integer::sum;
        ReturnInterface sum4 = Main::add;

    }

    public static void myFunc(String a) {
        System.out.println(a);
    }

    public static void myFunc2(int a, int b) {
        System.out.println(a + b);
    }

    public static int add(int x, int y) {
        return x + y;
    }

}
