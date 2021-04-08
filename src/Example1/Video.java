package Example1;

public class Video extends MediaItem
{
	private String Director;
	private String Genre;
	private int YearReleased;
	
	public Video(int id, String titles, int copy, double runtime, String director, String genre, int yearreleased) 
	{
		super(id, titles, copy, runtime);
		// TODO Auto-generated constructor stub
		
		this.Director = director;
		this.Genre = genre;
		this.YearReleased = yearreleased;
	}
	
	public String getDirector()
	{
		return this.Director;
	}
	
	public String getGenre()
	{
		return this.Genre;
	}
	
	public int getYearReleased()
	{
		return this.YearReleased;
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
				 "\n\tRuntime:\t" + this.getRuntime() +
				 "\n\tDirector:\t" + this.getDirector() +
				 "\n\tGenre:\t" + this.getGenre() +
				 "\n\tYear Released:\t" + this.getYearReleased() + "\n");
	}

		
}
