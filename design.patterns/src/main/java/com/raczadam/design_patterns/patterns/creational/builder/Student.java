package com.raczadam.design_patterns.patterns.creational.builder;

public class Student {


    // these are the compulsory parameters we have to specify
    private final String name;
    private final String university;
    // optional parameter
    private final int age;

    private Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return STR."Student{name='\{name}\{'\''}, university='\{university}\{'\''}, age=\{age}\{'}'}";
    }

    public static class Builder {

        private final String name;
        private final String university;
        private int age;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}
