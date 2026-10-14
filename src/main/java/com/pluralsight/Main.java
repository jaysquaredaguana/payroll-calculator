package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = getEmployeeName(input);
        double hoursWorked = getHoursWorked(input);
        double payRate = getPayRate(input);

        double grossPay = calculateGrossPay(hoursWorked, payRate);

        displayPayroll(name, grossPay);

        input.close();
    }

    public static String getEmployeeName(Scanner input) {
        System.out.print("Enter employee name: ");
        return input.nextLine();
    }

    public static double getHoursWorked(Scanner input) {
        System.out.print("Enter hours worked: ");
        return input.nextDouble();
    }

    public static double getPayRate(Scanner input) {
        System.out.print("Enter pay rate: ");
        return input.nextDouble();
    }

    public static double calculateGrossPay(double hoursWorked, double payRate) {
        if (hoursWorked > 40) {
            double regularPay = 40 * payRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * payRate * 1.5;

            return regularPay + overtimePay;
        }
        else {
            return hoursWorked * payRate;
        }
    }

    public static void displayPayroll(String name, double grossPay) {
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
    }
}