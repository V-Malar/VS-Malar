package test;

import java.util.Scanner;

/**
 * 
 * @author V Malar
 * Exception Handling
 *
 */
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 5, b;
		Integer[] arr = new Integer[6];
		Scanner sc = new Scanner(System.in);
		try {
			b = 0 / arr.length;
			try {
//				for (int i=1; i <= arr.length-1; i++) --> solution
				for (int i = 1; i <= arr.length; i++) {
					System.out.println("Value of " + i + " " + arr[i]);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Your error in array is: " + e);
			}
		} catch (ArithmeticException ar) {
			System.out.println("You first got here:" + ar);
		} catch (Exception e) {
			System.out.println("Your error is: " + e);
		}
	}

}
