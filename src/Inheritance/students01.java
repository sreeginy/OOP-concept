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
        
    }
}
