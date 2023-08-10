package Week;
// Method GENERICS
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
// Class GENERICS
package Week;

class Shinchano {
	String name;

	public Shinchano(String name) {
		this.name = name;
	}
}

class Kazama {
	Integer age;

	public Kazama(Integer age) {
		this.age = age;
	}
}

class Masaw {
	Character initial;

	public Masaw(Character initial) {
		this.initial = initial;
	}
}

class Neni {
	Boolean isFriend;

	public Neni(Boolean isFriend) {
		this.isFriend = isFriend;
	}
}

class Shiro {
	String type;

	public Shiro(String type) {
		this.type = type;
	}
}

class BasicGenerics<T> {
	T things;

	public BasicGenerics(T things) {
		this.things = things;
	}

	public T getValue() {
		return things;
	}
}

public class Work {

	public static void main(String[] args) {
		BasicGenerics<Shinchano> shinchan = new BasicGenerics("Shinchan");
		System.out.println(shinchan.getValue());
		BasicGenerics<Kazama> kazama = new BasicGenerics(5);
		System.out.println(kazama.getValue());
		BasicGenerics<Masaw> masaw = new BasicGenerics("M");
		System.out.println(masaw.getValue());
		BasicGenerics<Neni> neni = new BasicGenerics(true);
		System.out.println(neni.getValue());
		BasicGenerics<Shiro> shiro = new BasicGenerics("Pet");
		System.out.println(shiro.getValue());
	}

}
