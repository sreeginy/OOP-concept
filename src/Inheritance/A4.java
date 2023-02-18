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

class C4 extends A4 {
    int z;
    C4(int x, int z) {
        super(x);
        this.z = z;
    }
    void getz() {
        System.out.println("C4 : " + this.z);
    }

}

class A4B4C4 {
    public static void main(String[] args) {
        C4 c = new C4(50,80);
        B4 b = new B4(20,0);

        c.getx();
        b.gety();
        c.getz();
    }
}