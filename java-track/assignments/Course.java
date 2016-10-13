import java.util.ArrayList;

public class Course 
{
	private String name;
	private int credits;
	private int remainingSeats;
	private ArrayList<Student> students = new ArrayList<>();
	
	public String getName() { return name; }
	public int getCredits() { return credits; }
	public int getRemainingSeats() { return remainingSeats; }
	public ArrayList<Student> getStudents() { return students; }
	
	public Course(String name, int credits, int remainingSeats) 
	{
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
	}
	
	public boolean addStudent(Student x) 
	{
		if (remainingSeats >= 1) 
		{ 
			students.add(x);
			remainingSeats -= 1;
			return true;
		}
		else return false;
	}
	
	public String generateRoster() 
	{
		String x = "";
		for (int i = students.size(); i >= 1; i--) 
		{
			x += students.get(i-1).toString() + "\n";
		}
		return x;
	}
	
	public double averageGPA() 
	{
		double gpatotal = 0;
		for (int i = students.size(); i >= 1; i--) 
		{
			gpatotal += students.get(i-1).getGPA();
		}
		return gpatotal / students.size();
	}
	
	public String toString() 
	{
		return name + " " + credits;
	}
}