package OCAPractice;

public class Question1 {
	
	public static void test()
	{
		int i=10;
		int j = i++;
		++i;
		i = i++;
		j = ++i;
		int k = j++;
		++k;
		System.out.println(i + " "+j+" "+k);
	}

	public static void main(String[] args) {
		test();
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3));  //true

	}

}
