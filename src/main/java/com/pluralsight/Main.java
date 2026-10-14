package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();

        double grossPay;

        if (hoursWorked > 40) {
            double regularPay = 40 * payRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * payRate * 1.5;

            grossPay = regularPay + overtimePay;
        }
        else {
            grossPay = hoursWorked * payRate;
        }

        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        input.close();
    }
}