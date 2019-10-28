
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String jakesBirthday = "July 16th";
		String emmasBirthday = "October 8th";
		String myBirthday = "July 21st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String nameInput = JOptionPane.showInputDialog("Whose birthdate do you want? (Emma, Jake, or Andrew)");
	
		// 3. Print out what the user typed
		System.out.println(nameInput);
		
		// 4. if user asked for "mom" ("jake")
		if(nameInput.equalsIgnoreCase("jake")) {
			//print mom's birthday
			JOptionPane.showMessageDialog(null, jakesBirthday);
		} else if (nameInput.equalsIgnoreCase("emma")) { // 5. if user asked for "dad" ("emma")
			// print dad's birthday
			JOptionPane.showMessageDialog(null, emmasBirthday);
		} else if (nameInput.equalsIgnoreCase("andrew")) { // 6. if user asked for your name ("andrew")
			// print myBirthday
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	} 
}
