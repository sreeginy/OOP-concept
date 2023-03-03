package Example;

public class Member {
    String firstname;
    String Lasname;
    int age;

    public void talk() {
        System.out.println(firstname+Lasname+age);
    }

    public static void main(String[] args) {
        Member M = new Member();
        M.age = 24;
        M.firstname = "Giny";
        M.Lasname = "Jos";
    }
}
