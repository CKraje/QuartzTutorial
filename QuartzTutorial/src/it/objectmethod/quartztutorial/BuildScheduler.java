package it.objectmethod.quartztutorial;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class BuildScheduler {

	public static void main(String[] args) throws SchedulerException {

		JobDetail jobWithSimpleTrigger = JobBuilder.newJob(SimpleTriggerJob.class)
				.withIdentity("dummyJobNameSimple", "group1").build();
		JobDetail jobWithCronTrigger = JobBuilder.newJob(CronTriggerJob.class)
				.withIdentity("dummyJobNameCron", "group1").build();
		Trigger simpleTrigger = SimpleTrigger.simpleTrigger();
		Trigger cronTrigger = CronTrigger.cronTrigger();
		Scheduler schedulerSimpleTrigger = new StdSchedulerFactory().getScheduler();
		schedulerSimpleTrigger.start();
		System.out.println("Scheduler with SimpleTrigger started ");
		schedulerSimpleTrigger.scheduleJob(jobWithSimpleTrigger, simpleTrigger);
		Scheduler schedulerCronTrigger = new StdSchedulerFactory().getScheduler();
		schedulerCronTrigger.start();
		schedulerCronTrigger.scheduleJob(jobWithCronTrigger, cronTrigger);
		System.out.println("Scheduler with CronTrigger started ");
	}

}
