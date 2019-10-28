package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		// 1. Make a new class, create a main method, and show the robot.
		Robot rob = new Robot();
		rob.show();
		rob.penDown();
		rob.setSpeed(100);
		
		// 2. Have the robot draw a square.
		// 3. Extract this code into a drawSquare() method.
		// drawSquare(rob);
		
		// 4. Have the robot draw a triangle.
		// 5. Extract this code into a drawTriangle() method.
		// drawTriangle(rob);
		
		// 6. Have the robot draw a circle.
		// 7. Extract this code into a drawCircle() method.
		// drawCircle(rob);
		
		
		// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
		String shapeChoice = JOptionPane.showInputDialog("What shape should the robot draw? (circle, square, or triangle)");
		String colorChoice = JOptionPane.showInputDialog("What color do you want the shape? (red, blue, green, yellow)");
		Color penColor = null;
		
		// 9. Ask the user which color they want. Give them some choices so you don't have to accommodate every possible color. Color the the shape depending on their answer.
		if(colorChoice.equalsIgnoreCase("red")) {
			penColor = Color.RED;
		} else if (colorChoice.equalsIgnoreCase("blue")) {
			penColor = Color.BLUE;
		} else if (colorChoice.equalsIgnoreCase("green")) {
			penColor = Color.GREEN;
		} else if (colorChoice.equalsIgnoreCase("yellow")) {
			penColor = Color.YELLOW;
		} else {
			JOptionPane.showMessageDialog(null, "Oops. I don't know that color.");
			System.exit(0);
		}
		rob.setPenColor(penColor);
		
		if(shapeChoice.equalsIgnoreCase("circle")) {
			drawCircle(rob);
		} else if (shapeChoice.equalsIgnoreCase("square")) {
			drawSquare(rob);
		} else if (shapeChoice.equalsIgnoreCase("triangle")) {
			drawTriangle(rob);
		} else {
			JOptionPane.showMessageDialog(null, "Oops. I don't know that shape.");
			System.exit(0);
		}
	}
	
	static void drawSquare(Robot rob) {
		for(int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
	static void drawTriangle(Robot rob) {
		for(int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	
	static void drawCircle(Robot rob) {
		for(int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
