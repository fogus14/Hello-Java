package com.fogus14.tutorial.designpatterns.factory;

public class Main {
    public static void main(String[] args) {

        Shape circle1 = ShapeFactory.from(ShapeType.CIRCLE);
        circle1.draw();
        Shape triangle = ShapeFactory.from(ShapeType.TRIANGLE);
        triangle.draw();

//        System.out.println(ShapeType.CIRCLE.name());

    }
}
