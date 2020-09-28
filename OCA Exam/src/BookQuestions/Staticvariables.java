package BookQuestions;

class Hello
{
	static String s= "Hello";
	Hello(String s)
	{
		
	}
}

public class Staticvariables {
	static int i =10;
	static int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		//System.out.println(i);
		//System.out.println(Hello.s);
		//System.out.println(add(10,15));
		System.out.println(foo()+7+2);
		System.out.println(7+2+foo());
	}
	static String foo()
	{
		return "Hello";
	}

}
