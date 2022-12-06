package javaPrograms;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern {

	public static void main(String[] args) {
		int startNum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the No. Of Rows:");
		int noOfRows = sc.nextInt();
		for (int row = 0; row < noOfRows; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(startNum + " ");
				startNum++;
			}
			System.out.println();
		}
		sc.close();
	}

}
