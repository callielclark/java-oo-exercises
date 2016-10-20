import java.util.Date;

public class Post extends Entity
{
	private String title;
	private String body;
	private String author;
	private final Date created;
	private Date modified;
	
	public String getTitle() { return title; }
	public String getBody() { return body; }
	public String getAuthor() { return author; }
	public final Date getCreated() { return created; }
	public Date getModified() { return modified; }
	
	public Post(String title, String body, String author, Date created) 
	{
		super();
		this.title = title;
		this.body = body;
		this.author = author;
		this.created = created;
		this.modified = null;
	}
	
	public void modify(String newTitle, String newBody, Date modified) 
	{
		this.title = newTitle;
		this.body = newBody;
		this.modified = modified;
	}
	
	public static void main(String[] args) 
	{
		Post p1 = new Post("title", "body", "Callie", new Date());
		System.out.println(p1.title + "\n" + p1.body +
				"\nposted by " + p1.author + " on " + p1.created + "\nmodified: " + p1.modified);
		System.out.println();
		p1.modify("Coffee and Dogs", "These are my favorite things!", new Date());
		System.out.println(p1.title + "\n" + p1.body +
				"\nposted by " + p1.author + " on " + p1.created + "\nmodified: " + p1.modified);
	}
}