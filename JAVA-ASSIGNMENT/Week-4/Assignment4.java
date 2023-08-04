package Week2;

import java.util.Scanner; //This package for reading input 

interface First {
	public void show();
}

interface Second {
	public void show();
}

class FirstC implements First {

	@Override
	public void show() {
		System.out.println("This is First...");
	}

}

class SecondC extends FirstC implements Second {

	@Override
	public void show() {
		System.out.println("This is Second...");
		super.show();
	}

}

public class Assignment4 extends SecondC {
	public void display() {
		super.show();
		System.out.println("-------------------------------------------------");
	}

	public static void main(String args[]) {
		System.out.println("---------------------OUTPUT----------------------");
		new Assignment1().display();
	}
}
