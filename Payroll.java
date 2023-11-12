package net.javacode;
import java.util.Scanner;

public class Payroll {
    class Employee {
        String EmployeeName;
        int rate;
        int days;
        int hours;
        int GrossSalary;

        public Employee(String Name, int r, int d, int h) {
            EmployeeName = Name;
            rate = r;
            days = d;
            hours = h;
            GrossSalary = calculateGrossSalary();
        }

        public int calculateGrossSalary() {
            return rate * days * hours;
        }
    }

    class Pay {
        int tax;
        int Philhealth;
        int SSS;
        int NetSalary;
        int GrossSalary;
        int TotalDeduction;

        public Pay(int GrossSalary) {
            this.GrossSalary = GrossSalary;
            tax = (int) (0.15 * GrossSalary);
            Philhealth = (int) (0.05 * GrossSalary);
            SSS = (int) (0.02 * GrossSalary);
            TotalDeduction = tax + Philhealth + SSS;
            NetSalary = GrossSalary - TotalDeduction;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Employee Name:");
        String Name = input.nextLine();

        System.out.println("Enter your rate per hour:");
        int r = input.nextInt();

        System.out.println("Enter number of days worked:");
        int d = input.nextInt();

        System.out.println("Enter number of hours worked per day:");
        int h = input.nextInt();

        Payroll payroll = new Payroll();
        Employee employee = payroll.new Employee(Name, r, d, h);
        Pay pay = payroll.new Pay(employee.GrossSalary);

        System.out.println("Employee Name: " + employee.EmployeeName);
        System.out.println("Gross Salary: " + employee.GrossSalary);
        System.out.println("Tax: " + pay.tax);
        System.out.println("Philhealth: " + pay.Philhealth);
        System.out.println("SSS: " + pay.SSS);
        System.out.println("Total Deduction: " + pay.TotalDeduction);
        System.out.println("Net Salary: " + pay.NetSalary);
    }
}