package Inheritance;

public class A5 {
    int x;
    A5(int x) {
        this.x = x;
    }
    void  display() {
        System.out.println("A5 : " + this.x);
    }
}

class B5 {
    int y;
    B5(int y, int x) {
        super();
        this.y = y;
    }
    void display() {
        System.out.println("B5 : " + this.y);
//        super.display();
    }
}

class A5B5 {
    public static void main(String[] args) {
        B5 b = new B5(10,5);
        b.display();
    }
}