package javaPrograms;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Priyanka");
		System.out.println("String Reverse: " + str.reverse());

		StringBuffer str1 = new StringBuffer("PriyankaJagadish");
		System.out.println("String Replace: " + str1.replace(0, 3, "PRIY"));

		StringBuffer str2 = new StringBuffer("XYZPriyanka");
		System.out.println("String Delete: " + str2.delete(0, 3));

		StringBuffer str3 = new StringBuffer("Pri");
		System.out.println("String Insert: " + str3.insert(3, "yanka"));

		System.out.println("Cpacity Of StringBuffer: " + str3.capacity());
		System.out.println("Char At index Position: " + str.charAt(1));
		System.out.println("StringBuffer String Length is: " + str.length());
		System.out.println("StringBuffer SubString: " + str3.substring(0, 5));

	}

}
