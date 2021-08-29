package util;
import java.util.Scanner;

public class UserInput {
	public static void call() {
		/*
		 * "Scanner" object allows the input of alphanumeric characters
		 * from several input sources and converts them into binary data
		 * 
		 * "System.in" is an input stream from the console.
		 * Only keyboard input while the console has focus.
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		/* 
		 * Assigns "name" variable to whatever the next entered line is.
		 * Program is paused until user input is entered
		 */
		String name = scanner.nextLine();
		
		System.out.println("How old are you? ");
		/* 
		 * "scanner.nextint()" only accepts a whole integer.
		 *
		 * If the incorrect value is input, an exception is thrown.
		 * 
		 */
		int age = scanner.nextInt();
		
		/*
		 * Scanner needs to be cleared calls,
		 * or else it will skip, because pressing 'enter' after "nextInt()" creates
		 * `\n`, which is automatically consumed by the next invocation of "nextLine()"
		 * 
		 */
		scanner.nextLine();
		
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name + ".");
		System.out.println("You are " + age + " years old!");
		System.out.println("You like " + food + ".");
		

	}
}
