package exeption;

import java.util.Scanner;

class Rahul {
	Scanner sc = new Scanner(System.in);
	Integer input, num, temp, last, sum = 0, pow;

	public String armstrong() {
		System.out.println("Enter your number: ");
		input = sc.nextInt();
		num = temp = input;
		pow = input % 10;
		while (temp > 0) {
			last = temp % 10;
			sum = (int) (sum + Math.pow(last, pow));
			temp = temp / 10;
		}
		if (sum == num) {
			return "Armstrong Number";
		} else {
			return "Not an Armstrong Number ";
		}
	}
}

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rahul r = new Rahul();
		System.out.println(r.armstrong());
	}
}
