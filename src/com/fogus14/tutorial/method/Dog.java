package com.fogus14.tutorial.method;

public class Dog {

    // 접근제한자, static, 타입.

    private int age;
    private String name;

    // 클래스 변수
    public static String staticVariable = "Static variable";
//    private static String say = "월월";

    // 생성자는 인스턴스화 될 때 실행되는 것이다!
    public Dog() {
        this.age = 1;
        this.name = "바둑이";
//        this.staticVariable   // 에러발생.

    }

    // 생성자에 오버로딩 개념을 적용. (매개변수가 다르다!)
    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 반환타입  메서드이름(매개변수타입  매개변수명...)
    // 접근제한자는 생략이 가능하다. (default라는 접근제한자가 있기 때문)
    // void : 반환하는 것이 없다.

    // 반환타입과 매개변수가 모두 없는 함수
    public void say() {
        System.out.println("멍멍!");
    }

    // 오버로딩 => 같은 이름을 갖고 있지만, 서로 다른 매개변수 형식을 가지고 있는 메서드를 여러개 정의하는 것.
    public void say(String word) {
        System.out.println(word);
    }

    // 리턴타입이 달라도 매개변수가 같으면 에러가 발생한다. 오버로딩(X)
//    public int say() {
//        return 1;
//    }


    // 반환타입은 없고, 매개변수는 있는 함수
    public void eat(String food) {
        System.out.println(food + "(을)를 먹습니다.");
    }

    // 반환타입이 있고 매개변수가 없는 함수
    public int getAge() {
        return this.age;
    }

    // 반환타입이 있고 매개변수도 있는 함수
    public String getName(String prefix) {
        return prefix + " " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 매개변수를 2개 이상 사용하려면 쉼표(,)를 통해서 사용할 수 있다.
    public String getWords(String word1, String word2) {
        return word1 + word2;
    }

    public static void defaultSay() {
        System.out.println("왈왈");
    }

}
