package Week;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Shinchan {
	String value1() default "I'm a naughty boy... SHINCHAN NOHARA..";

	String[] shinchan();
}

class Do {
	@Shinchan(value1 = "I'm Good Boy Shinchan Nohara", shinchan = { "Shiro", "Kazama", "Neni", "Masaw" })
	public void display() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			InstantiationException, NoSuchMethodException, SecurityException {
		Method method = Do.class.getMethod("display");
		Shinchan annotation = method.getAnnotation(Shinchan.class);
		System.out.println(annotation.value1());
		// Lambda with Annotation
		MyMethod mi = (s) -> {
			System.out.println("Character: " + s);
		};
		for (String a : annotation.shinchan()) {
			mi.met(a);
		}
	}

	public static void met(String s) {
		System.out.println("Characters: " + s);
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		new Do().display();
	}
}

interface MyMethod {
	public void met(String s);
}

//MyMethod mi = Do::met;	
//for (String a:annotation.shinchan())
//{
//	mi.met(a);
//}
//}
//public static void met(String s)
//{
//System.out.println("Characters: " + s);
//}
