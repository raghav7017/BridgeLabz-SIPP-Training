package ControlFlow;
import java.util.*;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0){
            if(n%3==0) {
                System.out.println("Fizz");
            }
             if(n%5==0) {
                System.out.println("Buzz");
            }
            if(n%3==0 && n%5 ==0){
                System.out.println("FizzBuzz");
            }
        }
        else{
            System.out.println("Enter a Positive integer");
        }
         sc.close();
    }
}