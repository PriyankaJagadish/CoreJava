package javaPrograms;

public class FibonacciUpto100 {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			if (c <= 100) {
				System.out.println(c);
				a = b;
				b = c;
			}

		}

	}

}
