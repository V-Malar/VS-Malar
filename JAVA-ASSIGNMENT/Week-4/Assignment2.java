package Week2;

import java.util.Scanner; //This package for reading input 

public class Assignment2 {
	public static void display() {
		System.out.println(
				"\nCurrent Date: " + java.util.Calendar.getInstance().get(java.util.Calendar.getInstance().DATE) + "-"
						+ java.util.Calendar.getInstance().get(java.util.Calendar.getInstance().MONTH) + "-"
						+ java.util.Calendar.getInstance().get(java.util.Calendar.getInstance().YEAR));
	}

	public static void main(String args[]) {
		display();
	}
}
