package it.objectmethod.quartztutorial;

import org.quartz.CronScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

public class CronTrigger {

	 static Trigger cronTrigger() {
		Trigger trigger = null;
		 try {
			trigger = TriggerBuilder
					.newTrigger()
					.withIdentity("dummyCronTriggerName", "group1")
					.withSchedule(
						CronScheduleBuilder.cronSchedule("0/8 * * * * ?"))
					.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return trigger;	
	}
}
