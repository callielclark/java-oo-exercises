public class MultipleChoice extends Question
{
	private String[] choices = new String[4];
	
	public MultipleChoice(String question, String answer, String[] choices) 
	{
		super(question, answer);
		this.choices = choices;
	}
}