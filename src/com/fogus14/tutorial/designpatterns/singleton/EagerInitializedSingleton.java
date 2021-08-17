package com.fogus14.tutorial.designpatterns.singleton;

public class EagerInitializedSingleton {

    private static EagerInitializedSingleton singleton = new EagerInitializedSingleton();


    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return singleton;
    }

}
