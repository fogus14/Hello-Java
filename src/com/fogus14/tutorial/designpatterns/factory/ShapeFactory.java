package com.fogus14.tutorial.designpatterns.factory;

public class ShapeFactory {

//    public static final String CIRCLE = "circle";
//    public static final String TRIANGLE = "triangle";

    public static Shape from(ShapeType shapeType) {

        if (shapeType.name().equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.name().equals("TRIANGLE")) {
            return new Triangle();
        }

        return null;
    }

}
