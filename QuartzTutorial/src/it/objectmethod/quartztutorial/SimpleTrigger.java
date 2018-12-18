package it.objectmethod.quartztutorial;

import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

public class SimpleTrigger {

	 static Trigger simpleTrigger() {
		Trigger trigger = null;
		 try {
			trigger = TriggerBuilder
					.newTrigger()
					.withIdentity("dummySimpleTriggerName", "group1")
					.withSchedule(
						SimpleScheduleBuilder.simpleSchedule()
							.withIntervalInSeconds(5).repeatForever())
					.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return trigger;	
	}
}
