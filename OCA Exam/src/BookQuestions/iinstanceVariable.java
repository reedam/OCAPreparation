package BookQuestions;




public class iinstanceVariable {
	private int i;
	private String s;
	public String getString()
	{
		return s;
	}

	public static void main(String[] args) {
		iinstanceVariable obj = new iinstanceVariable();
		System.out.println(obj.i);
		System.out.println(obj.s);
		
		String New = obj.getString();
		System.out.println(New.toLowerCase());

	}

}
