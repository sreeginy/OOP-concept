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

        Student Sreeginy;
        System.out.println(Arrays.toString(students));

    }
}
    //class create
    // for every single student have
    class Student {
        int rollno;
        String name;
        float marks;
    }
