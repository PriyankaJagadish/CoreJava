package javaPrograms;

public class SwappingNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println("Numbers before swapping " + a + "\s" + b);

		// Using addition and subtraction
		a = a + b; // 10+15
		b = a - b; // 25-10
		a = a - b; // 25-15
		System.out.println("Numbers after swapping using Addition and Subtraction " + a + "\s" + b);

		// Using Multiplication and Division
		a = a * b; // 10*15 = 150
		b = a / b; // 150/15 = 10
		a = a / b; // 150/10 = 15
		System.out.println("Numbers after swapping using Multiplication and Division " + a + "\s" + b);

	}

}
