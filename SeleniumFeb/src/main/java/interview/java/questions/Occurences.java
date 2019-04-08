package interview.java.questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occurences {

	@Test(enabled=false)
	public void soln1() {
		String sentence = "welcome to automation";
		sentence = sentence.replaceAll(" ", "");
		int count = 1;
		for (int i = 0; i < sentence.length() - 1; i++) {
			for (int j = i + 1; j < sentence.length(); j++) {
				if (sentence.charAt(i) == sentence.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
			System.out.println("Character '" + sentence.charAt(i) + "' occurs '" + count + "' time");
			}else
				System.out.println("Character '" + sentence.charAt(i) + "' occurs '" + count + "' times");
			count = 1;

		}

	}
	
	@Test(enabled=false)
	public void soln2() {
		int count=0;
		String sentence = "test";
		sentence = sentence.replaceAll(" ", "");
		List<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < sentence.length() - 1; i++) {
			if(!charList.contains(sentence.charAt(i))){
				charList.add(sentence.charAt(i));
			}
		}
		for(int j=0;j<charList.size();j++) {
			for(int k=0;k<sentence.length();k++) {
				if(charList.get(j)==sentence.charAt(k)) {
					count++;
				}
			}
			System.out.println("Character '"+charList.get(j)+"' occurs '"+count +"'times");
			count=0;
		}
		
		
	}
	
	@Test
	public void soln3() {
		//Using map
		
		String sentence = "welcome to automation";
		
		sentence = sentence.replaceAll(" ", "");
		Map<Character, Integer> mapSent = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < sentence.length(); i++) {
			if(mapSent.containsKey(sentence.charAt(i))) {
				mapSent.put(sentence.charAt(i), mapSent.get(sentence.charAt(i))+1);
			}else
				mapSent.put(sentence.charAt(i), 1);
		}
		for (Entry<Character, Integer> entrySet : mapSent.entrySet()) {
			if(entrySet.getValue()==1) {
				System.out.println("Character '"+entrySet.getKey()+"' occurs '"+entrySet.getValue()+"' time");	
			}else
				System.out.println("Character '"+entrySet.getKey()+"' occurs '"+entrySet.getValue()+"' times");
						
		}
	
	}

}
