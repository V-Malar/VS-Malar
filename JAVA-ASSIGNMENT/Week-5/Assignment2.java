package Week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
	public static void input_mismatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < a.length;) {
			try {
				System.out.println("Enter Input values: ");
				a[i] = sc.nextInt();
				i++;
			} catch (InputMismatchException e) {
				sc.next();
			}
		}
		int sum = 0;
		for (Integer value : a) {
			sum += value;
		}

		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) throws Exception {
		input_mismatch();
	}
}
