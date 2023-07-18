package test;

public class Closed15a {
	static void prime() {
		int i = 1;
		while (i <= 100) {
			if (i == 1) {

			} else {
				if (i == 2 || i % 2 == 1) {
					System.out.println(i);
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime();
	}

}
