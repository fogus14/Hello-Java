package com.fogus14.tutorial.generic;

import com.fogus14.tutorial.extendsclass.A;

public class Main {
    public static void main(String[] args) {
        StringBox box1 = new StringBox();
        box1.addItem("item1");
        String item = box1.getItem();
        System.out.println(item);

        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setItem(10);
        Integer item1 = genericBox.getItem();
        System.out.println(item1);

        GenericBox<Apple> appleGenericBox = new GenericBox<>();
        Apple apple1 = new Apple();
        appleGenericBox.setItem(apple1);
        Apple appleItem = appleGenericBox.getItem();
        System.out.println(appleItem.getName());
    }
}
