package BookQuestions;

class Animal
{
	public void eat()
	{
		System.out.println("Animal Eat.");
	}
}

class Horse extends Animal
{
	public void eat()
	{
		System.out.println("Horse");
	}
}

public class OverriddenPage122 {

	public static void main(String[] args) {
		Horse hr = new Horse();
		hr.eat();
		Animal an = new Animal();
		an.eat();
		Animal a = new Horse();
		a.eat();
	}

}
