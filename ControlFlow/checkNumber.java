package ControlFlow;
import java.util.*;
public class checkNumber { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if( n >0 ){
            System.out.println("positive");
        }
        else if(n == 0) {
            System.out.println("zero");
        }else {
            System.out.println("negative");
        }
         sc.close();

    }
}