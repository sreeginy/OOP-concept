package Inheritance;

public class A2 {
   int x;
   A2(int x) {  //Parameterized constructor
       this.x = x;
   }
   void getx() {
       System.out.println("A2 : " + this.x);
   }

}

class B2 extends  A2 {

  int y;
  B2(int y, int x) {
      super(x);
      this.y = y;
  }
  void gety() {
      System.out.println("B2 : " + this.y);
  }
}

class C2 extends B2 {
    int z;
    C2(int x, int y, int z) {
        super(y,z);
        this.z=z;
    }
    void getz() {
        System.out.println("C2 : " + this.z);
    }
}

class A2B2C2 {
    public static void main(String[] args) {
        C2 c = new C2(10,6,8);

        c.getx();
        c.gety();
        c.getz();
    }
}


