package com.fogus14.tutorial.lombok;

public class Member2 {

    private Long id;
    private String name;
    private String phoneNumber;
    private String email;

    public Member2(Long id) {
        this.id = id;
    }


    public static void main(String[] args) {
        Member2 member2 = new Member2(1L);
//        Member2 member21 = new Member2();       // 생성자에 필드 값을 필요로 하도록 만들어주엇다면, 기본 생성자는 자동으로 만들어주지 않아!
    }
}
