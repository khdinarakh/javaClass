package com.company;

public class Student {
    private String name;
    private double gpa;
    private Group group;

    public Student(String name, double gpa, Group group) {
        this.name = name;
        this.gpa = gpa;
        this.group = group;
    }

    public Student(){
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
