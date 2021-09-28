package com.fogus14.tutorial.stream;

import java.util.Arrays;
import java.util.List;

public class StudentStreamTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("stu1", 10),
                new Student("stu2", 20),
                new Student("stu3", 30),
                new Student("stu4", 40)
        );

        // forEach문
        students.stream().forEach(System.out::println);
        System.out.println("-------------------------");

        // sum
        System.out.println(students.stream().mapToInt(Student::getAge).sum());

        // 이전방식의 코드!
//        int sum = 0;
//        for (Student student : students) {
//            sum += student.getAge();
//        }
//        System.out.println(sum);

        // average
        double average = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElseThrow(() -> new RuntimeException("에러발생"));
        System.out.println(average);

        // filter
        int sum = students.stream().filter(s -> s.getAge() >= 30).mapToInt(Student::getAge).sum();

        // 이전 방식..
        int sum2 = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getAge() >= 30) {
                sum2 += student.getAge();
                count++;
            }
        }
        double avg = sum2 / count;
        System.out.println(avg);

        System.out.println(sum);
    }
}
