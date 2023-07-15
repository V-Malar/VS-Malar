package test;
/**
 * 
 * @author V Malar
 * A simple java program for String Handling
 *
 */
public class Lab9 {

	String str;

	public Lab9(String str) {
		this.str = str;
	}

	public void length() {
		System.out.println(str.length());
	}

	public void concat() {
		System.out.println(str.concat(", V Malar"));
	}

	public void substring() {
		System.out.println(str.substring(str.length() - 5));
	}

	public void replace() {
		System.out.println(str.replace(str.substring(str.length() - 5), "Shinchan"));
	}

	public void compare() {
		try {
			str.compareTo(null);
//			str.compareTo("Hello World");
			System.out.println("Matched..");
		} catch (Exception e) {
			System.out.println("Gotcha.. Your error is: " + e);
		}
	}

	public void equals() {
		System.out.println(str.equals(null));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		Lab9 l = new Lab9(str);
		l.length();
		l.concat();
		l.substring();
		l.replace();
		l.compare();
		l.equals();
	}

}
