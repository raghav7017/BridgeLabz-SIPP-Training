
package ControlFlow;
import java.util.*;
public class smallest { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if((number1 < number2) && (number1 < number3)) {
            System.out.println("First number is smallest");
        }else{
            System.out.println("first number is not smallest");
            
        }
        sc.close();
    }
}