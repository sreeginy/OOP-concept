package studentDetails;

import java.util.Scanner;

// return keyword used in java
public class student2 {
    int ID;
    String name;
    int Mark01;
    int Mark02;
    int Mark03;


    void setData(int ID, String Name) {
        this.ID = ID;
        this.name = name;
    }

    void setMarks(int Mark01, int Mark02, int Mark03) {
        this.Mark01 = Mark01;
        this.Mark02 = Mark02;
        this.Mark03 = Mark03;
    }

    int setTotal() {
       int total = (Mark01 + Mark02 + Mark03);
       return total;
    }
    double setAverage(int total) {
       double average = (total/3);
       return average;
    }

    void display() {
        System.out.println("Student Id : " + ID);
        System.out.println("Student Name : "+ name);
        int t = this.setTotal();
        System.out.println("Student Total : " + t);
        double a = this.setAverage(t);
        System.out.println("Student Average : "+ a);
    }
}

class mainstudent2{
    public static void main(String[] args) {
        student s;
        s = new student();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student ID : ");
        int ID = sc.nextInt();
        System.out.println("Enter the student Name : ");
        String name = sc.next();
        System.out.println("Enter the student Mark 01 : ");
        int Mark01 = sc.nextInt();
        System.out.println("Enter the student Mark 02 : ");
        int Mark02 = sc.nextInt();
        System.out.println("Enter the student Mark 03 : ");
        int Mark03 = sc.nextInt();

        s.setData(ID,name);
        s.setMarks(Mark01,Mark02,Mark03);
        s.setTotal();
        s.setAverage();
        s.display();
    }
}
