/** Jacob Stewart
 * 	COP-2800-75800
 *  Displays the area and perimeter of a rectangle with a width of 4.5 and height of 7.9
 */

public class JacobStewart_01_09 {
	
	public static void main(String[] args) {
		
		// declaring variables to predetermined values.
		final double WIDTH = 4.5;
		final double HEIGHT = 7.9;
		
		// calulating area/perimeter and converting to float values.
		float rectArea = (float) (WIDTH * HEIGHT);
		float rectPerimeter = (float) (2 * (WIDTH + HEIGHT));
		
		// prints result of area and perimeter of given rectangle.
		System.out.println("Area: " + rectArea + "\nPerimeter: " + rectPerimeter);
		
	}

}
