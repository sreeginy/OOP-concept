package Inheritance;

public class A7 {

    private int x;
    private int y;

    A7() {
        this.x = 10;

    }

    A7(int y) {
        this();
        this.y = y;
    }
    void getx() {
        System.out.println("A7 :" + this.x );
        System.out.println("A7 :" + this.y );
    }
}

class mainA7 {
    public static void main(String[] args) {
        A7 a = new A7(5);
        a.getx();
    }
}
