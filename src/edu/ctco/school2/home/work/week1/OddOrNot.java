package edu.ctco.school2.home.work.week1;

import java.util.Scanner;

public class OddOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vote;
        do {
            System.out.println("Let me check your number. Odd or Even");
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Even");
            } else
                System.out.println("Odd");
            System.out.println("Do you want to continue? Press y");
            vote = scanner.next();
        } while (vote.equals("y"));
    }
}
