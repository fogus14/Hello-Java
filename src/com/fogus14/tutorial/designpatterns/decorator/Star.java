package com.fogus14.tutorial.designpatterns.decorator;

public class Star implements ChristmasTree{

    private ChristmasTree christmasTree;

    public Star(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return this.christmasTree.decorate() + ": [별 장식 추가]";
    }
}
