package com.fogus14.tutorial.abstractpractice;

public class Main {
    public static void main(String[] args) {
////        Animal animal = new Animal(); // 추상클래스는 실체화가 불가능하다!
        // <익명 클래스>
//        Animal animal = new Animal() {
//            @Override
//            public void say() {
//                System.out.println("hi hello");
//            }
//        };
//
//        animal.say();

       Animal dog1 = new Dog();
       Animal cat1 = new Cat("덕배");
       dog1.say();
       dog1.eat();
       cat1.say();
       cat1.eat();


    }
}
