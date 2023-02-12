package studentDetails;

public class student04 {
    int ID;
    String Name;

    student04(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }
    void display() {
        System.out.println("ID : " + this.ID );
        System.out.println("Name : " + this.Name);
    }
}

class mainstudent04{
    public static void main(String[] args) {
        student04 s;
        s = new student04(1000,"Giny");
        s.display();
    }
}

// student(int ID, String Name) - Parameterized method