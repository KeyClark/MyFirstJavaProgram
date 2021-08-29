package util;

public class SwitchVariables {

	public static void call() {
		String x = "water";
		String y = "La Croix";
		
		/*
		 * prepending "final" before declarations makes immutable,
		 * 		i.e.:
		 * 			final String x = "some string";
		 */
		
		// Switching the values of [x,y] by storing x in a temporary variable
		String temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
