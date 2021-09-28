package com.fogus14.tutorial.designpatterns.decorator;

public class Light implements ChristmasTree{

    private ChristmasTree christmasTree;

    public Light(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return this.christmasTree.decorate() + ": [전구 장식 추가]";
    }
}
