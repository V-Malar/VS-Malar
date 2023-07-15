package test;

/**
 * 
 * @author V Malar
 * CLASS WITH SETTER AND GETTER
 *
 */
class Lab {
	String name, address;
	int age;
	static int count = 0;

	public void setter(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		count += 1;
	}

	public String getter() {
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address;
	}

	public static void display() {
		System.out.println("\nCount: " + count);
	}
}

public class Lab14 {
	public void show() {
		Lab.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab14 P = new Lab14();
		Lab A = new Lab();
		for (int i = 1; i < 7; i++) {
			A.setter("Person", 20+i, "2/22, 2nd street, Chennai.");
			System.out.println(A.getter());
			P.show();
		}
	}

}
