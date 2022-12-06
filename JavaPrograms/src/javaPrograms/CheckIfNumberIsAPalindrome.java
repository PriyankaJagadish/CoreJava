package javaPrograms;

public class CheckIfNumberIsAPalindrome {

	public static void main(String[] args) {
		int num1 = 78967987;
		int reverse = 0;
		int num = num1;
		while (num1 != 0) {
			int remainder = num1 % 10;
			reverse = reverse * 10 + remainder;
			num1 = num1 / 10;
			System.out.println(reverse);
		}
		if (num == reverse) {
			System.out.println("Entered number is a palindrome!");
		} else {
			System.out.println("Entered number is not a palindrome!");
		}
	}

}
