package ArraysProblems;

import java.util.*;

public class NumberAnalysis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		for (int num : numbers) {
			if (num > 0) {
				if (num % 2 == 0) {
					System.out.println(num + " is a positive even number");
				} else {
					System.out.println(num + " is a positive odd number");
				}
			} else if (num < 0) {
				System.out.println(num + " is a negative number");
			} else {
				System.out.println("The number is zero");
			}
		}

		if (numbers[0] == numbers[4]) {
			System.out.println("First and last elements are equal");
		} else if (numbers[0] > numbers[4]) {
			System.out.println("First element is greater than the last element");
		} else {
			System.out.println("First element is less than the last element");
		}
	}
}
