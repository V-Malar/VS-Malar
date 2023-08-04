package Week2;

import java.util.Scanner;

import java.util.Scanner;

public class Assignment5 {
	// Function to calculate the GCD using the Euclidean Algorithm
	public static int calculateGCD(int a, int b) {
		if (a == 0 && b == 0) {
			return -1;
		} else if (b == 0) {
			return a;
		} else if (a == b) {
			return 1;
		} else if (a % b == 0) {
			return b;
		} else {
			if (a % 2 == 0 || b % 2 == 0) {
				return 1;
			} else {
				return a;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		int gcd = calculateGCD(num1, num2);
		System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
	}
}
