package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Assignment2 {

	static void getCount() throws IOException {
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
					|| c == 'u') {
				System.out.println(c);
				count = count + 1;
			}
		}
		System.out.println("Vowel Count: " + count);
	}

	public static void main(String[] args) throws IOException {
		getCount();
	}
}
