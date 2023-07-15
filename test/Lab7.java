package test;

/**
 * 
 * @author V Malar
 * Interfaces
 *
 */
interface Playable
{
	void play();
}
class Guitar implements Playable
{
	public void play()
	{
		System.out.println("Playing Guitar..");
	}
}
class Piano implements Playable
{
	public void play()
	{
		System.out.println("Playing Piano..");
	}
}
public class Lab7 implements Playable{
	public void play() {
		System.out.println("Playing Lists..");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Lab7 i = new Lab7();
		i.play();
		Guitar g = new Guitar();
		g.play();
		Piano p = new Piano();
		p.play();
	}
}