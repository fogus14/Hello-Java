package com.fogus14.tutorial.reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ComstructorTest {
    public static void main(String[] args) {
        // 클래스 뽑아내기...
//        String name = ForReflectionClassA.class.getName();
//        System.out.println(name);
//        new ForReflectionClassA();
        try {
            Class<ForReflectionClassA> forReflectionClassA = (Class<ForReflectionClassA>) Class.forName("com.fogus14.tutorial.reflectiontest.ForReflectionClassA");
            Constructor<ForReflectionClassA> declaredConstructor = forReflectionClassA.getDeclaredConstructor(String.class);
            Constructor<ForReflectionClassA> declaredConstructor2 = forReflectionClassA.getDeclaredConstructor(String.class, String.class);
            ForReflectionClassA forReflectionClassA1 = declaredConstructor.newInstance("1L");
            ForReflectionClassA forReflectionClassA2 = declaredConstructor2.newInstance("1L", "래현");
            System.out.println(forReflectionClassA1);
            System.out.println(forReflectionClassA2);

            ForReflectionClassA forReflectionClassA3 = ForReflectionClassA.class.getDeclaredConstructor(String.class).newInstance("2L");
            System.out.println(forReflectionClassA3);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
