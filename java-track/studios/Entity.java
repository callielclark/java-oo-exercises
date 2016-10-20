public abstract class Entity 
{
	private final int uid;
	public final int getUID() { return uid; }
	private static int counter = 0;
	
	public Entity() 
	{
		counter++;
		this.uid = counter;
	}
	
	public static void main(String[] args) 
	{
		
	}
}