//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		
		// 11. Repeat steps 1 to 10 ten times
		for(int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String userGuess = JOptionPane.showInputDialog("Guess a number between 1 and 100.");
			int numGuesses = 9 - i;

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guessNum = Integer.parseInt(userGuess);
			
			// 5. if the guess is correct
			if(guessNum == random) {
				// 6. Win
				JOptionPane.showMessageDialog(null, "You guessed right! YOU WIN!");
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
				System.exit(0);
			} else if (guessNum > random) { 
				// 7. if the guess is high
				// 8. Tell them it's too high
				JOptionPane.showMessageDialog(null, "Your guess is too high. Try again. You have " + numGuesses + " chances to guess remaining.");
			} else {
				// 9. if the guess is low
				// 10. Tell them it's too low
				JOptionPane.showMessageDialog(null, "Your guess is too low. Try again. You have " + numGuesses + " chances to guess remaining.");
			}
		}

		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "No more guesses left. YOU LOSE!");
		
	}

}


