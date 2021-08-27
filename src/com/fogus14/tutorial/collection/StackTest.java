package com.fogus14.tutorial.collection;

import java.util.AbstractList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("===============================");
        System.out.println("============pop=============");

        // pop
        Integer pop1 = stack.pop();
        System.out.println(pop1);
        System.out.println(stack);

        System.out.println("===============================");
        System.out.println("============peek=============");

        // peek
        Integer peek1 = stack.peek();
        System.out.println(peek1);
        System.out.println(stack);

        System.out.println("===============================");
        System.out.println("==========contains==========");

        // contains
        // 객체가 들어 있는지 없는지 boolean type으로 반환함.
        boolean contains1 = stack.contains(2);
        System.out.println(contains1);

        System.out.println("===============================");
        System.out.println("==========empty==========");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }


    }

}
