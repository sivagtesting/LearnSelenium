package week3.day2;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class LearnCollections {
	
	public static void main(String[] args) {
		
	//Array List
	List<String> cycles = new ArrayList<String>();
	cycles.add("Hercules");
	cycles.add("BSA");
	cycles.add("Atlas");
	cycles.add(1, "SIVA");
	cycles.add(1, "SIVA");
	cycles.remove("SIVA");
	cycles.remove(1);
	
	System.out.println("ArrayList:");
	System.out.println(cycles);
	System.out.println(cycles.contains("BSA"));
	System.out.println(cycles.size());
	for (String string : cycles) {
		System.out.println(string);
	}
	
	
	List<String> eName = new LinkedList<String>();
	System.out.println("******************\nLinked List:");
	eName.add("Siva");
	eName.add("Dhivya");
	eName.add("Satish");
	eName.add(0, "Siva");
	System.out.println(eName);
	System.out.println(eName.get(0));
	
	
	//Set 
	System.out.println("****************\nSet");
	
	Set<String> cycles2 = new HashSet<String>();
	cycles2.add("BSA");
	cycles2.add("Hercules");
	cycles2.add("Atlas");
	cycles2.add("BSA");
	//Gets inserted randomly
	System.out.println(cycles2.size());
	
	System.out.println("HashSet: "+cycles2);
	
	Set<String> cycles3 = new TreeSet<String>();
	cycles3.add("Hercules");
	cycles3.add("Atlas");
	cycles3.add("BSA");
	//Gets inserted based on ASCII order
	
	System.out.println("TreeSet: "+cycles3);
	
	Set<String> cycles4 = new LinkedHashSet<String>();
	cycles4.add("Hercules");
	cycles4.add("Atlas");
	cycles4.add("BSA");
	//Gets inserted in the order of insertion
	System.out.println("LinkedHashSet"+
	cycles4);
	
	//To check add all method -> On what order it inserts to the List from Set
	//(Since each set was inserted in a rondom order)
	
	List<String> test = new ArrayList<String>();
	test.addAll(cycles2);
	System.out.println(test);
	
	}
	
}
