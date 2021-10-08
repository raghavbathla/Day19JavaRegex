package javaRegex;

public class UserRegestrationMain {
    public static void main(String[] args) {
        Verify verify  = new Verify();
        System.out.println("Enter the first name");
        String fName = verify.validName();
        System.out.println("Enter the last name");
        String lName = verify.validName();
    }
}
