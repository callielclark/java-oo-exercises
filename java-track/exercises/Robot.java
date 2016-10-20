public class Robot 
{
	private String name;
	private int x;
	private int y;
	private String orientation;
	
	public String getName() { return name; }
	public int getX() { return x; }
	public int getY() { return y; }
	public String getOrientation() { return orientation; }
	
	public Robot(String name, int x, int y, int orientation) 
	{
		this.name = name;
		this.x = x;
		this.y = y;
		
		if (orientation == 1) this.orientation = "north";
		else if (orientation == 2) this.orientation = "south";
		else if (orientation == 3) this.orientation = "east";
		else if (orientation == 4) this.orientation = "west";
	}
	
	public String toString() 
	{
		return "name: " + name +
			"\npos: (" + x + ", " + y + ")" +
			"\nori: " + orientation;
	}
	
	public void move(int speed) 
	{
		if (orientation == "north") y += speed;
		else if (orientation == "south") y -= speed;
		else if (orientation == "east") x += speed;
		else x -= speed;
	}
	
	public void turnLeft() 
	{
		if (this.orientation == "north") this.orientation = "west";
		else if (this.orientation == "south") this.orientation = "east";
		else if (this.orientation == "east") this.orientation = "north";
		else this.orientation = "south";
	}
	
	public void turnRight() 
	{
		if (this.orientation == "north") this.orientation = "east";
		else if (this.orientation == "south") this.orientation = "west";
		else if (this.orientation == "east") this.orientation = "south";
		else this.orientation = "north";
	}
	
	public double checkDist(Robot r) 
	{
		return Math.sqrt( Math.pow( (r.x - this.x), 2) + Math.pow( (r.y - this.y), 2) );
	}
	
	public static void main(String[] args) 
	{	
		/*Robot r1 = new Robot("Robo", 1, 1, 1);
		Robot r2 = new Robot("Robo2", 0, 0, 2);
		r1.turnRight();
		System.out.println(r1 + "\n\n" + r2);
		System.out.println("\nDistance between robots: " + r1.checkDist(r2) + "\n");
		r1.move(5);
		r2.move(3);
		System.out.println(r2);
		System.out.println(r1 + "\n\n" + r2);
		System.out.println("\nDistance between robots: " + r1.checkDist(r2));*/
	}
}