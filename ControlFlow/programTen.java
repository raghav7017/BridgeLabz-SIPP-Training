package ControlFlow;
import java.util.Scanner;

public class programTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }
            sum += num;
        }

        System.out.println("The sum of all entered natural numbers is: " + sum);
        sc.close();
    }
}