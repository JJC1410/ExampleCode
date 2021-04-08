package Example2;
import java.util.Scanner;

public class Essay extends LetterGrade
{
	private int TotalEssayScore;
	
	public void setScores()
	{
		int Grammar;
		int Spelling;
		int CorrectLength;
		int Content;
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the grammar, spelling, correct length, and content scores:");
		Grammar = myObj.nextInt();
		Spelling = myObj.nextInt();
		CorrectLength = myObj.nextInt();
		Content = myObj.nextInt();
		
		this.TotalEssayScore = Grammar + Spelling + CorrectLength + Content;
	}
	
	public int setTotalEssayScore()
	{
		return TotalEssayScore;
	}

	public void print() 
	{
		System.out.println("Total Essay Score: " + this.TotalEssayScore);
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		
	}

}
