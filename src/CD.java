
public class CD extends MediaItem
{
	private String Artist;
	private String Genre;
	
	public CD(int id, String titles, int copy, double runtime, String artist, String genre)
	{
		super(id, titles, copy, runtime);
		// TODO Auto-generated constructor stub
		
		this.Artist = artist;
		this.Genre = genre;
	}

	public String getArtist()
	{
		return this.Artist;
	}
	
	public String getGenre()
	{
		return this.Genre;
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
				 "\n\tDirector:\t" + this.getArtist() +
				 "\n\tGenre:\t" + this.getGenre() + "\n");
	}
	

}
