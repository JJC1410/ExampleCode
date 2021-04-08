package Example1;

public class JournalPaper extends WrittenItem
{

	private int PublishYear;
	
	public JournalPaper(int id, String titles, int copy, String author, int publishyear) 
	{
		super(id, titles, copy, author);
		// TODO Auto-generated constructor stub
		
		this.PublishYear = publishyear;
	}
	
	public int getPublishYear()
	{
		return this.PublishYear;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return ("Title: " + this.getTitles() + " ID: " + this.getID());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("\ttitle:\t"+ this.getTitles() +
				 "\n\tID:\t" + this.getID() +
				 "\n\tCopy:\t" + this.getCopy() +
				 "\n\tAuthor:\t" + this.getAuthor() +
				 "\n\tPublish Year:\t" + this.getPublishYear() + "\n");
	}

}
