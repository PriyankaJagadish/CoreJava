package javaPrograms;

public class DisplayOnlyNumbersFromAGivenString {

	public static void main(String[] args) {
		String s = "abc123abc";
		String s1 = s.replaceAll("[^0-9]", " ");
		System.out.println(s1.trim());

	}

}
