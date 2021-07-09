package com.fogus14.tutorial.accessmodifier;

public class HighSchoolStudent extends Student{

    private void testMethod() {
        super.phoneNum = "010-1234-1234";   // protected 이기 때문에 접근이 가능함.
//        super.studentNum  // private이기 때문에 상속 받은 클래스 또한 접근이 불가능하다.

    }

}
