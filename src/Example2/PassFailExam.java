package Example2;
import java.util.Scanner;

public class PassFailExam extends LetterGrade
{
	public int Total;
	public int Miss;
	public int Min;
	public char PassFailCount;
	
	public void set()
	{
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("How many questions are on the exam: ");
		this.Total = myObj.nextInt();
		
		System.out.println("How many questions did the student miss: ");
		this.Miss = myObj.nextInt();
		
		System.out.println("Enter the minimum passing score for this test: ");
		this.Min = myObj.nextInt();

		PassFailExam.super.setScore(Total - 1.0*Miss);
		
		if (PassFailExam.super.getScore() >= 60)
		{
			this.PassFailCount = 'P';
		}
		else
		{
			this.PassFailCount = 'F';
		}
		
	}
	public void print() 
	{
		System.out.println("Each Question counts: 1.0 points\n"
				+ "the mimum passing score is: " + this.Min
				+ "\nThe student exam score is: " + PassFailExam.super.getScore()
				+ "\nThe student grade is:" + this.PassFailCount);
		
	}
	
}
