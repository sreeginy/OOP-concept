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

class  mainA6 {
    public static void main(String[] args) {
        A6  a = new A6(5);
        a.getx();
    }
}
