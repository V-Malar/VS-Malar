package Week;

import java.util.Scanner;

class Assignment5 {
	static void changeChar() {
		int sum = 0;
		boolean state = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		while (state) {
			try {
				int n = sc.nextInt();
				state = false;
				System.out.println("Square Value: " + (int) Math.pow(n, 2));
			} catch (Exception e) {
				System.out.println("Enter only Number to find SQUARE value..");
				sc.next();
			}
		}
	}

	public static void main(String[] args) {
		changeChar();
	}
}
