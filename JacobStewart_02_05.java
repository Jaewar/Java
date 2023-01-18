/** Jacob Stewart
 * 	COP-2800-75800
 *  Prompts the user for a subtotal and gratuity rate, then computes the gratuity and total. 
*/
import java.util.*;

public class JacobStewart_02_05 {
	
	public static void main(String[] args) {
		// Create OBJ Scanner to read keyboard input.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter subtotal: ");
		// Input validation, reprompts user until a valid number is entered.
		while (!input.hasNextFloat()) {
			System.out.println("Please only enter numerical values.");
			System.out.println("Enter subtotal: ");
			// Tells program to wait for next user input.
			input.next();
		}
		// Assign user input to subTotal after passing input checking.
		float subTotal = input.nextFloat();
		
		System.out.println("Enter gratuity rate (%): ");
		// Input validation, reprompts user until a valid number is entered.
		while (!input.hasNextFloat()) {
			System.out.println("Please only enter numerical values.");
			System.out.println("Enter gratuity rate (%): ");
			// Forces program to wait for next user input.
			input.next();
		}
		// Convert user input to percentage and close input stream.
		float gratuityRate = input.nextFloat() / 100;
		input.close();
		
		//calculating gratuity amount (total * percentage)
		float gratuity = (subTotal * gratuityRate);
		
		// display total and gratuity (formatted to 2 decimal places)
		System.out.println("====== RESULT ======");
		System.out.println("Gratuity: $" + String.format("%.2f", gratuity));
		System.out.println("Total: $" + String.format("%.2f", subTotal + gratuity));
	}

}
