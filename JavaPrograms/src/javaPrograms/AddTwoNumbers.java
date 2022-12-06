package javaPrograms;
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter Number1:");
		num1 = sc.nextInt();
		System.out.println("Enter Number2:");
		num2 = sc.nextInt();
		num3 = num1 + num2;
		System.out.println("Sum Of Two Numbers is\s" + num3);
		sc.close();
	}

}
