package com.erictran.model;

import com.erictran.model.TestScore;
import com.erictran.model.UpdatedTestScore;
import org.springframework.batch.item.ItemProcessor;

/**
 * CustomItemProcessor is what we use in order to convert a TestScore into an UpdatedTestScore. 
 * It takes the test score, and depending on which interval it resides in, will assign it a specific grade. 
 * @author Eric
 *
 */
public class CustomItemProcessor implements ItemProcessor<TestScore, UpdatedTestScore>
{
	/**
	 * Main method to process a test score. 
	 * @param input the test score to be processed
	 * @return the updated test score with processed grade 
	 */
    public UpdatedTestScore process(TestScore input) throws Exception 
    {
    	TestScore oldEntry = (TestScore) input;
    	UpdatedTestScore newEntry= new UpdatedTestScore();
    	newEntry.setClassID(oldEntry.getClassid());
    	newEntry.setStudentID(oldEntry.getStudentid());
    	newEntry.settscore(oldEntry.gettscore());
    	
    	int score = oldEntry.gettscore();
    	if (score >= 90)
    	{
    		newEntry.setGrade("A");
    	}
    	else if (score >= 80)
    	{
    		newEntry.setGrade("B");
    	}
    	else if (score >= 70)
    	{	
    		newEntry.setGrade("C");
    	}
    	else if (score >= 60)
    	{
    		newEntry.setGrade("D");
    	}
    	else 
    	{
    		newEntry.setGrade("F");
    	}
    	
    	return newEntry;
    }
}