
public abstract class WrittenItem extends Item
{
	private String Author;
	
	public WrittenItem(int id, String titles, int copy, String author)
	{
		super(id, titles, copy);
		this.Author = author;
	}
	
	public String getAuthor()
	{
		return this.Author;
	}

}
