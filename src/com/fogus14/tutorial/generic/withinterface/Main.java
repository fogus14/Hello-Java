package com.fogus14.tutorial.generic.withinterface;

public class Main {
    public static void main(String[] args) {
        // 인터페이스만으로는 인스턴스화가 안된다!
        // 제네릭클래스 이지만 제네릭을 사용하지 않고 인스턴스화.
//        GenericInterface<String> stringGenericInterface = new GenericInterface<>();
        GenericInterface genericInterface = new GenericInterfaceImpl("a");  // 다형성 활용(상위클래스형으로!..)
        // GenericInterface에 있는 method, attributes만 사용이 가능하다.
        // 따라서 GenericInterfaceImpl에 있는 method와 attributes를 사용하려면 형변환을 해야한다.
        GenericInterfaceImpl genericInterface1 = (GenericInterfaceImpl) genericInterface;
        genericInterface1.setData("");

        // 제네릭을 사용한 클래스
        GenericInterfaceImpl<String> stringGenericInterface = new GenericInterfaceImpl<>("");
        stringGenericInterface.setData("래현 화이팅!");
        String t = stringGenericInterface.getT();
        System.out.println(t);
    }
}
