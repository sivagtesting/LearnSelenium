package week1.day1;

public class HomeWork {
	
	
	//Day1 Homework
	//2) Program to find Prime number
		boolean flag = true;
		
	
	public void isPrime(int a) {
		int i;
		if(a==2) {
			System.out.println("Given number '"+a+"' is a Prime number");
		}else {
			for(i=2;i<=a/2;i++) {
				if(a%i==0) {
					flag = false;
					break;
				}
			}
			if(flag==true)
				System.out.println("Given number '"+a+"' is a Prime number");
			else
				System.out.println("Given number '"+a+"' is not a Prime number");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork home = new HomeWork();
		home.isPrime(2);

	}

}
