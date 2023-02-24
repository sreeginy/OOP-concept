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
        
    }
}
