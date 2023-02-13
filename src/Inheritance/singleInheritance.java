package Inheritance;

 class single {
    int x;
    single() {
        this.x = 10;
    }
    void getx() {
        System.out.println("A" + this.x);
    }
}

class Inheritance {
    int y;
    Inheritance() {
        this.y = 10;
    }
    void gety() {
        System.out.println("B" + this.y);
    }
}

class singleInheritance {
    public static void main(String[] args) {
        single a = new single();
        a.getx();

        Inheritance b = new Inheritance();
        b.gety();
    }

}