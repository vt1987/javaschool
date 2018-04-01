package week4.domain;

public class RegistrationForm {

    private String firstName;
    private String lastName;


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public RegistrationForm(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public  RegistrationForm (String firstName){
        this(firstName, "NA");
//        this.firstName = firstName;
//        this.lastName = "NA";
    }
    public RegistrationForm(){
        this("NA");
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
