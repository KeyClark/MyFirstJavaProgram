package util;

public class BasicDataTypes {

	public static void call() {
		int a; // declaration
		a = 123; // assignment; no need to append on int values
		System.out.println("The int value of a is: " + a);
		
		int b = 456; // initialization (combining declaration & assignment)
		System.out.println("The int value of b is: " + b);
		
		long c = 1234567890987654321L; // long values are appended with "L"
		System.out.println("The long value of c is: " + c);
		
		float d = 3.14f; // float values are appended with "f"
		System.out.println("The float value of d is: " + d);
		
		double e = 3.141926535; // double do not need indication at the end, or append with "d"
		System.out.println("The double value of e is: " + e);
		
		boolean f = false;
		System.out.println("The boolean value of f is: " + f);
		
		char symbol = '@'; // must use single-quotes
		System.out.println("My char symbol is: " + symbol);
		
		String name = "Ja'keh"; // reference types begin with a capital letter, double quotes
		System.out.println("My name is: " + name);
	}

}
