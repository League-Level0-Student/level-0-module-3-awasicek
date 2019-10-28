package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		// 1. Are you happy?
		String inputHappy = JOptionPane.showInputDialog("Are you happy?");
		
		if(inputHappy.equalsIgnoreCase("yes")) { // 1a. Yes, I am happy
			// Keep doing whatever you are doing!
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		} else if (inputHappy.equalsIgnoreCase("no")) { // 1b. No, I am not happy
			// 2. Do you want to be happy?
			String inputWantHappy = JOptionPane.showInputDialog("Do you want to be happy?");
			if(inputWantHappy.equalsIgnoreCase("yes")) { // 2a. Yes, I want to be happy
				// Change something
				JOptionPane.showMessageDialog(null, "Change something!");
			} else if (inputWantHappy.equalsIgnoreCase("no")) { // 2b. No, I do not want to be happy
				// Keep doing whatever you are doing!
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
			}
		}
		
	}
}
