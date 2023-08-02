package Week2;

import java.util.LinkedList;
import java.util.Scanner; //This package for reading input 

public class Assignment1 {
	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cars to be entered: ");
		Integer n = sc.nextInt();
		LinkedList<String> cars = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the type of car: ");
			String car = sc.next();
			cars.add(car);
			System.out.println();
		}
		System.out.println("Cars: " + cars);
	}

	public static void main(String args[]) {
		display();
	}
}
