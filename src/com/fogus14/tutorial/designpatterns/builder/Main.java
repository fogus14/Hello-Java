package com.fogus14.tutorial.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
//        new User();

//        User user = new User();
//        User.Builder builder = user.new Builder();
//        System.out.println(builder.a);

        User user = User.builder()
                .id(1L)
//                .email("Test@gmail.com")
//                .password("1234")
                .phoneNum("010-2i93-2982")
                .build();

        System.out.println(user.getPassword());
//        System.out.println(user.getTest().a);

    }
}
