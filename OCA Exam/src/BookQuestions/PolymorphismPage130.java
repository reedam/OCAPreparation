package BookQuestions;

class Animals
{
	public void eat()
	{
		System.out.println("Generic Animal Eating");
	}
}

class Horses extends Animals{
	
	public void eat()
	{
		System.out.println("Horse Eating");
	}
	
	public void eat(String s)
	{
		System.out.println("Horse eating "+s);
	}
	
}

public class PolymorphismPage130 {
	public static void main(String[] args)
	{
		Animals hr = new Horses();
		hr.eat();
	}

}
