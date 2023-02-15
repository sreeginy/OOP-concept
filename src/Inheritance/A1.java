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

class C1 extends B1 {
    int z;
    C1() {
        this.z = 60;
    }
    void getz() {
        System.out.println("C1 : " + this.z);
    }
}

class A1B1C1 {
    public static void main(String[] args) {
        C1 c = new C1();

        c.getx();
        c.gety();
        c.getz();
    }
}