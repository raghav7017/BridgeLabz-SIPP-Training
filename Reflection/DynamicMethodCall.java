import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();

        System.out.print("Enter method (add/subtract/multiply): ");
        String methodName = sc.next();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(math, a, b);

        System.out.println("Result: " + result);
    }
}