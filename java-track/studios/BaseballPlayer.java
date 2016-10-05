public class BaseballPlayer 
{
	String name;
	int num;
	char hitOrientation; // R(ight), L(eft), or B(oth)
	int hits;
	int rbi;
	int gamesPlayed;
	
	public BaseballPlayer(String name, int num, char hitOrientation, int hits, int rbi, int gamesPlayed) 
	{
		this.name = name;
		this.num = num;
		this.hitOrientation = hitOrientation;
		this.hits = hits;
		this.rbi = rbi;
		this.gamesPlayed = gamesPlayed;
	}
	
	public void completedGame(int hits, int rbi) 
	{
		this.hits += hits;
		this.rbi += rbi;
		this.gamesPlayed += 1;
	}
	
	public String toString() 
	{
		return "Name: " + this.name +
				"\nNumber: " + this.num +
				"\nHit orientation: " + this.hitOrientation +
				"\nHits: " + this.hits +
				"\nRBI: " + this.rbi +
				"\nGames played: " + this.gamesPlayed;
	}
	
	public static void main(String[] args) 
	{
		BaseballPlayer p1 = new BaseballPlayer("Callie", 99, 'R', 10, 10, 20);
		System.out.println(p1 + "\n");
		
		p1.completedGame(2, 2);
		System.out.println(p1 + "\n");
		p1.completedGame(3, 8);
		System.out.println(p1 + "\n");
	}
}