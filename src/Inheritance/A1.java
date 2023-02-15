package Inheritance;

public class A1 {
    int x;
    A1() {
        this.x = 10;
    }
    void getx() {
        System.out.println("A1 : " + this.x);
    }
}

class  B1 extends A1{
    int y;
    B1() {
        this.y = 19;
    }
    void gety() {
        System.out.println("B1 : " + this.y);
    }
        }
