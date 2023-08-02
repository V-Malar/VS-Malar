package Week2;

import java.util.Scanner; //This package for reading input 

class Small {
	public void display() {
		System.out.println("This is Small ");
	}
}

class Medium extends Small {
	public void display() {
		super.display();
		System.out.println("This is Medium ");
	}
}

class Large extends Medium {
	public void display() {
		super.display();
		System.out.println("This is Large ");
	}
}

class ExtraLarge extends Large {
	public void display() {
		super.display();
		System.out.println("This is ExtraLarge ");
	}
}

public class Assignment3 extends ExtraLarge {
	public void display() {
		super.display();
		System.out.println("-------------------------------------------------");
	}

	public static void main(String args[]) {
		System.out.println("---------------------OUTPUT----------------------");
		new Assignment1().display();
	}
}
