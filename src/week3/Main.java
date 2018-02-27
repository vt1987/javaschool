package week3;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = readNumber();
        System.out.println("Your number is: " + num);
    }

    public static int readNumber() {
        boolean error = false;
        int result;
        do {
            if (error) {
                System.out.println("Wrong input. Number from 1 to 100 is expected");
            }

            System.out.println("Enter a number from 1 to 100");
            result = scanner.nextInt();

            if (result < 1 || result > 100) {
                error = true;
            } else {
                error = false;
            }
        } while (error);

        return result;
    }
}