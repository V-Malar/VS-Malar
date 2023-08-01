package Week2;

import java.util.Scanner;

class AnotherQuestion {
	public static void print(Question q) {
		System.out.println("Well Done! " + q.getClass().getSimpleName());
	}
}
class OneMoreQuestion
{
	public static void print(Question q) {
		System.out.println("Well Done! " + q.getClass().getSimpleName());
	}
}
class Question {
	public static void student() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input class: ");
		String input_class_name = sc.next();
		print(Class.forName(input_class_name ).newInstance());
	}

	public static void print(Object q) {
		System.out.println("Well Done! " + q.getClass().getSimpleName());
	}
}

public class Assignment1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Question.student();
	}

}
