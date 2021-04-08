package Example1;

public abstract class Item 
{
	private int Id;
	private String Titles;
	private boolean Availability;
	private int Copy;
	
	
	public Item(int id, String titles, int copy) {
		// TODO Auto-generated constructor stub
		this.Id = id;
		this.Titles = titles;
		this.Copy = this.Copy + copy;
		
		if (copy > 0)
		{
			this.Availability = true;
		}
		else
		{
			this.Availability = false;
		}
	}


	public int getID()
	{
		return this.Id;
	}
	
	public String getTitles()
	{
		return this.Titles;
		
	}
	public boolean getAvailability() 
	{
		return this.Availability;
	}
	
	public int getCopy() 
	{
		return this.Copy;
	}
	
	public void setCopy(int copy)
	{
		this.Copy = copy;
	}
	
	public void setAvailability(boolean availability)
	{
		this.Availability = availability;
	}
	
	public void Borrow()
	{
		if (this.getAvailability() == true)
		{
			int copy = this.getCopy();
			copy--;
			this.setCopy(copy);
			
			System.out.println("Borrowed:\n" + this.toString());
			
			if (copy == 0)
			{
				this.setAvailability(false);
			}
		}
		else 
		{
			System.out.println("There is no more" + this.toString() + " left");
		}
	}
	
	public void Return()
	{
		int copy = this.getCopy();
		copy++;
		this.setCopy(copy);
		
		System.out.println("Returned:\t" + this.toString());
		
		if (this.getCopy() > 0)
		{
			this.setAvailability(true);
		}
	}
	
	public abstract String toString();
	public abstract void display();
}
