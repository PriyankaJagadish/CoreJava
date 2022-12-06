package javaPrograms;

public class ReverseANegativeNumber {

	public static void main(String[] args) {
		int num = -90822;
		int reverse = 0;

		if (num == 0) {
			System.out.println(num);
		} else if (num < 0) {
			num = num * -1;
			while (num != 0) {
				int remainder = num % 10;
				reverse = reverse * 10 + remainder;
				num = num / 10;
			}
			System.out.println(reverse * -1);
		} else {
			while (num != 0) {
				int remainder = num % 10;
				reverse = reverse * 10 + remainder;
				num = num / 10;
			}
			System.out.println(reverse);
		}
	}

}
