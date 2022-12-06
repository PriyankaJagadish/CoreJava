package javaPrograms;

import java.util.Scanner;

public class PrintingShapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter No Of Rows:");
		int noORows = sc.nextInt();
		System.out.println("Please enter No Of Cols:");
		int noOfCols = sc.nextInt();
		System.out.println("Shapes");
		for (int row = 0; row < noORows; row++) {
			for (int col = 0; col < noOfCols; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
