package studentDetails;

import javax.naming.Name;
import java.util.Scanner;

public class student {
    int ID;
    String name;
    int Mark01;
    int Mark02;
    int Mark03;
    int total;
    double average;

    void setData(int IDs, String Names) {
        ID = IDs;
        name = Names;
    }

    void setMarks(int Mark01s, int Mark02s, int Mark03s) {
        Mark01 = Mark01s;
        Mark02 = Mark02s;
        Mark03 = Mark03s;
    }

    void setTotal() {
        total = (Mark01 + Mark02 + Mark03);
    }
    void setAverage() {
        average = (total/3);
    }

    void display() {
        System.out.println("Student Id : " + ID);
        System.out.println("Student Name : "+ name);
        System.out.println("Student Total : " + total);
        System.out.println("Student Average : "+ average);
    }
}

class mainstudent{
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
