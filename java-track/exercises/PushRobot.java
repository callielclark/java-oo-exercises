public class PushRobot extends Robot
{
	public PushRobot(String name, int x, int y, int orientation) 
	{
		super(name, x, y, orientation);
	}
	
	public void push(Robot z) 
	{
		if (this.checkDist(z) <= 2) 
		{
			
		}
	}
}