package javaPrograms;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		System.out.println("Left Triangle Pattern/Floyds Triangle Pattern");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Inverted triangle Pattern
		System.out.println("Inverted Triangle Pattern");
		for (int i = 5; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
