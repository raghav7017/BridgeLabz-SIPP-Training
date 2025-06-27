package ArraysProblems;

import java.util.*;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Step 4: Input with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for Employee " + (i + 1) + ":");

            double sal = sc.nextDouble();
            double yos = sc.nextDouble();

            if (sal <= 0 || yos < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years of service >= 0. Please re-enter.");
                i--; // Decrement index to retry this employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yos;
        }

        // Step 5: Calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Step 6: Display results
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i]
                    + ", Years of Service = " + yearsOfService[i]
                    + ", Bonus = " + bonus[i]
                    + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\n--- Company Zara Summary ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}
