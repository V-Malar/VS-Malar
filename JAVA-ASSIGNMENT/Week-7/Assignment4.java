package Week;

import java.util.Scanner;

class Assignment4 {
	static void changeChar() {
		int sum = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the count of numbers: ");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println("Value: " + (i + 1));
				sum += sc.nextInt();
			}
			System.out.println("Sum: " + sum);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public static void main(String[] args) {
		changeChar();
	}
}
