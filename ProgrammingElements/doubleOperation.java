
package ProgrammingElements;
import java.util.*;

public class doubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double res1 =  a + b *c;
        double res2 = a * b + c;
        double res3 =  c + a / b;
        double res4 = a % b + c;
        
        System.out.println(" The results of Double Operations are " + res1 +"," + res2 + "," + res3 +"," + res4);
        sc.close();
        
    }
}