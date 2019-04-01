package week3.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RmDupFrmList {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("siva");
		nameList.add("apple");
		nameList.add("ball");
		nameList.add("cat");
		nameList.add("dog");
		nameList.add("ball");
		nameList.add("cat");
		nameList.add("dog");
		List<String> uniqueList = new ArrayList<String>();
		for (String name : nameList) {
			
			if(!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
			
		}
		
		System.out.println("Original List: "+nameList);
		Collections.sort(uniqueList);
		System.out.println("After removing duplicate entries: "+uniqueList);

	}

}
