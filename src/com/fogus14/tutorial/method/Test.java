package com.fogus14.tutorial.method;

public class Test {

    public void say() {
        System.out.println("Hi hello");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.say();

        Dog dog = new Dog();    // 인스턴스화
        dog.say();
        dog.eat("개껌");
        String food = "고급 개껌";
        dog.eat(food);

        int age = dog.getAge();
        System.out.println(age);

//        String name = dog.getName("존나 쎈");
//        System.out.println(name);
        System.out.println(dog.getName("존나 쎈"));

        String words = dog.getWords("A", "B");
        System.out.println(words);

        Dog.defaultSay();
        System.out.println(Dog.staticVariable);
        System.out.println(dog.staticVariable);
        Dog.staticVariable = "change static variable";
        System.out.println(Dog.staticVariable);
        System.out.println(dog.staticVariable);

        Dog dog2 = new Dog(10, "흰둥이");
        System.out.println("dog1:" + dog.getAge() + " " + dog.getName());
        System.out.println("dog2:" + dog2.getAge() + " " + dog2.getName());
    }



}
