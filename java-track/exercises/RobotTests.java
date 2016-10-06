import static org.junit.Assert.*;
import org.junit.Test;

public class RobotTests
{
	@Test
	public void testToString() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 5, 'N');
		assertTrue(r1.toString() == "Name: " + "Robo" +
				"\nPosition: (" + "1" + ", " + "1" + ")" +
				"\nSpeed: " + "5" +
				"\nOrientation: " + "N");
	}
	
	@Test
	public void testMove() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 5, 'N');
		r1.move();
		assertTrue(r1.x == 1);
		assertTrue(r1.y ==6);
	}
	
	@Test
	public void testDist() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 5, 'N');
		Robot r2 = new Robot("Robo2", 0, 0, 3, 'S');
		assertTrue(r1.checkDist(r2) == 7.211102550927978);
	}
}