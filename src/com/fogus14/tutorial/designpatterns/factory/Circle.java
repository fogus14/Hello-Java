package com.fogus14.tutorial.designpatterns.factory;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Circle implements Shape {

//    protected Circle() {    }

    @Override
    public void draw() {
        System.out.println("this is circle.");
    }
}
