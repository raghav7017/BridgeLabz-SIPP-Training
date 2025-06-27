package ControlFlow;
import java.util.Scanner;

public class youngestAndBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        int height1 = sc.nextInt();
        int age2 = sc.nextInt();
        int height2 = sc.nextInt();
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));

        System.out.println(youngest);
        System.out.println(tallest);
         sc.close();
    }
}
