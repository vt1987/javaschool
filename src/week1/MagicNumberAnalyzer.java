package week1;

public class MagicNumberAnalyzer {
    public static void main(String[] args) {
        int parameterCount = args.length;
        if (parameterCount > 1) {
            System.out.println("Expected 1 parameter, but found " + parameterCount);
            return;
        }

        int number = Integer.parseInt(args[0]);

        boolean isMagicNumber = getSingleDigitSumRecursively(number)==1;
        System.out.println("Number " + number + " is " + (isMagicNumber ? "magic number" : "just boring number"));
    }

    private static int getSingleDigitSumRecursively(int number){
        if (number<10)
            return number;

        return getSingleDigitSumRecursively(getSumOfDigits(number));
    }

    private static int getSumOfDigits(int number){
        int remainder = number;
        int sum = 0;
        while (remainder>0){
            sum+=remainder%10;
            remainder/=10;
        }

        return sum;
    }
}
