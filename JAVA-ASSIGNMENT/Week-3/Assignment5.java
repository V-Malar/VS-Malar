package Week2;

import java.util.Scanner; //This package for reading input 

abstract class Shape {
	public int height;

	abstract public int calculate(int l);

	public int calculate(int l, int b) {
		return l * b * height;
	}
}

class RectangleL extends Shape {
	Scanner sc = new Scanner(System.in);

	public int calculate(int l) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Height value: ");
		height = sc.nextInt();
		return l * l * height;
	}

	public int calculate(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Height value: ");
		height = sc.nextInt();
		return l * b * height;
	}

}

public class Assignment5 extends RectangleL {
	Scanner sc = new Scanner(System.in);

	Assignment5(String str) {
		System.out.println(str);
		System.out.println("\nEnter Length value: ");
		int l = sc.nextInt();
		System.out.println("Area of rectangle: " + new RectangleL().calculate(l));
	}

	public Assignment5() {
		this("\nSAME LENGTH AND HEIGHT");
		System.out.println("\nDIFFERENT LENGTH AND WIDTH");
		System.out.println("\nEnter Length value: ");
		int l = sc.nextInt();
		System.out.println("Enter Breadth value: ");
		int b = sc.nextInt();
		System.out.println("Area of rectangle: " + new RectangleL().calculate(l, b));
	}

	public static void main(String args[]) {
		new Assignment5();
	}
}
