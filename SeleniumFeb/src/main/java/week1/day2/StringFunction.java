package week1.day2;

public class StringFunction {
		int i;
	
	/*String Class - Functions of String Class
	Total 34 functions we are going to see
	1) equals
	2) equalsIgnoreCase
	3) contains
	4) length
	5) toCharArray
	6) split
	7) replace
	8) charAt
	9) indexOf
	10) lastIndexOf
	*/
	public void test() {
		
		//String is a special class - supports two ways of defining objects
		
		String companyName = "TestLeaf Industries"; //Literal method of defining object
		//String company = new String("TestLeaf"); // Object 
		
		// Literal refers to the value on comparison using == operator
		
		String companyOne = "TestLeaf Industries";
		if(companyName == companyOne)
			System.out.println("Both are same - Literal");
		else
			System.out.println("Both are diff");
		
		// Object refers to the memory location on comparison using '==' operator
		String companyTwo = new String("TestLeaf Industries");
		if(companyName == companyTwo)
			System.out.println("Both are same");
		else
			System.out.println("Both are diff - obj(memory location is refered)"+companyTwo);
		//Hence the functions of String classes are used for comparison
		
		//1) equals
		if(companyName.equals(companyTwo))
				System.out.println("1) Both are same");
		
		//2)equalsIgnoreCase
		String company3 = "testleaf Industries";
		if(companyName.equalsIgnoreCase(company3)) {
			System.out.println("2) Both are same");
		}
		
		//3) Contains
		String company4 = "Industries";
		if(companyName.contains(company4)) {
			System.out.println("CompanyName '"+companyName+" Contains '"+company4+"'");
		}
			
		//4) Length
		System.out.println("Length of '"+companyName+"' is "+companyName.length());
		
		//5) toCharArray - converts the given string to a char array
		char[] charArray = companyName.toCharArray();
		System.out.println("Size of Char array is "+charArray.length);
		System.out.println("Using To Char array fn: ");
		for(i=0;i<charArray.length-1;i++) {
			System.out.println(charArray[i]);
		}
		
		//6) Split - converts the given string to a string array based on a delimeter
		String[] split1 = companyName.split(" ");
		System.out.println("Using Split fn: ");
		for(i=0;i<=split1.length-1;i++) { 
		System.out.println(split1[i]);
		}
		
		
		//7) replace - replaces the value provided (can take string/char/int etc data types
		System.out.println("Space is replaced with underscore: "+companyName.replace(' ', '_'));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFunction str = new StringFunction();
		str.test();
	}

}
