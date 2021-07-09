package com.fogus14.tutorial.accessmodifier.differentpackage;

import com.fogus14.tutorial.accessmodifier.Student;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
//        student.address;  // default 접근자 이기 때문에 다른 패키지에서는 접근이 불가능함.
    }

}
