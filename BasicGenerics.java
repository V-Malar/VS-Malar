package Week;

public class Work {
	public static <T> void display(T[] arr) {
		for (T i : arr) {
			System.out.println("Value: " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] int_arr = { 1, 2, 3, 4, 5 };
		Double[] double_arr = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		Character[] char_arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String[] str_arr = { "Shinchan", "Kazama", "Masaw", "Neni", "Shakes" };
		display(int_arr);
		System.out.println();
		display(double_arr);
		System.out.println();
		display(char_arr);
		System.out.println();
		display(str_arr);
	}

}
