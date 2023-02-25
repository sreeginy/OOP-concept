package Inheritance;

public class Students {
    int id;
    String name;

    void setStudents() {
        this.id = 1000;
        this.name = "Giny";

    }
    void setStudents(int id)  {
        this.id = id;
        this.name = "Jos";
    }

    void setStudents(String name) {
        this.id = 2000;
        this.name = name;
    }

    void  setStudents(int id, String name ) {
        this.id = id;
        this.name = name;
    }
    void setdisply() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
    }
}

class mainStudents {
    public static void main(String[] args) {
        Students s = new Students();

        s.setStudents();
        s.setdisply();

        Students s2 = new Students();
        s2.setStudents(6000);
        s2.setdisply();

        Students s3 = new Students();
        s3.setStudents("Giny");
        s3.setdisply();

        Students s4 = new Students();
        s4.setStudents(5000,"Jos");
        s4.setdisply();

        Students s5 = new Students();
        s5.setStudents(2000,"Ram");
        s5.setdisply();

    }
}
