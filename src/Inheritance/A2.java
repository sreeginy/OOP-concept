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
