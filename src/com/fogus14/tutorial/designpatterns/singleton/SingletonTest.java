package com.fogus14.tutorial.designpatterns.singleton;

import com.fogus14.tutorial.designpatterns.singleton.EagerInitializedSingleton;
import com.fogus14.tutorial.designpatterns.singleton.LazyInitializedSingleton;

public class SingletonTest {

    public static void main(String[] args) {
//        EagerInitializedSingleton singleton1 = new EagerInitializedSingleton();
//        EagerInitializedSingleton singleton2 = new EagerInitializedSingleton();
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());

        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        LazyInitializedSingleton lazySingleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazySingleton2 = LazyInitializedSingleton.getInstance();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

    }

}
