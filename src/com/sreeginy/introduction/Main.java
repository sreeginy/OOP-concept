package com.sreeginy.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //store 5 roll numbers
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students: {roll no, name, marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // Just declaring
//        Student Sreeginy;
////        System.out.println(Arrays.toString(students));
//        Sreeginy = new Student();
        Student Sreeginy = new Student();

        Sreeginy.rollno=13;
        Sreeginy.marks=75.5f;
        Sreeginy.name="Giny";

        System.out.println(Sreeginy.rollno);
        System.out.println(Sreeginy.marks);
        System.out.println(Sreeginy.name);

    }
}
    //class create
    // for every single student have
    class Student {
        int rollno;
        String name;
        float marks;
    }
