package Week2;

interface First {
	String first = "This is Shape1";
}

interface Second {
	String second = "This is Shape2";
}

class Final implements First, Second {

	public void show() {
		System.out.println(First.first);
		System.out.println(Second.second);
		System.out.println("-------------------------------------------------");
	}

}

public class Assignment5 {
	public static void main(String args[]) {
		System.out.println("---------------------OUTPUT----------------------");
		new Final().show();
	}
}
