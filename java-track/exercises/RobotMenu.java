import java.util.Scanner;
import java.util.ArrayList;

public class RobotMenu 
{
	private ArrayList<Robot> robots;
	private Scanner scan;
	
	public static void main(String[] args) 
	{
		int input = 0;
		RobotMenu menu = new RobotMenu();
		do 
		{
			input = menu.startMenu();
			menu.processInput(input);
		} while (input != 6);
	}
	
	public RobotMenu() 
	{
		scan = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu() 
	{
		System.out.println("-- robot menu --\n" + 
				"1. create robot\n" + 
				"2. display available robots\n" +
				"3. move a robot\n" +
				"4. rotate a robot\n" +
				"5. compute distance between 2 robots\n" + 
				"6. exit\n" +
				"please select an option: ");
		int selection = scan.nextInt();
		while (selection < 1 || selection > 6) 
		{
			System.out.println("invalid selection, please try again: ");
			selection = scan.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection) 
	{
		if (selection == 1) createRobot();
		else if (selection == 2) displayRobots();
		else if (selection == 3) 
		{
			displayRobots();
			Robot r1 = selectRobot();
			System.out.println("enter speed (# of units to move): ");
			int speed = scan.nextInt();
			r1.move(speed);
			System.out.println("robot's status after moving:\n" + r1);
		}
		else if (selection == 4) 
		{
			displayRobots();
			Robot r1 = selectRobot();
			System.out.println("turn robot left/right, enter L or R: ");
			String orientation = scan.next();
			if (orientation == "L") r1.turnLeft();
			else if (orientation == "R") r1.turnRight();
			System.out.println("robot's status after turning:\n" + r1);
		}
		else if (selection == 5) 
		{
			displayRobots();
			Robot r1 = selectRobot();
			Robot r2 = selectRobot();
			System.out.println("distance between selected robots: " + r1.checkDist(r2));
		}
		else if (selection == 6) System.exit(0);
	}
	
	private void displayRobots() 
	{
		for (int i = 0; i < robots.size(); i++) 
		{
			System.out.println((i+1) + ") " + robots.get(i));
		}
	}
	
	private Robot selectRobot() 
	{
		System.out.println("select a robot by #: ");
		int selection = scan.nextInt();
		while(selection < 1 || selection > robots.size()) 
		{
			System.out.println("invalid selection, please try again: ");
			selection = scan.nextInt();
		}
		return robots.get(selection-1);
	}
	
	private void createRobot() 
	{
		System.out.println("enter robot name: ");
		String name = scan.next();
		System.out.println("enter x-coordinate: ");
		int x = scan.nextInt();
		System.out.println("enter y-coordinate: ");
		int y = scan.nextInt();
		System.out.println("enter orientation (N, S, E, or W): ");
		String orientation = scan.next();
		robots.add(new Robot(name, x, y, orientation));
	}
}