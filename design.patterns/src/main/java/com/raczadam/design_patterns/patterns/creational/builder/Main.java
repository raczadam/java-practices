package com.raczadam.design_patterns.patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Student student = new Student.Builder("John Doe", "Unseen University").age(22).build();
        System.out.println(student);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getUniversity());
    }

}
