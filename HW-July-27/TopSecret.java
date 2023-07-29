
package exeption;

/*
 *  Reflection allows us to dynamically inspect and interact with classes, methods, 
 *  and fields, providing more flexibility and adaptability to our programs. However, 
 *  it's essential to use Reflection carefully and only when necessary, as it comes 
 *  with performance overhead and potential security risks.
 *  
 * Note: Be cautious while using Reflection, especially when accessing non-public members, 
 * as it can lead to security issues and is generally considered an advanced programming 
 * technique. It's essential to understand the class structure and use Reflection 
 * judiciously for legitimate use cases.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Secret {
	private String name, hero, pet, job;
	private Integer age;

	public Secret() {

	}

	public Secret(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	private Secret(String hero, String pet, String job) {
		this.hero = hero;
		this.pet = pet;
		this.job = job;
	}

	public void basicDetails() {
		System.out.println("Name: " + name + " " + "Age: " + age);
	}

	private void secretDetails() {
		System.out.println("Hero: " + hero + " " + "Pet: " + pet + " " + "Job: " + job);
	}
}

public class TopSecret {
	public void fetchDetails() throws Exception {
		/*
		 * If you were to use Class<?> instead of Class<Secret>, it would mean you are
		 * working with a Class object of an unknown type, and you would lose the
		 * specificity and type safety for the Secret class.
		 */

		// Basic Details - public constructor, public method
		Class<Secret> shinchan = Secret.class;
		Constructor<Secret> shinchan_constructor1 = shinchan.getConstructor(String.class, Integer.class);
		Secret basicValues = (Secret) shinchan_constructor1.newInstance("Shinchan", 5);
		Method m1 = shinchan.getMethod("basicDetails");
		m1.invoke(basicValues);

		// secretValues.secretDetails(); --can't access because private method
		// Secret Details - private constructor, private method
		Constructor<Secret> shinchan_constructor2 = shinchan.getDeclaredConstructor(String.class, String.class,
				String.class);
		shinchan_constructor2.setAccessible(true);
		Secret secretValues = (Secret) shinchan_constructor2.newInstance("Action Comin", "Shiro", "Detective");
		Method m = shinchan.getDeclaredMethod("secretDetails");
		m.setAccessible(true); // very very important line
		m.invoke(secretValues);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Class<TopSecret> t = TopSecret.class;
//		TopSecret tt = new TopSecret();
//		Method m = t.getMethod("fetchDetails");
//		m.invoke(tt, null);
		TopSecret t = new TopSecret();
		t.fetchDetails();
	}

}
