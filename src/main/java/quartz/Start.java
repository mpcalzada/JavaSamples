package quartz;

import org.quartz.SchedulerException;
import quartz.schedule.JobScheduler;

/**
 * {@link Start}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Start
{
    public static void start() throws SchedulerException
    {
        JobScheduler jobScheduler = new JobScheduler();

        jobScheduler.scheduleInfiniteTask();
        jobScheduler.scheduleTaskKiller();
    }
}
