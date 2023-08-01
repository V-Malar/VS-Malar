package Week2;

class Question
{
	public void student() {
		print(this); // Replaced for new Question()
	}
	public static void print(Question q)
	{
		System.out.println("Well Done! " + q.getClass().getSimpleName());
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Question().student();
	}

}
