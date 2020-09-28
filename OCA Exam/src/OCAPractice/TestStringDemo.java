package OCAPractice;

public class TestStringDemo {
	public static StringBuilder concat(StringBuilder a, StringBuilder b)
	{
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		StringBuilder s3 = concat(s1,s2);
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		int a=5;
		int b = a++ + ++a + --a + a--;
		System.out.println(b);
	}

}
