package test;

/**
 * 
 * @author V Malar
 * CLASS WITH CONSTRUCTOR
 *
 */

public class Lab2 {
	String name, address;
	int age;
	public Lab2(String name)
	{
		this.name = name;
		getter1();
	}
	public Lab2(String name, int age)
	{
		this.name = name;
		this.age = age;
		getter2();
	}
	public Lab2(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		getter3();
	}
	public String getter1()
	{
		return "Name: " + name;
	}
	public String getter2()
	{
		return "Name: " + name + "\n" + "Age: " + age;
	}
	public String getter3()
	{
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2 p1 = new Lab2("Person1");
		Lab2 p2 = new Lab2("Person2", 23);
		Lab2 p3 = new Lab2("Person3", 24, "2/24, 4th street, Chennai.");
		System.out.println();
		System.out.println(p1.getter1());
		System.out.println();
		System.out.println(p2.getter2());
		System.out.println();
		System.out.println(p3.getter3());
	}

}