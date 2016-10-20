public class AttackRobot extends Robot
{	
	public AttackRobot(String name, int x, int y, int orientation) 
	{
		super(name, x, y, orientation);
	}
	
	public void attack(Robot z) 
	{
		if (this.checkDist(z) <= 2) 
		{
			
		}
	}
}