package test;

import java.util.Scanner;

public class Closed15b {
	static String armstrong(int input) {
		int num, temp;
		num = temp = input;
		int last, sum = 0;
		int count = String.valueOf(temp).length();
		while (temp > 0) {
			last = temp % 10;
			sum += Math.pow(last, count);
			temp = temp / 10;
		}
		if (sum == num) {
			return "Armstrong Number";
		} else {
			return "Not an Armstrong Number ";
		}
	}

	static String perfect(int a) {
		int sum = 0, i = 1;
		while (i < a) {
			if (a % i == 0)
				sum = sum + i;
			i++;
		}
		if (sum == a)
			return "Perfect Number";
		else
			return "Not a Perfect Number";
	}

	static String palindrome(int num) {
		StringBuilder input = new StringBuilder(String.valueOf(num));
		if ((input.toString()).equals((input.reverse().toString()))) {
			return "Palindrome";
		} else {
			return "Not Palindrome";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		input = sc.nextInt();
		System.out.println(armstrong(input));
		System.out.println(perfect(input));
		System.out.println(palindrome(input));
	}

}
