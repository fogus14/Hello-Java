package com.fogus14.tutorial.lombok;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToStringTest {

    public static void main(String[] args) {
        List<Member> strings = Arrays.asList(
                new Member(1L, "member1", "010", "email1"),
                new Member(2L, "member2", "010", "email1"),
                new Member(3L, "member3", "010", "email1")
        );

        System.out.println(strings);
    }

}
