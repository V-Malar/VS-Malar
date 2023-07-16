package test;

public class Closed13 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 5, 1 }, { 4, 5, 6, 6, 10 } };
		for (int i = 0; i < a.length; i++) {
			System.out.println("Student : " + (i + 1));
			int marks = 0;
			for (int j = 0; j < a[i].length; j++) {
				marks = marks + a[i][j];
			}
			System.out.println("Marks: " + marks);
		}
	}
}
