package interview.java.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeOrNot {

	Scanner input;
	boolean flag = false;

	@Test(enabled = false)
	public void soln1() {
		System.out.println("Solution1");
		int num = 0;
		input = new Scanner(System.in);
		System.out.println("Enter a number:");
		try {
			num = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid integer");

		}
		if (num <= 2) {
			System.out.println("The least prime number is 2, Hence enter a number greater than 2");
		} else {

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Entered number is a Prime Number");
			} else
				System.out.println("Entered number is not a Prime Number");

		}
	}

	@Test
	public void soln2() {
		System.out.println("Solution2");
		int i = 2, num = 0;
		input = new Scanner(System.in);
		System.out.println("Enter a number:");
		try {
			num = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid integer");

		}
		if (num <= 2) {
			System.out.println("The least prime number is 2, Hence enter a number greater than 2");
		} else {
			while (i <= num / 2) {
				if (num % i == 0) {
					flag = true;
					break;
				}
				i++;
			}
			if (flag == false) {
				System.out.println("Entered number is a Prime Number");
			} else
				System.out.println("Entered number is not a Prime Number");
		}

	}
}
