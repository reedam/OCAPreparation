package BookQuestions;

class Hello1
{
	protected Hello1()
	{
		System.out.println("Hello Constructor");
	}
}

public class Constructor{
	private Constructor()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		//Constructor c = new Constructor();
		Hello1 h = new Hello1();
	}

}
