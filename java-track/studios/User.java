import java.util.ArrayList;
import java.util.regex.Pattern;

public class User extends Entity
{
	private String username;
	private String hashedPassword;
	private static ArrayList<User> users = new ArrayList<>();
	
	public String getUsername() { return username; }
	public String getHashedPassword() { return hashedPassword; }
	public static ArrayList<User> getUsers() { return users; }
	
	public User(String username, String password) 
	{
		super();
		if (isValidUsername(username))
		{
			this.username = username;
			hashedPassword = hashPassword(password);
		}
		else 
		{
			throw new IllegalArgumentException();
		}
	}
	
	private static String hashPassword(String password) 
	{
		return password;
	}
	
	public boolean isValidPassword(String password, String hashedPassword) 
	{
		if (hashPassword(password) == hashedPassword) return true;
		else return false;
	}
	
	public static boolean isValidUsername(String username) 
	{
		boolean b = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", username);
		return b;
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			User u1 = new User("callie", "abcz1");
			System.out.println("welcome, " + u1.username);
		}
		catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
			System.out.println("invalid password, try again");
		}
	}
}