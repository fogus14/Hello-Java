package com.fogus14.tutorial.accessmodifier;

public class AccessModifier {

    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student(60201979);
        student.name = "정래현";
        System.out.println(student.name);   // 이런 직접접근 방식은 좋지 않음. 독립성의 부재!

        student.address = "주소";     // default 접근자이기 때문에 접근 가능함. (같은 패키지)

//        student.studentNum    // private 접근자는 자기 자신 클래스만 접근이 가능함.


    }
}
