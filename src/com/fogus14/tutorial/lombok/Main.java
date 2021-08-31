package com.fogus14.tutorial.lombok;

public class Main {

    public static void main(String[] args) {
        Team teamA = new Team(1L, "teamA");

        Member member = new Member(
                1L,
                "member",
                "010-0000-1234",
                "test@gmail.com",
                teamA);

        Member member2 = new Member(
                1L,
                "member1(HI)",
                "010-0000-1234",
                "test@gmail.com",
                teamA);


        member.setName("member1");
        teamA.getMembers().add(member);
        System.out.println(member.getName());
        System.out.println(member.getId());
        System.out.println(member.getPhoneNumber());
        System.out.println(member.getEmail());
        System.out.println(member);


        System.out.println("====================================");
        System.out.println(teamA);

        System.out.println("====================================");
        System.out.println("equals and hashcode");
        System.out.println(member.equals(member2));
    }

}
