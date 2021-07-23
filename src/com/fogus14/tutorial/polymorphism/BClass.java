package com.fogus14.tutorial.polymorphism;

public class BClass extends AClass{
    // 상속할 때는 extends라고 하는 키워드를 사용한다.
    // 자바는 단일 상속만 가능하다.

    public void bMethod() {
        System.out.println("bMethod");
    }

    @Override
    public void aInterfaceMethod() {
        System.out.println("BClass가 aInterfaceMethod 오버라이드. (AClass가 정의한 메서드 무시됨)");
    }
}
