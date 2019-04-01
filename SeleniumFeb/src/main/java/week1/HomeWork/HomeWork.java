package week1.HomeWork;

import java.util.Scanner;

public class HomeWork {
	int i;

	public void oddIndex() {
		System.out.println("Program1:");
		String name = new String("sivaharasankar");
		String upperCase = name.toUpperCase();
		char[] uArray = upperCase.toCharArray();
		char[] nArray = name.toCharArray();
		for (i = 1; i < nArray.length; i++) {
			if (i % 2 != 0) {
				nArray[i] = uArray[i];
			}
		}
		System.out.println("After converting every odd index to Uppercase: ");
		for (i = 0; i < nArray.length; i++) {
			System.out.print(nArray[i]);
		}
	}

	public void armStrong() {

		// 153, 370, 371, 407
		System.out.println("\n\nProgram2");

		int num = 0, tempNum, temp1, temp2, noDigits = 0, armStrong = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 digit number");

		try {
			num = input.nextInt();
			input.close();
		} catch (Exception e) {

			System.out.println("Input Not valid");

			// TODO Auto-generated catch block
			// Uncomment and replace with appropriate logger
			// LOGGER.error(e, e);
		}
		tempNum = num;
		temp1 = num;

		// System.out.println(tempNum+","+temp1);
		while (tempNum > 0) {
			tempNum = tempNum / 10;
			noDigits++;
		}
		if (noDigits == 3) {
			while (num > 0) {
				temp2 = num % 10;
				num = num / 10;
				armStrong = armStrong + (temp2 * temp2 * temp2);
			}
			if (armStrong == temp1) {
				System.out.println("The entered number: '" + temp1 + "' is an ArmStrong Number");
			} else {
				System.out.println("The entered number: '" + temp1 + "' is not an ArmStrong Number");
			}
		} else {
			System.out.println("Enter a valid 3 digit number");
		}

	}

	public void nonWhiteSpace() {
		System.out.println("\n\nProgram3");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a statement:");
		String stmt = input.nextLine();
		input.close();
		String replaced = stmt.replace(" ", "");
		System.out.println(
				"The Number of non-WhiteSpace in the entered statement '" + stmt + "' is: " + replaced.length());
	}

	public void nameStartsWithS() {
		System.out.println("\n\nProgram4");
		String[] nameList = { "SivaG", "Preethi", "Dhivya", "Deeps", "Syllappan", "sam" };
		String sNames = "";
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].charAt(0) == 's' || nameList[i].charAt(0) == 'S') {
				sNames = sNames + nameList[i] + ",";
			}
		}
		System.out.println("\nNames which starts with 'S' from the given list are:\n" + sNames);
	}

	public static void main(String[] args) {
		HomeWork home = new HomeWork();
		home.oddIndex();
		home.armStrong();
		// home.nonWhiteSpace();
		home.nameStartsWithS();
		// System.out.println(37/10);
		// System.out.println(37%10);
	}

}
