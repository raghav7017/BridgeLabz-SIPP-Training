package ControlFlow;
import java.util.*;
public class checkDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num % 5 == 0) {
            System.out.println("The Number " + num + " is divisible by 5");
        }
         sc.close();
    }
}