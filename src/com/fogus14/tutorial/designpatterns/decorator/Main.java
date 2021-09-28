package com.fogus14.tutorial.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        ChristmasTree basicTree = new ChristmasTreeImpl();
        System.out.println(basicTree.decorate());

        ChristmasTree lightTree = new Light(new ChristmasTreeImpl());
        System.out.println(lightTree.decorate());

        ChristmasTree starTree = new Star(new ChristmasTreeImpl());
        System.out.println(starTree.decorate());

        ChristmasTree starAndLightTree = new Light(new Light(new Star(new ChristmasTreeImpl())));
        System.out.println(starAndLightTree.decorate());
    }
}
