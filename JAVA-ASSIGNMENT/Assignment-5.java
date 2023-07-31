package exeption;

import java.util.Scanner;

class Rahul {
	Scanner sc = new Scanner(System.in);
	Integer n1, n2, n3;

	public void large() {
		System.out.println("Enter first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		n2 = sc.nextInt();
		System.out.println("Enter third number: ");
		n3 = sc.nextInt();
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("n1 is biggest");
			}
		} else if (n2 > n3) {
			System.out.println("n2 is biggest");
		} else {
			System.out.println("n3 is biggest");
		}
	}
}

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rahul r = new Rahul();
		r.large();
	}
}
