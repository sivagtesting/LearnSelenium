package week3.Homework;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Program to remove duplicate characters from the given string
		
				String word="";
				
				System.out.println("Program to remove duplicate characters from the input string");
				System.out.println("Enter a Word");
				Scanner in  = new Scanner(System.in);
				try {
					word = in.next();
					in.close();
				} catch (Exception e) {
					
					System.out.println("Enter a valid String");
				}
				char[] charList = word.toCharArray();
				Set<Character> rmChar = new LinkedHashSet<Character>();
				for (char c : charList) {
					rmChar.add(c);
				}
				System.out.println("Original String: "+word+"\nAfter Removing duplicate characters: ");
				for (Character character : rmChar) {
					System.out.print(character);	
				}

	}

}
