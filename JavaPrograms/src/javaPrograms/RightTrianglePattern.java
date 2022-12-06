package javaPrograms;

public class RightTrianglePattern {

	public static void main(String[] args) {
		System.out.println("Right Triangle Pattern");
		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("Inverted Right Triangle Pattern: Method 1");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("Inverted Right Triangle Pattern: Method 2");
		for (int i = 5; i >= 0; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
