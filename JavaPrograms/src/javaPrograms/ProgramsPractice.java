package javaPrograms;

import java.util.Arrays;
import java.util.Random;

public class ProgramsPractice {

	public static void main(String[] args) {
		// Armstrong Number
		int num = 153;
		int orgNum = num;
		int num1 = 0;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			num1 = (rem * rem * rem) + num1;
			num = num / 10;
		}
		if (orgNum == num1) {
			System.out.println("Entered number is an Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

		// AscendingOrderArrays
		int arr[] = { 95, 89, 7, 10, 29 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));

		// Number Palindrome Check
		int number = 90809;
		int number1 = number;
		int reverse = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

		}
		if (reverse == number1) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not a Palindrome");
		}

		// String Palindrome Check
		String str = "mom";
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);

		}
		if (reverseStr.equalsIgnoreCase(str)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a Palindrome String");
		}

		// Factorial of a Number
		int factNum = 5;
		int factorial = 1;
		while (factNum != 0) {
			factorial = factorial * factNum;
			factNum = factNum - 1;
		}
		System.out.println("Factorial Of the given Number is:" + factorial);

		// Fibonacci Series 0,1,1,2,3,5,8,13,21,34,55,89
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);

		for (int i = 2; i < 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		// Swapping Numbers Using third Variable

		int A = 10;
		int B = 15;
		int temp1;
		temp1 = B;
		B = A;
		A = temp1;
		System.out.println("A is:" + A);
		System.out.println("B is:" + B);

		// Swapping Numbers withoud third variable

		int A1 = 1;
		int B1 = 3;
		A1 = A1 + B1; // 1+3
		B1 = A1 - B1;// 4-3 = 1
		A1 = A1 - B1;// 4-1 = 3

		System.out.println("A1 is:" + A1);
		System.out.println("B1 is:" + B1);

		// RandomRollADice

		Random r = new Random();
		int randomNum = r.nextInt(6) + 1;
		System.out.println(randomNum);

		// Reverse a negative number
		int negNumber = -908223;
		int negRem = 0;
		int negRev = 0;
		if (negNumber < 0) {
			negNumber = negNumber * -1;
		}
		while (negNumber != 0) {
			negRem = negNumber % 10;
			negRev = negRev * 10 + negRem;
			negNumber = negNumber / 10;

		}
		System.out.println(negRev * -1);

		// Fibonacci Upto 100

		int firstNum = 0;
		int secondNum = 1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		int thirdNum;
		for (int i = 2; i < 15; i++) {
			thirdNum = firstNum + secondNum; // 0+1 = 1
			firstNum = secondNum; // 1
			secondNum = thirdNum; // 1
			if (thirdNum <= 100) {
				System.out.println(thirdNum);
			}
		}

	}
}
