package com.fogus14.tutorial.designpatterns.decorator;

public class ChristmasTreeImpl implements ChristmasTree{
    @Override
    public String decorate() {
        return "기본 크리스마스 트리";
    }
}
