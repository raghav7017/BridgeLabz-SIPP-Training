package ControlFlow;
import java.util.*;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n= sc.nextInt();
        System.out.println("Factorial of " + n + " is :" );

        int fact = 1 ;

        if(n > 0) {
            while(n>0) {
                fact = fact * n ;
                n--;
            }
        }
        System.out.println(fact);
         sc.close();
    }
     
}