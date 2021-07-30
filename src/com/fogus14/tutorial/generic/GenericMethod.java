package com.fogus14.tutorial.generic;

import com.fogus14.tutorial.generic.animal.Animal;

public class GenericMethod {

    // 메서드에서 제네릭 사용하기
    // 순서!! 접근제한자 - 사용할제네릭변수 - 리턴타입 - 메서드명 - (매개변수타입 매개변수)
    public <T> T boomerang(T t) {
//        T a = (T) "a";
        return t;
    }

    // overloading
    public <T extends Animal> T animalboomerang(T t) {
        return t;
    }



}
