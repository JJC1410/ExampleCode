
public abstract class MediaItem extends Item
{
	private double Runtime;

	public MediaItem(int id, String titles, int copy, double runtime) 
	{
		super(id, titles, copy);
		// TODO Auto-generated constructor stub
		
		this.Runtime = runtime;
	}

	public double getRuntime() 
	{
		return this.Runtime;
	}
}
