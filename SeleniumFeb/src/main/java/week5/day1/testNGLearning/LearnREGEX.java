package week5.day1.testNGLearning;

public class LearnREGEX {

	public static void main(String[] args) {
		
		
/*		Test3 (10049)
		Test3 (10054)*/
		
		String leadName = "Test3 (10049)";
		String op = leadName.replaceAll("\\s.+", "");
		System.out.println(op);
		
		
	}

}
