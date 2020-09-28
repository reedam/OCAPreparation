package OCAPractice;

class Flower
{
	public Flower()
	{
		this(100);
		System.out.println("Flower Default Constructor");
	}
	
	public Flower(int i)
	{
		System.out.println("Flower Construction  "+i);
	}
}

class Rose extends Flower
{
	public Rose()
	{
		System.out.println("Rose Constructor");
	}
	public Rose(int i)
	{
		this();
		System.out.println("Rose Constructor 2");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Rose rose = new Rose();
	}

}
