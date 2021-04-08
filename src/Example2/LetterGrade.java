package Example2;

public abstract class LetterGrade
{
	private double Score;
	
	public void setScore(double s)
	{
		this.Score = s;
	}
	
	public double getScore()
	{
		return this.Score;
	}
	
	public char getGrade() 
	{
		char Grade;
		
		if (this.Score >= 90)
		{
			Grade = 'A';
		}
		else if (this.Score >= 80 && this.Score < 90)
		{
			Grade = 'B';
		}
		else if (this.Score >= 70 && this.Score < 80)
		{
			Grade = 'C';
		}
		else if (this.Score >= 60 && this.Score < 70)
		{
			Grade = 'D';
		}
		else
		{
			Grade = 'F';
		}
		return Grade;
	}
	
	public abstract void set();
	public abstract void print();
}
