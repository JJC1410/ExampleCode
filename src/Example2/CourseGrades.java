package Example2;

public class CourseGrades implements Analyzable
{
	int NUM_GRADES = 4;
	GradedActivity grades[] = new GradedActivity[4];
	
	public CourseGrades()
	{
		for (int i = 0; i < NUM_GRADES; i++)
		{
			grades[i] = new GradedActivity();
			this.setLab(grades[i]);
		}
	}
	
	public void setLab(GradedActivity aLab)
	{
		aLab.set();
	}
	
	public void setPassFailExam(PassFailExam aPassFailExam)
	{	
		aPassFailExam.set();
		aPassFailExam.print();
	}
	
	public void setEssay(Essay anEssay)
	{
		anEssay.setScores();
		anEssay.print();
	}
	
	public void setFinal(FinalExam aFinalExam)
	{
		aFinalExam.set();
		aFinalExam.print();
	}

	public double getAverage() {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i = 0; i < NUM_GRADES; i++)
		{
			total += grades[i].getScore();
		}
		
		
		return total/NUM_GRADES;
	}

	public GradedActivity getHighest() {
		// TODO Auto-generated method stub
		
		GradedActivity HighestLab = null;
		int temp = 0;
		
		for (GradedActivity aLab : grades)
		{
			if (aLab.getScore() >= temp)
			{
				temp = (int) aLab.getScore();
				HighestLab = aLab;
			}
		}
		
		return HighestLab;
	}

	public GradedActivity getLowest() {
		// TODO Auto-generated method stub
		
		GradedActivity LowestLab = null;
		int temp = 100;
		
		for (GradedActivity aLab : grades)
		{
			if (aLab.getScore() <= temp)
			{
				temp = (int) aLab.getScore();
				LowestLab = aLab;
			}
		}
		return LowestLab;
	}
	
	public String toString()
	{
		return null;
	}
}
