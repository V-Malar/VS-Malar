package test;

public class New {

	public static void main(String[] args) {
		int n = 5, k = 0;
		for (int i = 0; i < n; i++, k = 0) {
			for (int j = 0; j < n; j++) {
				if (i + j > n - 1) {
					System.out.print(++k + " ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = i; j >= 0; j--) {
				System.out.print(++k + " ");
			}
			System.out.println();
		}
	}
}
