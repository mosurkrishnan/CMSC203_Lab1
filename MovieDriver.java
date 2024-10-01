package Lab1;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		char repeat; // for y/n do-while loop
		
		Scanner keypad = new Scanner(System.in);
		/*
		 * Create a new object of type Scanner that reads from the keyboard
		 * Create a new movie object
		 * Prompt the user to enter the title of a movie 
		 * Read in the line that the user types
		 * Set the title in the movie object
		 * Prompt the user to enter the movie’s rating
		 * Read in the line that the user types
		 * Set the rating in the movie object
		 * Prompt the user to enter the number of tickets sold at a (unnamed) theater
		 * Read in the integer that the user types
		 * Set the number of tickets sold in the movie object
		 * Print out the information using the movie’s toString method
		 */
		
		// Create a new object of type Scanner that reads from the keyboard
		Movie m1 = new Movie();
		
		//Do-While Loop for y/n - repeat question
				do {
				
				// Prompt the user to enter the title of a movie 
				System.out.print("Enter title of a movie: ");
				String title = keypad.nextLine();
				
				// Prompt the user to enter the movie’s rating
				System.out.print("Enter movie's rating: ");
				String rating = keypad.nextLine();
				
				// Prompt the user to enter the number of tickets sold at a (unnamed) theater
				System.out.print("Enter number of tickets sold at a (unnamed) theater: ");
				int soldTickets = keypad.nextInt();
				
				keypad.nextLine(); // for keyboard buffer
				
				m1 = new Movie(title, rating, soldTickets);
				
				// Print out the information using the movie’s toString method
				System.out.println(m1.toString());	
				
				// Ask the user if they want to continue, and continue the loop if the user 
				// types the correct response. 
				System.out.print("Do you want to enter another - type y/n:  ");
				String input = keypad.nextLine();
				repeat = input.charAt(0);
				
				} while (repeat == 'Y' || repeat == 'y');
				
				keypad.close(); // closing keypad
				System.out.println("Goodbye");

	}

}
