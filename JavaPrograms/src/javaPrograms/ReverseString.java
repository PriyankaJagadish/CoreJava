package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Reverse Me!";

		// Using StringBuilder
		StringBuilder sb = new StringBuilder(s);
		System.out.println("Reverse String Using StringBuilder :" + sb.reverse());

		// Using StringBuffer
		StringBuffer sb1 = new StringBuffer();
		sb1.append(s);
		System.out.println("Reverse String Using StringBuffer :" + sb1.reverse());

		// Using for loop
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse String using for loop:" + reverse);

		// Using Collections List
		char[] charArray = s.toCharArray();
		List<Character> al = new ArrayList<Character>();
		for (Character char1 : charArray) {
			al.add(char1);
		}

		Collections.reverse(al);
		System.out.println(al);

		// Display using Enhanced For Loop
		for (Character char2 : al) {
			System.out.println(char2);
		}

		// Display using ListIterator
		Iterator<Character> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
