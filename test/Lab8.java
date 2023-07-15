package test;

/**
 * 
 * @author rajesh
 * Wrapper Classes and Autoboxing
 *
 */
public class Lab8 {
	Integer o_a;
	Float o_f;
	Boolean o_b;
	int p_a;
	float p_f;
	boolean p_b;
	
	Lab8(int a, float f, boolean b)
	{
		this.o_a = a;
		this.o_f = f;
		this.o_b = b;
	}
	
	public void toObjectChange()
	{
		System.out.println(this.o_a +  
					" Integer\n" + this.o_f + 
					" Float\n" + this.o_b +
					" Boolean\n");
	}
	
	public void toPrimitiveChange()
	{
		p_a = o_a;
		p_f = o_f;
		p_b = o_b;
		System.out.println(this.p_a +
				" int\n"+ this.p_f + 
				" float\n" + this.p_b +
				" boolean");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PRIMITIVE TYPE
		
		int a = 10;
		float f = 7.7f;
		boolean b = true;
		System.out.println();
		Lab8 l = new Lab8(a, f, b);
		
		// OBJECT CONVERSION
		l.toObjectChange();
				
		// PRIMITIVE CONVERSION
		l.toPrimitiveChange();
	}

}
