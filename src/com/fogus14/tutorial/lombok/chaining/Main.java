package com.fogus14.tutorial.lombok.chaining;

public class Main {

    public static void main(String[] args) {

        Member member1 = new Member()
                .setId(1L)
                .setName("member1")
                .setPhoneNumber("010-1234-1234");

    }

}
