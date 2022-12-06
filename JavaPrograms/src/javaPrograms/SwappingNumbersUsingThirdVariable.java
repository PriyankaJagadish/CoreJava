package javaPrograms;

public class SwappingNumbersUsingThirdVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c;
		System.out.println("Before Swapping: a is :" + a + " b is:" + b);

		c = b;
		b = a;
		a = c;
		System.out.println("After Swapping: a is :" + a + " b is:" + b);

	}

}
