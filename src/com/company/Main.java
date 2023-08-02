package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static double getOneGroupAverageGPA(List<Student> NewStudents, String grName) {
        double totalGPA = 0.0;
        int count = 0;

        for (Student student : NewStudents) {
            if(student.getGroup().getName() == grName) {
                totalGPA += student.getGpa();
                count++;
            }
        }
        return totalGPA / count;
    }

    public static double getAllGroupAverageGPA(List<Student> NewStudents) {
        double totalGPA = 0.0;
        int count = 0;

        for (Student student : NewStudents) {
                totalGPA += student.getGpa();
                count++;
        }
        return totalGPA / count;
    }

    public static void getStudentMinGPA(List<Student> NewStudents, String grName) {
        double minGPA = 4.0;
        String name = null;

        for (Student student : NewStudents) {
            if(minGPA > student.getGpa()) {
                minGPA = student.getGpa();
                name = student.getName();
            }
        }
        System.out.println(minGPA + " " + " " + name);
    }

    public static void getStudentMinFromAllGroupGPA(List<Student> NewStudents) {
        double minGPA = 4.0;
        String name = null;
        String group = null;

        for (Student student : NewStudents) {
            if(minGPA > student.getGpa()) {
                minGPA = student.getGpa();
                name = student.getName();
                group = student.getGroup().getName();
            }
        }
        System.out.println("Min GPA: " + minGPA + " Name: " + name + " Group:" + group);
    }

    public static void getStudentMaxGPA(List<Student> NewStudents, String grName) {
        double maxGPA = 0.0;
        String name = null;

        for (Student student : NewStudents) {
            if(maxGPA < student.getGpa()) {
                maxGPA = student.getGpa();
                name = student.getName();
            }
        }
        System.out.println(maxGPA + " " + " " + name);
    }

    public static void getStudentMaxFromAllGroupGPA(List<Student> NewStudents) {
        double maxGPA = 0.0;
        String name = null;
        String group = null;

        for (Student student : NewStudents) {
            if(maxGPA < student.getGpa()) {
                maxGPA = student.getGpa();
                name = student.getName();
                group = student.getGroup().getName();
            }
        }
        System.out.println("Max GPA: " + maxGPA + " Name: " + name + " Group:" + group);
    }


    public static void main(String[] args) {
	    Group grA = new Group("A");
        List<Student> students = new ArrayList<>();
        Student st1 = new Student();
        st1.setName("Diana");
        st1.setGroup(grA);
        st1.setGpa(4);

        students.add(st1);

        Student st2 = new Student("Aisulu", 3.4, grA);
        students.add(st2);

        Group grB = new Group("B");
        Student st3 = new Student("Dina", 3.2, grB);
        students.add(st3);
        Student st4 = new Student("Nur", 3.1, grB);
        students.add(st4);
        Student st5 = new Student("Asem", 3.5, grB);
        students.add(st5);

        System.out.println(getOneGroupAverageGPA(students, "B"));
        getStudentMinGPA(students, "B");


        System.out.println("All groupGPA" + getAllGroupAverageGPA(students));
        getStudentMinFromAllGroupGPA(students);


        getStudentMaxGPA(students, "B");

        getStudentMaxFromAllGroupGPA(students);





    }
}
