import java.util.Scanner;

public class Question 
{
	private String question;
	private String answer;
	
	public Question(String question, String answer) 
	{
		this.question = question;
		this.answer = answer;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Question q1 = new FillInTheBlank("What's my favorite color?", "Blue");
		//Question q2 = new MultipleChoice("What's my favorite season?", "Fall", //choices);
		
		System.out.println(q1.question);
		String input = scan.next();
		if (input == q1.answer) System.out.println("correct");
		
		//System.out.println(q2.question);
		//String input2 = scan.next();
	}
}