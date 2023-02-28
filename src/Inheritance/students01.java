package Inheritance;

public class students01 {
    int id;
    String name;

    students01() {

        this.id =1000;
        this.name="Giny";
    }
    students01(int id) {
        this.id = id;
        this.name ="Jos";
    }

    students01(String name) {
this.id = 2000;
this.name = name;
    }
    students01(String name, int id) {
        this.id = id;
        this.name=name;
    }
    students01(int id, String name) {
        this.id = id;
        this.name =name;

    }

    void  setdisplay() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
    }

    class mainstudents01{
        public static void main(String[] args) {

            students01 s = new students01() ;
            s.setdisplay();

            students01 s1 = new students01();
            s1.setdisplay();

            students01 s2 = new students01();
            s2.setdisplay();

            students01 s3 = new students01();
            s3.setdisplay();

            students01 s4 = new students01();
            s4.setdisplay();
        }
    }
}
