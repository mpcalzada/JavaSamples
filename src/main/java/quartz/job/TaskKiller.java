package quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * {@link TaskKiller}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class TaskKiller extends JobManager
{
    @Override
    public void execute(JobExecutionContext context)
    {
        try
        {
            Scheduler scheduler = context.getScheduler();
            List<JobExecutionContext> currentlyExecuting = scheduler.getCurrentlyExecutingJobs();

            System.out.println("Starting task killer.");
            System.out.println("I´ll look into " + currentlyExecuting.size() + " tasks and kill InfiniteTask");
            for (JobExecutionContext jobExecutionContext : currentlyExecuting)
            {
                if (jobExecutionContext.getJobDetail().getKey().getName().equals("InfiniteTask"))
                {
                    scheduler.interrupt(jobExecutionContext.getJobDetail().getKey());
                }
            }

            System.out.println("I have finished, current executing tasks are: " + context.getScheduler().getCurrentlyExecutingJobs().size());
        }
        catch (SchedulerException e)
        {
            e.printStackTrace();
        }
    }
}
