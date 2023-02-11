package studentDetails;

// Default Method
public class student03 {
    int Id;
    String Name;

    student03() {
        this.Id = 001;
        this.Name = "Giny";
    }

    void display() {
        System.out.println("Student Id : " + this.Id);
        System.out.println("Student Name : " + this.Name);
    }
}

class mainstudent03 {
    public static void main(String[] args) {
        student03 s;
        s = new student03();
        s.display();
    }
}
