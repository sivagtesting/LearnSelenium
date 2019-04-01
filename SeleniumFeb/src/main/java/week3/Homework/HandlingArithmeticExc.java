package week3.Homework;

public class HandlingArithmeticExc {

	public static void main(String[] args) {
		
		//Learn throw, throws keywords da venna
		System.out.println("Program to handle arithmetic exception");
		int num = 18;
		try {
			System.out.println(num/1);
		} catch (Exception e) {
			System.err.println("A number cannot be divided by zero");
			
		}finally {
			System.out.println("text");
		}
	}

}
