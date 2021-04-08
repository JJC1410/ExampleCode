package Example2;
import java.util.Scanner;

public class FinalExam extends LetterGrade
{

	int Questions;
	int Miss;
		
	public void set()
	{
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);

		System.out.println("How many questions are on the exam: ");
		Questions = myObj.nextInt();
		
		System.out.println("How many questions did the student miss: ");
		Miss = myObj.nextInt();
		
		FinalExam.super.setScore((Questions - Miss) * 5);
	}
	
	public void print()
	{
		System.out.println("Each question counts 5 points: "
				+ "The exam score is: " + FinalExam.super.getScore()
				+ "The exam grade is: " + FinalExam.super.getGrade());
	}
	
}
