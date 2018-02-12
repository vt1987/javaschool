package week1;

public class CubeAnalyzer {
    public static void main(String[] args) {
        int parameterCount = args.length;
        if (parameterCount > 1) {
            System.out.println("Expected 1 parameter, but found " + parameterCount);
            return;
        }

        long number = Long.parseLong(args[0]);
        long guess = Math.round(Math.pow(number, 1.0 / 3));
        boolean isCube = guess * guess * guess == number;
        System.out.println("Number " + number + " is " + (isCube ? ("cube of " + guess) : "not cube"));
    }
}
