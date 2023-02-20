package Inheritance;

public class A6 {
    private int x;
    private int y;

    A6() {
        this.x = 10;
    }
    A6(int y) {
        this();
        this.y = y;
    }
    void getx() {
        System.out.println("A6 : " + this.x);
        System.out.println("A6 : " + this.y);
    }
}
