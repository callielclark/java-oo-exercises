
public class Rectangle 
{
	private int length;
	private int width;
	
	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}
	
	public int Area() 
	{
		return length * width;
	}
	
	public int Perimeter() 
	{
		return (length*2) + (width*2);
	}
	
	public boolean isSmaller(Rectangle n) 
	{
		if (n.Area() > this.Area()) return true;
		else return false;
	}
	
	public boolean isSquare() 
	{
		if (length == width) return true;
		else return false;
	}
	
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(5, 5);
		System.out.println("Area: " + r1.Area() + "\n" + 
				"Perimeter: " + r1.Perimeter() + "\n" + 
				"Is it a square? " + r1.isSquare() + "\n");
		System.out.println("Area: " + r2.Area() + "\n" + 
				"Perimeter: " + r2.Perimeter() + "\n" + 
				"Is it a square? " + r2.isSquare());
		System.out.println("\nIs r2 smaller than r1? " + r2.isSmaller(r1));
	}
}