package javaPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1, count = 10, c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < count; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
