package week3.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
System.out.println("Program to sort list of employee Names and Removing names that contain 'D'");
		
		List<String> empNList = new ArrayList<String>();
		empNList.add("Siva");
		empNList.add("Dhivya");
		empNList.add("Sylappan");
		empNList.add("Babu");
		System.out.println("Before Sorting & Removal of Employees Name contaning char 'D'");
		System.out.println(empNList);
		Collections.sort(empNList);
		for(int i=0;i<empNList.size();i++) {
			
			if((empNList.get(i).indexOf('D') >= 0)||(empNList.get(i).indexOf('d')>=0)) {
				empNList.remove(empNList.get(i));
			}
		}
		System.out.println("After Sorting & Removal of Employee Names containing char 'D'");
		System.out.println(empNList);

	}

}
