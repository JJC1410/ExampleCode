package Example2;
import java.util.Scanner;

public class GradedActivity extends LetterGrade
{

	int LabScores;
	
	public void set() 
	{
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		System.out.println("Set Lab Scores");
		LabScores = myObj.nextInt();
		
		GradedActivity.super.setScore(LabScores);
	}

	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("Lab Score is :" + GradedActivity.super.getScore());
	}

}
