package javaPrograms;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Hi! Hello! How Are You?";
		String str1 = "HI! HELLO! HOW ARE YOU?";
		int num = 10;

		// charAt(indexPosition),length(),equals(),equalsIgnoreCase(),isEmpty(),contains(),substring(beginIndex),substring(beginIndex,endIndex),
		// concat(),replace(),indexOf(),trim(),String.valueOf(),toLowerCase(),toUpperCase(),join()

		System.out.println("Char At index Position: " + str.charAt(1));

		System.out.println("String Length is: " + str.length());

		System.out.println("String Equals Check: " + str.equals(str1));

		System.out.println("String Equals Check: " + str.equalsIgnoreCase(str1));

		System.out.println("String Is Empty Check: " + str.isEmpty());

		System.out.println("String SubString: " + str.substring(0, 8));

		System.out.println("Srring Concat: " + str.concat(str1));

		System.out.println("String Replace: " + str.replace("i", "I"));

		System.out.println("String Index: " + str.indexOf("H"));

		System.out.println("String trim: " + str.trim());

		System.out.println("String value of a number: " + String.valueOf(num));

		System.out.println("String ToLowerCase: " + str.toLowerCase());

		System.out.println("String ToUpperCase: " + str.toUpperCase());

		System.out.println("String join: " + String.join("-", "Learn", "Automation", "Online"));

		String splitArray[] = str.split(" ");
		System.out.println("String Split:");
		for (String str2 : splitArray) {
			System.out.println(str2);
		}
	}

}
