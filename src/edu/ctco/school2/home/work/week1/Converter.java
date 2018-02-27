package edu.ctco.school2.home.work.week1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Converting miles to kilometers");
        System.out.println("Enter mileage value in miles: ");
        Scanner scanner = new Scanner(System.in);
        double mile = scanner.nextDouble();
        double km = 1.60934 * mile;
        System.out.println(String.format("Mileage in km: " + km));

    }
}
