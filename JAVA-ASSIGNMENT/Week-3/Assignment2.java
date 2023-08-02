package Week2;

import java.util.Scanner;

class QuestionScope {
	int sum(int a, int b) { // non-static method
		return a + b;
	}

	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter n2: ");
		int n2 = sc.nextInt();

		QuestionScope st = new QuestionScope(); // Create an object to call non-
												// static method
		int result1 = st.sum(n1, n2); // Call the method
		int result2 = QuestionScope.multiply(n1, n2); // Create an object to call
														// static method

		System.out.println("Addition of " + n1 + " + " + n2 + " =  " + result1);
		System.out.println("Multiplication of " + n1 + " x " + n2 + " = " + result2);
	}
}
