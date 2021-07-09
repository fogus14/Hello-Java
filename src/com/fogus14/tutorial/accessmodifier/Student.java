package com.fogus14.tutorial.accessmodifier;

public class Student {

    private int studentNum;     // just 변수 선언
    public String name;
    String address;
    protected String phoneNum;

    // 오버로딩...
    public Student() {

    }

    // 생성자를 의도적으로 생성할 시 기본생성자는 자동으로 만들어지지 않는다.
    public Student(int studentNum){
        System.out.println("Student 생성됨.");
        this.studentNum = studentNum;   // 초기화를 한다.
    }

}
