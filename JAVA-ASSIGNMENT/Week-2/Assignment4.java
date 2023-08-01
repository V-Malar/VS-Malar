package Week2;

class Constructor {
	public Constructor() {
		// TODO Auto-generated constructor stub
		this("Name: Shinchan Nohara Age: ", 5);
	}

	public Constructor(String name, int age) {
		// TODO Auto-generated constructor stub
		this("Greetings to, ");
		System.out.println(name + " " + age);
	}

	public Constructor(String greetings) {
		// TODO Auto-generated constructor stub

		System.out.print(greetings);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor();
	}

}
