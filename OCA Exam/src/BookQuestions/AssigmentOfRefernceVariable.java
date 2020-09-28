package BookQuestions;

class Dimension
{
	int heigth;
	int length;
	public Dimension(int heigth, int length) {
		this.heigth = heigth;
		this.length = length;
	};
	
}

public class AssigmentOfRefernceVariable {

	public static void main(String[] args) {
		Dimension a1 = new Dimension(10,20);
		System.out.println("a1.height = "+a1.heigth);
		Dimension a2 = a1;
		a2.heigth = 50;
		System.out.println("a2.height = "+a2.heigth);
		System.out.println("a1.heigth = "+a1.heigth);
		
		String s = "Reedam";
		String y = s;
		s=s+"Jain";
		System.out.println(s);
		System.out.println(y);
	}

}
