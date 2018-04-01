package week4.domain;

public class MainOld {
    public static void main(String[] args) {
        RegistrationForm r1 = new RegistrationForm("Valentina", "Tonko");
//        r1.firstName = "Valentina";
//        r1.lastName = "Tonko";
        System.out.println(r1);
        RegistrationForm r2 = new RegistrationForm("Vale");
        System.out.println(r2);
        RegistrationForm r3 = new RegistrationForm();
        System.out.println(r3.getFirstName());
    }
}
