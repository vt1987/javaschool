package edu.ctco.school2.home.work.week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cubic {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num;
        String vote;
        do {
            System.out.println("***Cubic number analyzer***");
            System.out.println("Enter the number: ");
            num=enterNumber();
            double root = Math.cbrt(num);
            if (root - Math.round(root) == 0) {
                System.out.println("Cubic number");
            } else
                System.out.println("Non-cubic number");
            System.out.println("Do you want to continue? Press y");
            vote = scanner.next();
        } while (vote.equals("y"));
    }

    public static double enterNumber (){
        double number;
        try {
            number = scanner.nextDouble();
            return number;
        }catch (InputMismatchException e){
            System.out.println("Entered value is not a number");
            return 0;
        }
    }
}



