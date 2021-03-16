
public class Book extends WrittenItem
{

	public Book(int id, String titles, int copy, String author) 
	{
		super(id, titles, copy, author);
		// TODO Auto-generated constructor stub
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
				 "\n\tAuthor:\t" + this.getAuthor() + "\n");
	}

}
