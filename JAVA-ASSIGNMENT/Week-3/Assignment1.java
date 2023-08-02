package Week2;

import java.util.Scanner;

class Circle {
	double x, y, d;

	public void calculate(Circle c1, Circle c2) {
		d = Math.sqrt((c2.x - c1.x) * (c2.x - c1.x) + (c2.y - c1.y) * (c2.y - c1.y));
		System.out.println("Distance between POINT-1 & POINT-2: " + d);
	}
}

class Assignment1 extends Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("POINT-1");
		System.out.println("Enter X1 value: ");
		c1.x = sc.nextInt();
		System.out.println("Enter X1 value: ");
		c1.y = sc.nextInt();
		Circle c2 = new Circle();
		System.out.println("POINT-2");
		System.out.println("Enter X1 value: ");
		c2.x = sc.nextInt();
		System.out.println("Enter X1 value: ");
		c2.y = sc.nextInt();
		Assignment1 a = new Assignment1();
		a.calculate(c1, c2);
	}
}
