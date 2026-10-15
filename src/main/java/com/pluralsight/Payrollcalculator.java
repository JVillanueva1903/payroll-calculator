package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    private static java.lang.Object System;

    public static <String, Scanner> void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user's name
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        // Get hours worked (floating point allowed)
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        // Get pay rate (floating point allowed)
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        // Calculate total pay
        double totalPay = hoursWorked * payRate;

        // Display results
        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.printf("Total Pay: $%.2f%n", totalPay);

        input.close();
    }

    public static void setSystem(java.lang.Object system) {
        System = system;
    }
}
