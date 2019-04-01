package week3.Homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindingDupChar {

	public static void main(String[] args) {
		
		String name, duplicate="", unique="";
		Map<Character, Integer> word = new  LinkedHashMap<Character, Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Any word");
		name = in.next();
		in.close();
		char[] nameChar = name.toCharArray(); // Converting the given name to a String array
		//so that it can be inserted into a map character wise
		Set<Character> nonDupliChar = new TreeSet<Character>();
		for (char n : nameChar) {
			nonDupliChar.add(n); //To get the non duplicate character list
			if(word.containsKey(n)) {
				word.put(n, word.get(n)+1); //To get the characters which occur more than once
			}else
				word.put(n, 1); // To get the characters which occur only once
			
		}
		
		//Looping through each entry(character) of the map using entry set and checking whether the char is duplicate using the number against it
		for (Map.Entry<Character, Integer> eachEntry : word.entrySet()) {
			if(eachEntry.getValue()>1) {
				duplicate = duplicate + eachEntry.getKey()+"="+eachEntry.getValue()+" ";
			}else
				unique = unique + eachEntry.getKey()+",";
		}
		
		
		/*//Now Insert the nonDuliChar to a list so that the duplicate character count can be fetched
		List<Character> uniqueChars = new ArrayList<Character>();
		uniqueChars.addAll(nonDupliChar); 
		
		//Now check if the value in the map for the key(unique chars) is more than one then it is a duplicate char
		for(int i=0;i<uniqueChars.size();i++) {
			if(word.get(uniqueChars.get(i))>1) {
				duplicate = duplicate+uniqueChars.get(i)+"="+word.get(uniqueChars.get(i))+" ";
			}else
				unique=unique+uniqueChars.get(i)+",";
		}
		
		//System.out.println(word);
*/		System.out.println("\nBelow are the duplicate characters in the Word: '"+name+"'");
		System.out.println(duplicate);
		System.out.println("\nUnique Characters: "+unique);

	}

}
