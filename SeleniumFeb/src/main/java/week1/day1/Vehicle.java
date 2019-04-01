package week1.day1;

public class Vehicle {
	
	/*Class and Method Definition
	 * Vehicle class can contain methods of specific functionalities
	 * like applying brake, getting vehicle type, getting number of wheels, getting info like
	 * whether punctured
	 */
	
	String modelOfVehicle = "Swift";
	char firstLetter = 'M';
	boolean isPunctured = false;
	
	public void applyBrake() {
		System.out.println("BreakApplied");
	}
	
	public int noOfWheels(int wheels) {
		return wheels;
	}
	
	public void vehicleType(int wheels) {
		switch(wheels) {
			case 1: 
				System.out.println("Not applicable");
				break;
			case 2:
				System.out.println("Bike");
				break;
			case 3:
				System.out.println("Auto");
				break;
			case 4:
				System.out.println("Car");
				break;
			default:
				System.out.println("Heavy Vehicle");
				
		}
	}
	
	public boolean isPunctureda() {
		return isPunctured;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle veh = new Vehicle();
			veh.applyBrake();
			int noOfWheels = veh.noOfWheels(2);
			System.out.println("Number of Wheels: " + noOfWheels);
			veh.vehicleType(2);
			if(veh.isPunctureda()==true) {
			System.out.println("Vehicle is punctured");
			}else {
				System.out.println("Vehicle is not punctured");
	}

	}
}
