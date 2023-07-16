package test;

import java.util.Scanner;

public class Closed21 {
	static void calculate(int year) {
		int calculate = year % 2;
		switch (calculate) {
		case 1: {
			System.out.println("January: 1 - 31");
			System.out.println("February: 1 - 28");
			System.out.println("March: 1 - 31");
			System.out.println("April: 1 - 30");
			System.out.println("May: 1 - 31");
			System.out.println("June: 1 - 30");
			System.out.println("July: 1 - 31");
			System.out.println("August: 1 - 31");
			System.out.println("September: 1 - 30");
			System.out.println("October: 1 - 31");
			System.out.println("November: 1 - 30");
			System.out.println("December: 1 - 31");
		}
		case 0: {
			System.out.println("January: 1 - 31");
			System.out.println("February: 1 - 29");
			System.out.println("March: 1 - 31");
			System.out.println("April: 1 - 30");
			System.out.println("May: 1 - 31");
			System.out.println("June: 1 - 30");
			System.out.println("July: 1 - 31");
			System.out.println("August: 1 - 31");
			System.out.println("September: 1 - 30");
			System.out.println("October: 1 - 31");
			System.out.println("November: 1 - 30");
			System.out.println("December: 1 - 31");
		}
		default:
			System.out.println("Enter Valid Year..");
		}
	}

	public static void main(String[] args) {
		int year;
		System.out.print("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		try {
			year = sc.nextInt();
			calculate(year);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
