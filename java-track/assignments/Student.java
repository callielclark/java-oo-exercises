public class Student 
{
	private String firstName, lastName;
	private int studentID;
	private int credits;
	private double GPA;
	private double gpatotal;
	
	public String getName() { return firstName + " " + lastName; }
	public int getStudentID() { return studentID; }
	public int getCredits() { return credits; }
	public double getGPA() { return GPA; }
	
	public Student(String firstName, String lastName, int studentID) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.GPA = 0.00;
		this.gpatotal = 0.00;
	}
	
	public String getClassStanding() 
	{
		if (credits < 30) return "Freshman";
		else if (credits >=30 && credits < 60) return "Sophomore";
		else if (credits >= 60 && credits < 90) return "Junior";
		else return "Senior";
	}
	
	public void submitGrade(double g, int c) 
	{
		this.credits += c;
		this.gpatotal += g * c;
		this.GPA = Math.round( (this.gpatotal / this.credits) * 1000d) / 1000d;
	}
	
	public double computeTuition() 
	{
		double tuition = 0;
		int i = this.credits;
		while (i >= 15) 
		{
			tuition += 20000;
			i-=15;
		}
		if (i > 0) 
		{
			tuition += i * 1333.33;
		}
		return tuition;
	}
	
	public static Student createLegacy(Student x, Student y) 
	{
		String a = x.getName();
		String b = y.getName();
		int c = x.studentID + y.studentID;
		Student z = new Student(a, b, c);
		z.GPA = (x.GPA + y.GPA) / 2;
		if (x.credits >= y.credits) z.credits = x.credits;
		else z.credits = y.credits;
		return z;
	}
	
	public String toString() 
	{
		return this.getName() + " " + this.studentID;
	}
}