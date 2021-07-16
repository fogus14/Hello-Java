package com.fogus14.tutorial.extendsclass;

import java.util.Objects;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }


//      <직접 재정의한 코드>
//    @Override   // 덮어쓰기... 재정의...
//    public String toString() {
//        return "동물클래스. 이름: " + this.name;
//    }
//
//    @Override   // annotation == 주석같은 느낌... 생략해도 오버라이드 가능하긴 하다. +) Spring 등에서는 annotation이 주석같은 느낌으로 사용되는 것은 아니야!!
//    public boolean equals(Object obj) {
//        boolean result = false;
//        if (obj instanceof Animal) {
//            Animal animal = (Animal) obj;
//            result = this.name.equals(animal.name);
//        }
//        return result;
//    }


    // <IDE가 재정의해준 코드>
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
