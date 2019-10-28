//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		while(true) {
			//3. Ask the user what color they would like the robot to draw
			String colorChosen = JOptionPane.showInputDialog("What color would you like the robot to draw?");
			Color penColor = null;
			
			//5. Use an if/else statement to set the pen color that the user requested
			if (colorChosen == null) {
				System.exit(0);
			} else if (colorChosen.equalsIgnoreCase("red")) {
				penColor = Color.RED;
			} else if (colorChosen.equalsIgnoreCase("green")) {
				penColor = Color.GREEN;
			} else if (colorChosen.equalsIgnoreCase("blue")) {
				penColor = Color.BLUE;
			} else if (colorChosen.equalsIgnoreCase("yellow")) {
				penColor = Color.YELLOW;
			} else if (colorChosen.equalsIgnoreCase("black")) {
				penColor = Color.BLACK;
			} else if (colorChosen.equalsIgnoreCase("orange")) {
				penColor = Color.ORANGE;
			} else if (colorChosen.equalsIgnoreCase("white")) {
				penColor = Color.WHITE;
			} else {
				rob.setRandomPenColor(); //6. If the user doesn’t enter anything, choose a random color
			}

			if (penColor != null) rob.setPenColor(penColor);

			
			//4. Set the pen width to 10
			rob.setPenWidth(10);
			
		    //2. Make the robot draw a shape (this will take more than one line of code)
			rob.show();
			rob.setSpeed(100);
			rob.penDown();
			
			int numSides = 8;
			int sideLength = 100;
			
			for(int i = 0; i < numSides; i++) {
				rob.move(sideLength);
				rob.turn(360/numSides);
			}
			
			rob.hide();
		} // END WHILE LOOP
		
	}
}
