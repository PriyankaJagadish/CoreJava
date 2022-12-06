package javaPrograms;

public class CheckIfStringIsAPanlindrome {

	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println("Entered String is a Palindrome!");
		} else {
			System.out.println("Entered String is not a Palindrome!");
		}

	}

}
