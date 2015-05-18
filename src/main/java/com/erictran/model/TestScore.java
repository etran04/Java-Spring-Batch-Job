package com.erictran.model;

/**
 * TestScore represents the entries from a CSV file. 
 * It contains the fields for class id, student id, and test score. 
 * @author Eric
 *
 */
public class TestScore
{
    private String classid;
    private int studentid;
    private int tscore;
    
    public String getClassid()
    {
    	return classid;
    }
    
    public void setClassID(String id)
    {
    	classid = id;
    }
    
    public int getStudentid()
    {
    	return studentid;
    }
    
    public void setStudentID(int id)
    {
    	studentid = id;
    }
    
    public int gettscore()
    {
    	return tscore;
    }
    
    public void settscore(int score)
    {
    	tscore = score; 
    }
}
