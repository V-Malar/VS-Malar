package exeption;
import java.util.Scanner;
class Rahul
{
	Scanner sc = new Scanner(System.in);
	String name="Rahul";
	Integer s, m, total = 0;
	Integer[] i;
	public void calculate()
	{
		try {
			System.out.println("Enter the number of subjects: ");
			s = sc.nextInt();
			i = new Integer[s];
			int min;
			for (int l=0; l<i.length; l++)
			{
				System.out.println("Enter the marks: ");
				i[l] = sc.nextInt();
				total = total + i[l];
			}
			min = i[0];
			for (int l=0; l<i.length; l++)
			{
				if (min < i[l])
				{
					min = i[l];
				}
			}
			System.out.println("Name: " + name);
			System.out.println("Maximum Mark: " + min);
			System.out.println("Total Marks: " + total);
			System.out.println("Average: " + total/s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
	}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rahul r = new Rahul();
r.calculate();
	}

}
