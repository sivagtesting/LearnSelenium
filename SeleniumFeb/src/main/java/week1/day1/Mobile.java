package week1.day1;

public class Mobile {
	
	//Class level Variable
	int phoneNumber = 9840666;
	String phoneModel = "MotoG2";
	
	//Method declaration
	//<access specifier> <return type> <methodName> (<input argument list>)
	
	public void dialCaller(int phoneNumber) {
		System.out.println("Calling: "+phoneNumber);
	}
	
	public void sendSms(int phoneNumber) {
		System.out.println("Sending sms to:" + phoneNumber);
	}
	
	//Method with Return type
	public int batteryPercentage() {
		return 56;
	}
	
	public String phoneModel() {
		return phoneModel;
	}
	
	public static void main(String[] args) {
		
		Mobile mob = new Mobile(); //creating an object for the class so as to
								   //call the method belonging to the class
		
		mob.dialCaller(98406664);
		mob.sendSms(9840666);
		String phoneModel2 = mob.phoneModel(); // ctrl+2, l to store the returned value in local
		System.out.println("PhoneModel: " + phoneModel2);
		int batteryPercentage = mob.batteryPercentage();  //ctrl+2, l
		System.out.println("Battery Remaining: " + batteryPercentage);
	}

}
