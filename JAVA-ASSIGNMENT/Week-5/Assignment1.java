package Week2;

import java.util.Scanner;

public class Assignment1 {
	public static void divide_by_zero(int n1, int n2) throws ArithmeticException {
		System.out.println(n2 == 0 ? new ArithmeticException("Divide by zero..ERROR..") : "Answer: " + n1 / n2);
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		Integer n1 = sc.nextInt();
		System.out.println("Enter 1st number: ");
		Integer n2 = sc.nextInt();
		divide_by_zero(n1, n2);
	}
}
