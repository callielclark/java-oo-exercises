import static org.junit.Assert.*;
import org.junit.Test;

public class RobotTests
{
	@Test
	public void testToString() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 1);
		assertEquals(r1.toString(), "name: Robo\npos: (1, 1)\nori: N");
	}
	
	@Test
	public void testMove() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 1);
		r1.move(5);
		assertEquals(r1.getX(), 1);
		assertEquals(r1.getY(), 6);
	}
	
	@Test
	public void testLeft() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 1);
		r1.turnLeft();
		assertEquals(r1.getOrientation(), 4);
	}
	
	@Test
	public void testRight() 
	{
		Robot r1 = new Robot("Robo", 1, 1, 1);
		r1.turnRight();
		assertEquals(r1.getOrientation(), 3);
	}
	
	@Test
	public void testDist() 
	{
		Robot r1 = new Robot("Robo", 0, 0, 1);
		Robot r2 = new Robot("Robo2", 3, 4, 2);
		assertTrue(r1.checkDist(r2) == 5);
	}
}