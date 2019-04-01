package week2HomeWork;

public class LearnREGEX {

	public static void main(String[] args) {
		
		
/*		Test3 (10049)
		Test3 (10054)*/
		
		String leadName = "Test3 (10049)";
		String op = leadName.replaceAll("\\s.+", "");
		System.out.println(op);
		String name = "Test3 (10049)";
		String replaceAll = name.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
	}

}
