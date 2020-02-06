package quartz.schedule;

import lombok.extern.log4j.Log4j2;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import quartz.job.InfiniteTask;
import quartz.job.JobManager;
import quartz.job.TaskKiller;

import java.util.Date;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

@Log4j2
public class JobScheduler
{
    public void scheduleInfiniteTask() throws SchedulerException
    {
        Date runTime = DateBuilder.todayAt(12, 52, 00);
        this.schedule(runTime, "InfiniteTask", InfiniteTask.class);
    }

    public void scheduleTaskKiller() throws SchedulerException
    {
        Date runTime = DateBuilder.todayAt(12, 52, 15);
        this.schedule(runTime, "TaskKiller", TaskKiller.class);
    }

    private <T extends JobManager> void schedule(Date runTime, String infiniteTask, Class<T> infiniteTaskClass) throws SchedulerException
    {
        JobDetail job = JobBuilder.newJob(infiniteTaskClass).withIdentity(infiniteTask, "QuartzSample").build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity(infiniteTask, "QuartzSample").startAt(runTime).withSchedule(simpleSchedule().withIntervalInSeconds(30).repeatForever()).build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.scheduleJob(job, trigger);
        scheduler.start();
    }
}
