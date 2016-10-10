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
	
	public Robot(String name, int x, int y, String orientation) 
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	
	public String toString() 
	{
		return "name: " + this.name +
			"\npos: (" + this.x + ", " + this.y + ")" +
			"\nori: " + this.orientation;
	}
	
	public void move(int speed) 
	{
		if (orientation == "N") y += speed;
		else if (orientation == "S") y -= speed;
		else if (orientation == "E") x += speed;
		else x -= speed;
	}
	
	public void turnLeft() 
	{
		if (this.orientation == "N") this.orientation = "W";
		else if (this.orientation == "S") this.orientation = "E";
		else if (this.orientation == "E") this.orientation = "N";
		else this.orientation = "S";
	}
	
	public void turnRight() 
	{
		if (this.orientation == "N") this.orientation = "E";
		else if (this.orientation == "S") this.orientation = "W";
		else if (this.orientation == "E") this.orientation = "S";
		else this.orientation = "N";
	}
	
	public double checkDist(Robot r) 
	{
		return Math.sqrt( Math.pow( (r.x - this.x), 2) + Math.pow( (r.y - this.y), 2) );
	}
	
	public static void main(String[] args) 
	{
		/*
		Robot r1 = new Robot("Robo", 1, 1, "N");
		Robot r2 = new Robot("Robo2", 0, 0, "S");
		r1.turnRight();
		System.out.println(r1 + "\n\n" + r2);
		System.out.println("\nDistance between robots: " + r1.checkDist(r2) + "\n");
		r1.move(5);
		r2.move(3);
		System.out.println(r1 + "\n\n" + r2);
		System.out.println("\nDistance between robots: " + r1.checkDist(r2));
		*/
	}
}