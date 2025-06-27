package ControlFlow;
import java.util.Scanner;
public class calUsingSwitch {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "*" -> System.out.println(first * second);
            case "/" -> {
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Cannot divide by zero");
                }
            }
            default -> System.out.println("Invalid Operator ");
        }
        sc.close(); 
    }

}
