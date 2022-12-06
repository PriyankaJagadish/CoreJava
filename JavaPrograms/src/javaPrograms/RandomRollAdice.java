package javaPrograms;

import java.util.Random;

public class RandomRollAdice {

	public static void main(String[] args) {
		Random num = new Random();
		int Number = num.nextInt(6) + 1;
		System.out.println(Number);

	}

}
