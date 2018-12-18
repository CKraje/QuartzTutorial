package it.objectmethod.quartztutorial;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleTriggerJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Eih ! I am  SimPleTrigger's job  !!");
	}
}
