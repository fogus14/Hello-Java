package com.fogus14.tutorial.designpatterns.proxy;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class CalcProxy implements Calc{

    private final Calc calc;

//    public CalcProxy(Calc calc) {
//        this.calc = calc;
//    }

    @Override
    public long sum(int... num) {
        System.out.println("["+ LocalDateTime.now() + "]" + this.getClass().getName() + "- num count: " + num.length);
        return this.calc.sum(num);
    }

}
