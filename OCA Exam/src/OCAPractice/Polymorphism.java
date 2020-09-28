package OCAPractice;

class Parent
{
	public void fun()
	{
		System.out.println("This is parent.");
	}
}

class Child extends Parent
{
	public void fun()
	{
		System.out.println("This is child.");
	}
}

public class Polymorphism {

	public static void main(String[] args)
	{
		Parent c = new Parent();
		c.fun();
	}
	
}
