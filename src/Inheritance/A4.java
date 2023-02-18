package Inheritance;

public class A4 {
    int x;
    A4 (int x) {
        this.x = x;
    }
    void getx() {
        System.out.println("A4 : " + this.x);
    }
}

class B4 {
    int y ;
    B4(int y, int x) {
        super();
        this.y = y;
    }
    void gety() {
        System.out.println("B4 : " + this.y);
    }
}