public class Course 
{
	private String name;
	private int credits;
	private int remainingSeats;
	private String[] students;
	
	public String getName() { return name; }
	public int getCredits() { return credits; }
	public int getRemainingSeats() { return remainingSeats; }
	public String[] getStudents() { return students; }
	
	public Course(String name, int credits, int remainingSeats) 
	{
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		this.students = null;
	}
	
	public boolean addStudent(Student x) 
	{
		if (remainingSeats >= 1) 
		{ 
			students[remainingSeats] = x.getName();
			remainingSeats -= 1;
			return true;
		}
		else return false;
	}
	
	public String[] generateRoster() 
	{
		String a = "";
		for (int i = students.length; i >= 1; i--) 
		{
			a += students[i] + "\n";
		}
		return a;
	}
	
	public double averageGPA() 
	{
		double gpasum = 0;
		for (int i = students.length; i >= 1; i--) 
		{
			a = students[i];
			gpasum += a.getGPA();
		}
		return gpasum / students.length;
	}
	
	public String toString() 
	{
		return name + " " + credits;
	}
}