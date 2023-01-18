import java.util.*;

/**
 * Jacob Stewart 
 * COP-2800-75800 
 * A program that plays the popular rock-paper-scissors game.
 * The program randomly generates a number 0, 1, or 2 representing scissors, rock and paper. 
 * Prompts the user to enter a number 0, 1, or 2 and displays a message indicating
 * whether the user or the computer wins, loses or draws.
 */

public class JacobStewart_03_17 {

	public static void main(String[] args) {
		// create Scanner OBJ to read input.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Rock, Paper, Scissors, SHOOT! \nEnter your selection: 0, 1 or 2.");
		
		// loop to continue prompting user until they wish to quit.
		while (true) {
			// display values and get keyboard input.
			System.out.println("0 = Rock, 1 = Paper, 2 = Scissors\nType 'quit' to exit the game.");
			String userResponse = input.nextLine();
			
			// if user enters quit loop is broken
			if (userResponse.equalsIgnoreCase("quit")) {
				// closing input stream
				input.close();
				break;
			}
			
			// validates if user entered a correct response. reprompts.
			if (!userResponse.equals("0") && !userResponse.equals("1") && !userResponse.equals("2")) {
				System.out.println("Invalid Response: " + userResponse);
			} else {
				// generate a random number between 0 and 2
				int randomNumber = (int) (Math.random() * 3);
				// converts random number to string for easier comparison
				String cpuResponse = Integer.toString(randomNumber);
				// System.out.println(cpuResponse); //testing cpu response
				// if values are the same its a draw.
				if (userResponse.equals(cpuResponse)) {
					System.out.println("DRAW!");
					
				} else {
					// compare responses and displays win conditions
					if ((userResponse.equals("0") && cpuResponse.equals("2"))) {
						System.out.println("YOU WIN! Rock beats Scissors!");
					} else if ((userResponse.equals("1") && cpuResponse.equals("0"))) {
						System.out.println("YOU WIN! Paper beats Rock!");
					} else if ((userResponse.equals("2") && cpuResponse.equals("1"))) {
						System.out.println("YOU WIN! Scissors beats Paper!");
						
					// compare responses and displays lose conditions	
					} else if ((userResponse.equals("0") && cpuResponse.equals("1"))) {
						System.out.println("YOU LOSE! Paper beats Rock!");
					} else if ((userResponse.equals("1") && cpuResponse.equals("2"))) {
						System.out.println("YOU LOSE! Scissors beats Paper!");
					} else if ((userResponse.equals("2") && cpuResponse.equals("0"))) {
						System.out.println("YOU LOSE! Rock beats Scissors!");
					} 
				}
			}
		}
		// output to lets user know program is terminated.
		System.out.println("Rock, Paper, Scissors, CLOSE.");
	}
}
