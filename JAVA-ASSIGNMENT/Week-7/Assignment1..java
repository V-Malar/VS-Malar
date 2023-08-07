package Week2;

import java.util.*;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner inr = new Scanner(System.in);
		int n;
		boolean b = true;
		while (b) {
			try {
				byte barr[] = { 'N', 'P', 'T', 'E', 'L', '-', 'J', 'A', 'V', 'A', 'J', 'A', 'N', '-', 'N', 'O', 'C',
						'C', 'S', 'E' };
				System.out.println("Enter the index value: ");
				n = inr.nextInt();
				b = false;
				String s2 = new String(barr, n, 1);
				System.out.println(barr[n]);
				System.out.println(s2);
			} catch (Exception e) {
				System.out.println("exception occur..\n");
				inr.next();
			}
		}
	}
}
