package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LearnMap {

	public static void main(String[] args) {
		
		String name;
		Map<Character, Integer> word = new  HashMap<Character, Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Name");
		name = in.next();
		in.close();
		char[] nameChar = name.toCharArray();
		for (char n : nameChar) {
			if(word.containsKey(n)) {
				word.put(n, word.get(n)+1);
			}else
				word.put(n, 1);
			
		}
		System.out.println(word);

	}

}
