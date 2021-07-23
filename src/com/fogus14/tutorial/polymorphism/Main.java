package com.fogus14.tutorial.polymorphism;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // 다형성을 활용하지 않은 인스턴스화.
        AClass aClass1 = new AClass();
        BClass bClass1 = new BClass();

        // 부모 클래스 타입으로 인스턴스화 하기.
        AClass abClass1 = new BClass(); // 묵시적 형변환.
        abClass1.aMethod();
//        abClass1.bMethod(); // 사용이 불가능하다! 부모 클래스의 메소드만 활용가능...

        // 강제 형변환
        BClass aTobClass1 = (BClass) abClass1;
        aTobClass1.aMethod();
        aTobClass1.bMethod();   // 형변환을 통해서 bMethod 사용 가능! // 형변환을 해주었기 때문에 부모클래스 자식클래스 모두 사용가능

        // 형변환이 오류나는 경우
//        BClass aToBClass2 = (BClass) aClass1;   //IDE에서 오류 체크 못함! Exception 발생!
//        aToBClass2.bMethod();

        // 추상 클래스 메소드 사용하기
        // (1) 상속받은 클래스로 메소드 사용하기
        aClass1.abstractMethod();
        bClass1.abstractMethod();  // 상솏에 상속... 위계를 가진 상속 (단일상속만 가능한것 잊지마!)
        // (2) 익명 클래스로 메소드를 구현한 후 사용하기.
        AAbstract aAbstract1 = new AAbstract() {
            @Override
            public void abstractMethod() {
                System.out.println("익명 클래스로 메서드 구현하기.");
            }
        };
        aAbstract1.abstractMethod();

        // 다형성을 활용한 추상클래스 메서드 사용해보기
        System.out.println("다형성 활용 메서드 실행");
        Vector<AAbstract> vector = new Vector<>();
        vector.add(aClass1);
        vector.add(bClass1);
        polymorphismAbstractMethod(vector);

        // 인터페이스 타입으로 인스턴스화 하기
        // (1) 인터페이스를 구현한 클래스로 메서드 호출해보기
        AInterface aAInterface1 = new AClass();
        AInterface aInterfaceImpl1 = new AInterfaceImpl();
        aAInterface1.aInterfaceMethod();
        aInterfaceImpl1.aInterfaceMethod();
        // (2) 익명 클래스로 메서드를 구현한 후 사용하기
        AInterface aInterface1 = new AInterface() {
            @Override
            public void aInterfaceMethod() {
                System.out.println("익명클래스로 인터페이스 메서드 구현하기");
            }
        };
        aInterface1.aInterfaceMethod();
        // 인터페이스 강제 형변환
        AClass aAInterface1ToAClass = (AClass) aAInterface1;
        aAInterface1ToAClass.aInterfaceMethod();
        aAInterface1ToAClass.aMethod();
//        AClass aInterfaceImpl1ToAClass = (AClass) aInterfaceImpl1;  // 형변환 에러 발생!!

        System.out.println("==================================");
        System.out.println("인터페이스 메서드 다형성을 활용하여 실행");
        // 다형성을 활용한 추상클래스 메서드 사용해보기
        Vector<AInterface> aInterfaceVector = new Vector<>();
        aInterfaceVector.add(aClass1);
        aInterfaceVector.add(bClass1);
        aInterfaceVector.add(aAInterface1);
        aInterfaceVector.add(aInterfaceImpl1);
        aInterfaceVector.add(aInterface1);
        polymorphismInterfaceMethod(aInterfaceVector);
    }

    public static void polymorphismAbstractMethod(Vector<AAbstract> vector) {
        // 향상된 포문
        for (AAbstract aAbstract : vector) {
            aAbstract.abstractMethod();
        }
        // 리스트 포문
//        vector.forEach(AAbstract::abstractMethod);

    }

    public static void polymorphismInterfaceMethod(Vector<AInterface> vector) {
        for (AInterface aInterface : vector) {
            aInterface.aInterfaceMethod();
        }
    }

}
