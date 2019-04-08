package interview.java.questions;

import org.testng.annotations.Test;

public class ReverseAString {

	@Test(enabled = false)
	public void soln1() {
		String sentence = "I am doing good";
		for (int i = sentence.length() - 1; i >= 0; i--)
			System.out.print(sentence.charAt(i));
	}

	@Test(enabled = false)
	public void soln2() {
		String sentence = "I am doing good";
		char[] charArr = sentence.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--)
			System.out.print(charArr[i]);
	}

	@Test()
	public void soln3() {

		StringBuffer sent = new StringBuffer("I am doing good");
		System.out.println(sent.reverse());

	}

}
