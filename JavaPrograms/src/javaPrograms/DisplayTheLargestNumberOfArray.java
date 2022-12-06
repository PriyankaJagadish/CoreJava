package javaPrograms;

public class DisplayTheLargestNumberOfArray {

	public static void main(String[] args) {
		int arr[] = { 12, 90, 89, 45, 67 };
		int s = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (s < arr[i]) {
				s = arr[i];
			}
		}
		System.out.println(s);
	}

}
