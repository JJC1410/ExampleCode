package Example2;

public class Test 
{
	public static void main(String args[])
	{
		CourseGrades coursegrades = new CourseGrades();
		
		Essay essay = new Essay();
		PassFailExam passfailexam = new PassFailExam();
		FinalExam finalexam = new FinalExam();
		
		coursegrades.setEssay(essay);
		coursegrades.setPassFailExam(passfailexam);
		coursegrades.setFinal(finalexam);
		coursegrades.getAverage();
		coursegrades.getHighest();
		coursegrades.getLowest();
		System.out.println("The Average of graded activities is: " + coursegrades.getAverage()
		+ "\nThe Highest graded activities is: " + coursegrades.getHighest().getScore()
		+ "\nThe Lowest graded activities is: " + coursegrades.getLowest().getScore());
	}
}
