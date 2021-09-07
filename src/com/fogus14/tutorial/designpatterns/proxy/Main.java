package com.fogus14.tutorial.designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        Calc calcImpl = new CalcImpl();
        long sum1 = calcImpl.sum(1, 1, 1, 1, 1);
        System.out.println(sum1);

        System.out.println();

        // Proxy
        Calc proxyCalc = new CalcProxy(calcImpl);
        long sum2 = proxyCalc.sum(1, 1, 1, 1, 1);
        System.out.println(sum2);

    }
}
