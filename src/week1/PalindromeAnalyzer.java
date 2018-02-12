package week1;

public class PalindromeAnalyzer {
    public static void main(String[] args) {
        int parameterCount = args.length;
        if (parameterCount > 1) {
            System.out.println("Expected 1 parameter, but found " + parameterCount);
            return;
        }

        int number = Integer.parseInt(args[0]);
        int reversedNumber = reverseNumber(number);
        boolean isPalindrome = number == reversedNumber;
        System.out.println("Number " + number + " is " + (isPalindrome ? "palindrome" : "just boring number"));
    }

    private static int reverseNumber(int number) {
        int remainder = number;
        int reversedAccumulator = 0;
        while (remainder > 0) {
            int currentDigit = remainder % 10;
            remainder /= 10;
            reversedAccumulator = reversedAccumulator * 10 + currentDigit;
        }

        return reversedAccumulator;
    }
}
