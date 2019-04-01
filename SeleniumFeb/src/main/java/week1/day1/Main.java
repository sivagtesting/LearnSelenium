package week1.day1;

public class Main {
	
	//greater of 3 numbers

	public void greaterNum() {
		int num1 = 50, num2 = 35, num3 = 40;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Num1 is greater: "+ num1);
			}else {
				System.out.println("Num3 is greater: "+ num3);
			}
		}else if(num2>num3) {
			System.out.println("Num2 is greater: "+ num2);
		}else {
			System.out.println("Num3 is greater: " + num3);
		}
	}
	
	public void sumNum() {
		
		int num = 0;
		String txt = "";
		
		for(int i=1; i<11; i++) {
			txt = txt+i+"+";
			num = num+i;
		}
		System.out.println("the sum of "+txt +" is " + num);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.greaterNum();
		obj.sumNum();
		
	}
}
