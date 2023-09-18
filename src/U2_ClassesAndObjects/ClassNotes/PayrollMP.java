package U2_ClassesAndObjects.ClassNotes;

import java.util.Scanner;

public class PayrollMP {
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        // this method will get ALL characters typed up until the enter key
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay_rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextInt();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextInt();

        double federalWithholding = (federalTax / 100) * (hours*pay_rate);
        double stateWithholding = (stateTax / 100) * (hours*pay_rate);
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = (hours*pay_rate) - totalDeduction;

        // display the results to the user
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: " + pay_rate);
        System.out.println("Gross Pay: " + hours * pay_rate);
        System.out.println("Deductions:\n\tFederal Withholding (" + federalTax + "%): $" + federalWithholding);
        System.out.println("State Withholding (" + stateTax + "%): $" + stateWithholding);
        System.out.println("Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
