package Week2;

import java.util.Scanner;

interface Number {
	default int sqrt(int n) {
		return (int) Math.sqrt(n);
	}
}

public class Assignment4 implements Number {
	public void result() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Type: ");
		try {
			n = sc.nextInt();
			System.out.println("Square Root: " + n + " - " + Number.super.sqrt(n));
		} catch (Exception e) {
			new Assignment1().result();
		}
	}

	public static void main(String args[]) {
		new Assignment1().result();
	}
}
