package com.fogus14.tutorial.extendsclass;

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Animal("동물1");
        System.out.println(animal1);
        Animal animal2 = new Animal("동물1");

        // 형변환
        A b = new B();  // 자동 형변환, 묵시적 형변환 ( 원래는 A b = (A) new B(); )
//        B b = new B();
        B b2 = (B)b;    // 강제적 형변환, 명시적 형변환
//        b.bMethod();
        b.aMethod();
        b2.aMethod();
        b2.bMethod();

        A a = new A();
//        B a1 = (B) a;     // IDE가 체크를 잘 못 해준다.
//        a1.bMethod();     // 강제 형변환 실패! 본체가 A클래스 이기 때문에!

        // toString
        System.out.println(animal1.equals(animal2));


        // instanceof   => 일종의 키워드. == 처럼 타입이 같은지를 판단해주는 연산자?!
        System.out.println(animal1 instanceof Animal);
        System.out.println(animal1.equals("ssss"));
        System.out.println(animal1.equals(null));
        System.out.println(animal1 == animal2);
        // equals는 객체를 비교하고, ==는 메모리주소를 비교!
    }

}
