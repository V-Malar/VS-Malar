package exeption;

import java.util.Scanner;

class Rahul {
	Scanner sc = new Scanner(System.in);
	Integer n, count = 0, s = 1;
	Integer[] i;

	public void calculate() {
		try {
			System.out.println("Enter the number count: ");
			n = sc.nextInt();
			i = new Integer[n];
			System.out.println("Even number divisible by 3");
			for (int l = 0; l < n; l++) {
				if (l % 2 == 0) {
					s = l;
					if (s % 3 == 0) {
						System.out.println(s + "*");
						count = count + s;
					}
				}
			}
			System.out.println("Count: " + count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rahul r = new Rahul();
		r.calculate();
	}

}
