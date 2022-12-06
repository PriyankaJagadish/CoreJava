package javaPrograms;

public class HillStarPattern {

	public static void main(String[] args) {
		System.out.println("Hill Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {// Decreasing triangle Pattern with only spaces
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {// Increasing triangle Pattern with stars
				System.out.print("* ");
			}
			// For getting the pointed triangle here the condition is j<i not j<=i
			for (int j = 1; j < i; j++) {// Increasing triangle Pattern with stars
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		// Inverted Hill Pattern
		System.out.println("Inverted Hill Pattern");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {// Increase triangle Pattern with only spaces
				System.out.print("  ");
			}
			for (int j = i; j <= 5; j++) {// Decreasing triangle Pattern with stars
				System.out.print("* ");
			}
			// For getting the pointed triangle here the condition is j<5 not j<=5
			for (int j = i; j < 5; j++) {// Decreasing triangle Pattern with stars
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
