package com.fogus14.tutorial.designpatterns.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton singleton = null;

    private LazyInitializedSingleton() {

    }

    public static LazyInitializedSingleton getInstance() {
//        if (singleton == null) {
//            System.out.println("처음 생성됨.");
//            singleton = new LazyInitializedSingleton();
//        }
//        return singleton;

        // 삼항 연산자 : (조건식) ? true 일 때 : false 일 때
        return singleton == null ? singleton = new LazyInitializedSingleton() : singleton;

    }

}
