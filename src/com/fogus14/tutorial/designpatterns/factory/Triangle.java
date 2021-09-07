package com.fogus14.tutorial.designpatterns.factory;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("this is triangle.");
    }
}
