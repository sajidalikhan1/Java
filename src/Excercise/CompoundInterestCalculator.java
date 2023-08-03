package Excercise;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (initial investment): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        scanner.close();

        double amount;
        for (int i = 1; i <= years; i++) {
            amount = principal * Math.pow(1 + rate / compoundFrequency, compoundFrequency * i);
            System.out.printf("Year %d: %.2f%n", i, amount);
        }
    }
}
