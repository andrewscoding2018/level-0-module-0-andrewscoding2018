import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot moby = new Robot();
	moby.setX(100);
	moby.setSpeed(1000000);
	moby.penDown();
	moby.move(150);

	for(int repeat = 0; repeat < 6; repeat++)
	{
		moby.move(150);
		moby.turn(90);
	}
	moby.move(300);
	}
}
	
