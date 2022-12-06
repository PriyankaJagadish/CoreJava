package javaPrograms;

import java.util.Scanner;

public class EveOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number:");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Number entered is an even number");
		} else {
			System.out.println("Number entered is an odd number");
		}

		sc.close();
	}

}
