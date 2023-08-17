package Week;

import java.util.Scanner;

class Shape {
	double v1, v2;

	public Shape(double v1, double v2) {
		this.v1 = v1 > 0 ? v1 : 1;
		this.v2 = v2 > 0 ? v2 : 1;
	}

	public void area() {
		System.out.println("Area Calculation..");
	}
}

class Square extends Shape {

	public Square(double v1, double v2) {
		super(v1, v2);
		area();
	}

	@Override
	public void area() {
		System.out.println("Area of Square: " + v1 * v1);
	}

}

class Rectangle extends Shape {

	public Rectangle(double v1, double v2) {
		super(v1, v2);
		area();
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle: " + v1 * v2);
	}
}

class Triangle extends Shape {

	public Triangle(double v1, double v2) {
		super(v1, v2);
		area();
	}

	@Override
	public void area() {
		System.out.print("Area of Triangle: ");
		System.out.println((0.5 * v1 * v2) == 0.5 && (0.5 * v1 * v2) < 0 ? "No Triangle" : 0.5 * v1 * v2);
	}
}

public class Done {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value-1: ");
		Integer v1 = sc.nextInt();
		System.out.println("Enter value-2: ");
		Integer v2 = sc.nextInt();
		new Square(v1, v2);
		new Rectangle(v1, v2);
		new Triangle(v1, v2);
	}
}
