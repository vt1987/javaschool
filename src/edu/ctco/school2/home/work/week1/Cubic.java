package edu.ctco.school2.home.work.week1;

import java.util.Scanner;

public class Cubic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vote;
        do {
            System.out.println("***Cubic number analyzer***");
            System.out.println("Enter the number: ");
            double number = scanner.nextDouble();
            double root = Math.cbrt(number);
            if (root - Math.round(root) == 0) {
                System.out.println("Cubic number");
            } else
                System.out.println("Non-cubic number");
            System.out.println("Do you want to continue? Press y");
            vote = scanner.next();
        } while (vote.equals("y"));
    }
}



