package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot kate = new Robot ();	
		kate.move(200);
		kate.setSpeed(200);
		kate.turn(90);
		kate.penDown();
		kate.move(150);
		kate.turn(90);
		kate.penDown();
		kate.move(150);
		kate.turn(90);
		kate.penDown();
		kate.move(150);
		kate.turn(90);
		kate.penDown();
		kate.move(150);
		kate.penUp();
		kate.turn(180);
		kate.move(300);
		kate.setPenColor(Color.BLUE);
		kate.penDown();
		for(int i=0; i < 4; i++){
		kate.penDown();
		kate.move(100);
		kate.turn(90);
		}
		kate.turn(90);
		kate.penUp();
		kate.move(100);
		kate.turn(90);
		kate.move(150);
		kate.setPenColor(Color.BLACK);
		kate.penDown();
		kate.move(150);
		kate.turn(180);
		kate.move(150);
		kate.turn(90);
		kate.move(150);
	}
}
