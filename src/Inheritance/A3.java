package Inheritance;

public class A3 {
    int x;
    A3() {
        this.x = 10;
    }
    void getx() {
        System.out.println("A3 : " + this.x);
    }
}

class B3 extends A3 {
    int y;
    B3() {
        this.y = 19;
    }
    void gety() {
        System.out.println("B3 : " + this.y);
    }
}

class C3 extends A3 {
    int z;
    C3() {
        this.z = 60;
    }
    void getz() {
        System.out.println("C3 : " + this.z);
    }
}

class A3B3C3 {
    public static void main(String[] args) {
        C3 c = new C3();
        B3 b = new B3();

        c.getx();
        b.gety();
        c.getz();
    }
}