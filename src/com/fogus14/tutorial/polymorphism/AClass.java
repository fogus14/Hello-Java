package com.fogus14.tutorial.polymorphism;

public class AClass extends AAbstract implements AInterface{

    public void aMethod() {
        System.out.println("aMethod");
    }


    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod");
    }

    @Override
    public void aInterfaceMethod() {
        System.out.println("AClass가 인터페이스 메서드 구현");
    }
}
