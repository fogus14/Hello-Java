package com.fogus14.tutorial.generic;

import com.fogus14.tutorial.generic.animal.Animal;
import com.fogus14.tutorial.generic.animal.Cat;
import com.fogus14.tutorial.generic.animal.Dog;
import com.fogus14.tutorial.generic.animal.Rabbit;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // 제네릭을 사용하지 않을 경우!
        Vector vector = new Vector();
        vector.add("Hello world");
        Object o = vector.get(0);   // 우리가 기대한 것은 String이었으나 Object가 나온다.
        String s = (String) vector.get(0);  // 형변환을 일일이 해줘야 하는 불편함이 있다.
        vector.add(123123);     // 숫자도 들어가고,
        vector.add(new Vector<>());     // Vector 객체도 들어가 버리고 아주 그냥 다들어가버린다!
//        (String) s1 = vector.get(2);    // IDE에서 에러를 잡아주지 못한다. 런타임시에 에러가 발생하게 된다.


        // 제네릭을 사용할 경우!
        Vector<String> stringVector = new Vector<>();
        stringVector.add("Hello world");
//        stringVector.add(new Long());      // IDE에서 타입 에러를 체크해준다.
//        stringVector.add(1);      // 1이라는 정수형으로 넣고자 하면 에러 발생! 우리는 제네릭으로 String을 지정해주기로 했기 때문에!!
        stringVector.add("apple");
        String s1 = stringVector.get(0);


        // 도라에몽 주머니!!!
        DoraemonPocket doraemonPocket1 = new DoraemonPocket();
        doraemonPocket1.setData("도라에몽!");
        Object data = doraemonPocket1.getData();
        System.out.println(data);   // Object로 반환이 된다!
        String data1 = (String) doraemonPocket1.getData();  //다시 본 타입으로 사용하려면 형변환을 해야한다.

        DoraemonPocket<Long> doraemonLongPocket1 = new DoraemonPocket<>();
//        doraemonLongPocket1.setData(1);   // 1은 그냥 int이기 때문에 에러 발생!!!
//        doraemonLongPocket1.setData("1");     // String 타입이기 때문에 에러 발생! 우리가 받을 수 있는 파라미터는 long으로 지정을 해두었기 때문!!
        doraemonLongPocket1.setData(1L);
        Long data2 = doraemonLongPocket1.getData();
        System.out.println(data2);


        // 제한된 도라에몽 주머니
//        DoraemonRestrictPocket<Long> doraemonRestrictPocket1 = new DoraemonRestrictPocket<Long>();
        //  Animal을 상속받지 않는 클래스이므로 에러가 발생한다!
        DoraemonRestrictPocket<Animal> animalDoraemonRestrictPocket = new DoraemonRestrictPocket<>();
        DoraemonRestrictPocket<Dog> dogDoraemonRestrictPocket = new DoraemonRestrictPocket<>();
        DoraemonRestrictPocket<Cat> catDoraemonRestrictPocket = new DoraemonRestrictPocket<>();
        DoraemonRestrictPocket<Rabbit> rabbitDoraemonRestrictPocket = new DoraemonRestrictPocket<>();


        // 제네릭 메서드
        GenericMethod genericMethod = new GenericMethod();
        String str1 = genericMethod.boomerang("제네릭 메서드 안녕!");
        Long boomerang = genericMethod.boomerang(1L);


        // 제한된 타입 파라미터 제네릭 메서드
//        genericMethod.animalboomerang("제네릭 안녕?");     // Animal 타입이 아니기 때문에 에러 발생!
//        genericMethod.animalboomerang(1L);       // 마찬가지로 Animal 타입이 아님...
        Dog dog = new Dog();
        dog.setName("바둑이");
        System.out.println(dog.getName());
        Dog dog1 = genericMethod.animalboomerang(dog);
        System.out.println(dog1.getName());
        dog1.setName("흰둥이!");
        System.out.println(dog1.getName());
        System.out.println(dog.getName());
        System.out.println(dog.equals(dog1));       //

        System.out.println("============================================");
        Dog dogA = dog;     // 얕은 복사 (메모리 주소만 참조)
        dogA.setName("흰둥이2");
        System.out.println(dogA.getName());
        System.out.println(dog.getName());
        System.out.println(dog1.getName());

        System.out.println("============================================");
        System.out.println("Vector에서 가져오고 이름 변경해보기");
        Vector<Dog> dogs = new Vector<>();
        dogs.add(dog);
        Dog vectorGetDog = dogs.get(0);
        vectorGetDog.setName("벡터멍멍이");
        System.out.println(vectorGetDog.getName());
        System.out.println(dog.getName());
        System.out.println(dog1.getName());
        System.out.println(dogA.getName());

//        변수 a, b, c => 메모리 주소 참조 : 123
//                a가 바뀌면 123 메모리를 가리키고 있는 b, c 전부 바뀐다.

    }

}
