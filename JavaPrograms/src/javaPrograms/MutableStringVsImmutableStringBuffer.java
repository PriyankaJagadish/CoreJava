package javaPrograms;

public class MutableStringVsImmutableStringBuffer {

	public static void main(String[] args) {
		System.out.println("String is IMMUTABLE");
		System.out.println("*******************");
		String name = "Priyanka";
		System.out.println("After Appending:" + name.concat("Jagadish"));
		System.out.println("Original Name:" + name);

		System.out.println();
		System.out.println("StringBuffer is MUTABLE");
		System.out.println("***********************");

		StringBuffer name1 = new StringBuffer("Priyanka");
		System.out.println("After Appending:" + name1.append("Jagadish"));
		System.out.println("Original Name:" + name1);

	}

}
