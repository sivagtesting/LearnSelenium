package interview.java.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicatesInArray {

	@Test(enabled = false)
	public void soln1() {
		int[] num = { 1, 3, 4, 3, 7, 8, 8, 9 };
		Arrays.sort(num);
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1]) {
				System.out.println(num[i]);
			}
		}
	}

	@Test(enabled = false)
	public void soln2() {
		int[] num = { 1, 3, 4, 3, 7, 8, 9, 9 };
		System.out.println("Length:" + num.length);
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

	@Test(enabled=false)
	public void soln3() {
		int[] num = { 1, 3, 3, 4, 7, 8, 9, 8 };
		Set<Integer> numSet = new HashSet<Integer>();
		for (int eachNum : num) {
			if (!numSet.add(eachNum)) {
				System.out.println(eachNum);
			}
		}
	}

	@Test
	public void soln4() {
		int[] num = { 1, 3, 3, 4, 7, 8, 9, 8 };

		Map<Integer, Integer> mapNum = new HashMap<Integer, Integer>();

		for (int i : num) {

			if (mapNum.containsKey(i)) {
				mapNum.put(i, mapNum.get(i) + 1);
			} else {
				mapNum.put(i, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: mapNum.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}
}