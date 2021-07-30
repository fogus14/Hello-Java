package com.fogus14.tutorial.interfacepractice;

public class Main {

    public static int a = 10;

    public static void main(String[] args) {
        int age1 = Main.a;
        int age2 = Eatable.age;     // 클래스 마냥 인터페이스도 . 으로 활용하면 된다!
        int age3 = Constant.a.getAge();

        // 익명 클래스
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("맛있는 건 참을 수 없어.");
            }
        };


        eatable.test("s");
        eatable.eat();

    }
}

