package Inheritance;

public class A {
    int x;
    A() {
        this.x = 10;
    }
    void getx() {
        System.out.println(" A : " + this.x);
    }
}

class B extends  A {
    int y;
    B() {
        this.y = 10;
    }
    void gety() {
        System.out.println(" B : " + this.y);
    }
}

class AB {
    public static void main(String[] args) {
        B b = new B();
        b.gety();
        b.getx();
    }
}