package ControlFlow;
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        double total = physics + chemistry + maths;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("Average Mark: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
         sc.close();
    }
}