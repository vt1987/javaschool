package week3;

public class Lesson5 {

    private int privateVariable;

    protected int PROTECTED_CONST = 100;

    final double PACKAGE_PRIVATE_CONST = 10.0;

    public int PUBLIC_VARIABLE = 100;

    public static void main(String[] args) {
    }

    protected void oneProtectedMethod() {
        System.out.println("Protected method called");
    }

    void packagePrivateMethod() {
        System.out.println("Package-private method was called");
    }

    public void getNewNumber(int d) throws NegativeNumberException {
        if (d < 0) {
            throw new NegativeNumberException("Negative numbers are restricted!");
        }

    }

    public class NegativeNumberException extends Exception {
        public NegativeNumberException(){};

        public NegativeNumberException(String message) {
            super(message);
        }
    }

}
