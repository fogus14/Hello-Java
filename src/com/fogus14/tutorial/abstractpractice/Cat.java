package com.fogus14.tutorial.abstractpractice;

public class Cat extends Animal{

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("야옹");
    }
}
