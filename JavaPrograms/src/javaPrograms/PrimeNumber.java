package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int count;
		int noOfPrimeNumbers = 0;
		System.out.println("The Prime numbers from 1 to 100 are :");
		for (int i = 2; i <= 100; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				noOfPrimeNumbers++;
				System.out.println(i);
			}
		}
		System.out.println("No Of prime Numbers from 1 to 100 is:" + noOfPrimeNumbers);
	}

}
