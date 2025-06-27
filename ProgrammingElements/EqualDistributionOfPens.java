
package ProgrammingElements;
import java.util.*;

public class EqualDistributionOfPens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of pens :");
        int totalPens = sc.nextInt();
        System.out.print("Number of students :");
        int students = sc.nextInt();

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students; 

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
        sc.close();
    }
}