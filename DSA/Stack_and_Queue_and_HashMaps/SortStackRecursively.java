package Stack_and_Queue_and_HashMaps;

import java.util.*;

public class SortStackRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements in the stack: ");
        int n = sc.nextInt();
        System.out.println("Enter the stack elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        sortStack(stack);

        System.out.println("Sorted stack (top to bottom):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
        } else {
            int top = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(top);
        }
    }
}

