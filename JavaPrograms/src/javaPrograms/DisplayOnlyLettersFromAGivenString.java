package javaPrograms;

public class DisplayOnlyLettersFromAGivenString {

	public static void main(String[] args) {
		String s = "123 abc 456";
		String s1 = s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(s1.trim());

	}

}
