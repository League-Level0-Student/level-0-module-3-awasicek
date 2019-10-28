
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		rob.setSpeed(100);
		rob.penDown();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		int xPos = 100;

		rob.setX(xPos);
		
		// You also need to show the robot to see the result of this line.
		
		int numStars = 10;
		
		for(int j = 0; j < numStars; j++) {
			// 2. Make the robot draw a star shape. Hint: 144.
			for(int i = 0; i < 5; i++) {
				rob.turn(144);
				rob.move(30); // 3. Set the size of the star to 30.
			}
			xPos += 50;
			rob.setX(xPos);
		}


		

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
