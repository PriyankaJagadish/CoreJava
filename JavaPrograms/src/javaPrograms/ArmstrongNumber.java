package javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;
		int number1 = 0;
		int number2 = number;
		while (number != 0) {
			int remainder = number % 10;
			number1 = (remainder * remainder * remainder) + number1;
			number = number / 10;
		}
		if (number1 == number2) {
			System.out.println(number1);
			System.out.println("Entered Number is an Armstrong Number");
		} else {
			System.out.println("Entered Number is not an Armstrong Number");
		}
	}

}
