package BookQuestions;

public class GarbageCollection {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Bye Bye");
		
		System.out.println(s1);
		
		s1=s2;
		System.out.println(s1);
		System.out.println(s2);

	}

}
