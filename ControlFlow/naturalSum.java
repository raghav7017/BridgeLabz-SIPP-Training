package ControlFlow;
import java.util.*;

public class naturalSum { 
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int sum2=0;

        if(n >= 0) {
            int sum1  = n* (n+1) /2;

            for(int i=0;i<=n;i++) {
                sum2 += i;
            }
            if(sum1 == sum2) {
                System.out.println("Both results are equal");
            }
        }else{

            System.out.println("Number is not natural");
        }
        sc.close();
    }
}