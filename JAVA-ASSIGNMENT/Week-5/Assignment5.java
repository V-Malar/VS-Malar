package Week;

import java.util.InputMismatchException;
import java.util.Scanner;

class Do {
	static Scanner sc = new Scanner(System.in);

	public static void GCD() {
		Integer n1 = 0, n2 = 0;
		boolean step1 = false, step2 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 value: ");
		while (!step1) {
			try {
				n1 = sc.nextInt();
				step1 = true;
			} catch (InputMismatchException e) {
				sc.next();
			}
		}
		System.out.println("Enter n2 value: ");
		while (!step2) {
			try {
				n2 = sc.nextInt();
				step2 = true;
			} catch (InputMismatchException e) {
				sc.next();
			}
		}
		while (n2 != 0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		System.out.println("GCD: " + n1);
	}

	public static void main(String[] args) {
		GCD();
	}
}
