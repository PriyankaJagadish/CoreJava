package javaPrograms;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		num = sc.nextInt();
		if (num == 1) {
			fact = num;
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
		}
		sc.close();
		System.out.println("Factorial is\s:" + fact);
	}

}
