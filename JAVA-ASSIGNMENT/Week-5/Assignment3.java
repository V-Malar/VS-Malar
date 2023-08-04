package Week2;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j;
		try {
			System.out.println("Enter your choice: ");
			switch (i) {
			case 0:
				int zero = 0;
				j = 92 / zero;
				break;
			case 1:
				int b[] = null;
				j = b[0];
				break;
			case 2:
				String s = args[0];
			default:
				System.out.println("No exception");
			}
		} catch (Exception e) {
			System.out.println(e);
			Assignment1.main(args);
		}
	}
}
