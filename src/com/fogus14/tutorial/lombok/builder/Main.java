package com.fogus14.tutorial.lombok.builder;

public class Main {

    public static void main(String[] args) {
        Member member1 = Member.builder()
                .id(1L)
                .name("member1")
                .phoneNumber("010-0000-0000")
                .build();
    }

}
