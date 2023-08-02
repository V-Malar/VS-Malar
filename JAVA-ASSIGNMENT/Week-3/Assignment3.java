package Week2;

import java.util.Scanner;

class Input {
	public int x;
	public int y;

	Input()
	{
	Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter the number1: ");
			x = sc.nextInt();
			System.out.println("Enter the number1: ");
			y = sc.nextInt();
	 }
}

class Assignment3 {
	static int temp = 0;
	public static void swap(Input i)
	{
		System.out.println("Before Swap: " + i.x + " " + i.y);
		temp = i.x;
		i.x = i.y;
		i.y = temp;
		System.out.println("After Swap: " + i.x + " " + i.y);
	}
	public static void main(String[] args) {
Assignment1.swap(new Input());
	}
}
