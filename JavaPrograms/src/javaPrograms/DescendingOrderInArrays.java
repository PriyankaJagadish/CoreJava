package javaPrograms;

import java.util.Arrays;

public class DescendingOrderInArrays {

	public static void main(String[] args) {
		int[] array = { 89, 90, 23, 95, 76 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(array));
	}

}
