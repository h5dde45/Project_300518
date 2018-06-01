package com.jc.p1.t15;

public class Person {
    private String name;
    private Double grade;

    public Person(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
