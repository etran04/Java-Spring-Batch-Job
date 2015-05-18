package com.erictran.model;

/**
 * UpdatedTestScore a test score that has been processed, meaning we turn the scores into grades. 
 * It inherits all fields from test score, but has a 'grades' for the processed grade. 
 * @author Eric
 *
 */
public class UpdatedTestScore extends TestScore 
{
	private String grade; 
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}