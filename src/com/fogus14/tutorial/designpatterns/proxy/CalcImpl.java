package com.fogus14.tutorial.designpatterns.proxy;

public class CalcImpl implements Calc{

    @Override
    public long sum(int... num) {
        long total = 0;
        for (int a : num) {
            total += a;
        }
        return total;
    }

}
