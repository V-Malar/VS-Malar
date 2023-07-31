package exeption;

import java.util.Scanner;

class Rahul {
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI, r;

	public void calculate() {
		System.out.println("Enter the Radius value: ");
		r = sc.nextDouble();
		System.out.println(r < 0 || r == 0 ? "Please enter value greater than 0"
				: "Perimeter: " + 2 * pi * r + "\nArea: " + pi * r * r);
	}
}

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rahul r = new Rahul();
		r.calculate();
	}
}
