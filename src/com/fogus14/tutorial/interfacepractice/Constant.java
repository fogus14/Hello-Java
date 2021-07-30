package com.fogus14.tutorial.interfacepractice;

public enum Constant {

    a(10);

    Constant(int age) {
        this.age = age;
    }

    private int age;

    public int getAge() {
        return this.age;
    }

}
