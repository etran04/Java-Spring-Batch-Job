package com.erictran;
 
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * Main app that starts the Spring Batch Job. 
 * @author Eric
 *
 */
public class App 
{
  public static void main(String[] args) 
  {
	  String[] springConfig  = 
			{	"spring/batch/config/database.xml", 
				"spring/batch/config/context.xml",
				"spring/batch/jobs/job-report.xml" 
			};
	 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
	 
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("reportJob");
	 
		try {
			jobLauncher.run(job, new JobParameters()); 
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		} finally {
			context.close();
		}
	 
		System.out.println("Finished");
	}
}