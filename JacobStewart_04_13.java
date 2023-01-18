import java.util.*;

/**
 * Jacob Stewart 
 * COP-2800-75800 
 * Prompts the user to enter a letter and displays
 * to the user whether the letter is a vowel or consonant.
 */

public class JacobStewart_04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a letter! Use 'quit' to quit. ");
			String[] vowels = { "A", "E", "I", "O", "U" };
			String userLetter = input.nextLine();
			boolean isVowel = false;
			if (userLetter.equalsIgnoreCase("quit")) {
				break;
			}
			if (userLetter.length() > 1 || userLetter.isEmpty() || userLetter.matches((".*[0-9].*"))) {
				System.out.println("ERROR || Input only a single letter.");
			} else {
			for (String i : vowels) {
				if (userLetter.toUpperCase().contains(i)) {
					System.out.println(userLetter.toUpperCase() + " is a Vowel.");
					isVowel = true;
					break;
				} else {
					isVowel = false;
				}
			}
			if (!isVowel) {
				System.out.println(userLetter.toUpperCase() + " is a Consonant.");
			}
			}
		}
		input.close();
	}
}
