package OCAPractice;

public class Question2 {
	public static void main(String[] args) {
		Question2 ts = new Question2();
		System.out.println(isAvailable+" ");
		isAvailable  = ts.dostuff();
		System.out.println(isAvailable);

	}
	public static boolean dostuff()
	{
		return !isAvailable;
	}
	static boolean isAvailable = false;

}
