package javaPrograms;

public class CountEvenOddNumbers {
	public static void main(String[] args) {
		int evenCount = 0, oddCount = 0;
		for (int i = 1; i <= 250; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("No: Of even Numbers" + evenCount);
		System.out.println("No: Of odd Numbers" + oddCount);
	}

}
