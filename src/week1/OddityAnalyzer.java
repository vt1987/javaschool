package week1;

public class OddityAnalyzer {
    public static void main(String[] args) {
        int parameterCount = args.length;
        if (parameterCount > 1) {
            System.out.println("Expected 1 parameter, but found " + parameterCount);
            return;
        }

        int number = Integer.parseInt(args[0]);
        boolean even = number % 2 == 0;
        System.out.println("Number " + number + " is " + (even ? "even" : "odd"));
    }
}
