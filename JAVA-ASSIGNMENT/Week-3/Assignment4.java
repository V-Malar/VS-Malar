package Week2;

import java.util.Scanner; //This package for reading input 

public class Assignment4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Read an integer
		fib(n);
	}

	static void fib(int n) {
		int n1 = 0;
		int n2 = 1;
		int temp, start = 1, total = 0;
		System.out.println(n1);
		System.out.println(n2);
		while (start < n) {
			temp = n1 + n2;
			total += temp;
			n1 = n2;
			n2 = temp;
			System.out.println(temp);
			start++;
		}
		System.out.println("\nTotal: " + total);
	}
}
