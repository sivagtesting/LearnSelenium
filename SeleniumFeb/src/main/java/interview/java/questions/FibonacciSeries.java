package interview.java.questions;

import org.testng.annotations.Test;

public class FibonacciSeries {
	static int num1=1,num2=1;

	@Test
	public void soln1() {
		System.out.println("Solution 1");
		int[] data = new int[10];
		data[0] = 1;
		data[1] = 1;
		System.out.print(data[0] + " " + data[1]);
		for (int i = 2; i < data.length; i++) {
			data[i] = data[i - 2] + data[i - 1];
			System.out.print(" " + data[i]);
		}
	}
	
	@Test
	public void soln2() {
		System.out.println("Solution 2");
		int n1=1, n2=1, n3;
		int count=10;
		System.out.print(n1+" "+n2);
		while(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			count--;
			System.out.print(" "+n3);
		}
	}
	
	public void soln3(int count) {
		if(count>0) {
		int	num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
			soln3(count-1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Solution3");
		System.out.print(num1+" "+num2);
		new FibonacciSeries()
		.soln3(10);
	}

}

