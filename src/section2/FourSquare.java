package section2;

import org.jointheleague.graphical.robot.Robot;


public class FourSquare {

	// 2. Create a new Robot
	Robot kieu = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		kieu.setSpeed(200);
		

		// 5. Set the pen width to 5
		kieu.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			

		// 7. Set the pen color to random
			kieu.setRandomPenColor();
		// 1. Call the drawSquare() method
		drawSquare();

		// 8. Turn the robot 90 degrees to the right
		kieu.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		kieu.penDown();
		for (int i = 0; i < 4; i++) {

			kieu.move(150);
			kieu.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
