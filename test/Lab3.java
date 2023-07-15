package test;

/**
 * 
 * @author V Malar
 * CLASS WITH INHERITANCE AND POLYMORPHISM
 *
 */

class Lab3 extends Lab{
	public Lab3() {
		// TODO Auto-generated constructor stub
	}
	String name, address;
	int age;
	int Lab3ID, salary;
	public void setter(int Lab3ID, int salary)
	{
		this.Lab3ID = Lab3ID;
		this.salary = salary;
	}
	public String getter()
	{
		return "Lab3 ID: " + Lab3ID + "\nSalary: " + salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person();
//		p.setter("V", 27, "Here");
//		p.getter();
		Lab3 e = new Lab3();
		e.setter(12, 12000);
		System.out.println(e.getter());		
	}

}