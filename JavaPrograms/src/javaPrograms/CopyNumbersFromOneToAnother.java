package javaPrograms;

public class CopyNumbersFromOneToAnother {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 89, 78, 34, 56 };
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println("Array 1 elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("Array 2 elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
	}

}
