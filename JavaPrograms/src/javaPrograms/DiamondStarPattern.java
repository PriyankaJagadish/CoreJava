package javaPrograms;

public class DiamondStarPattern {

	public static void main(String[] args) {
		for (int rows = 1; rows < 5; rows++) {
			// Decreasing space pattern
			for (int cols = rows; cols <= 5; cols++) {
				System.out.print("  ");
			}
			// Increasing star pattern
			for (int cols = 1; cols <= rows; cols++) {
				System.out.print("* ");
			}
			// Decreasing Star Pattern
			for (int cols = 1; cols < rows; cols++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int rows = 1; rows <= 5; rows++) {
			for (int cols = 1; cols <= rows; cols++) {
				System.out.print("  ");
			}
			for (int cols = rows; cols <= 5; cols++) {
				System.out.print("* ");
			}
			for (int cols = rows; cols < 5; cols++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
