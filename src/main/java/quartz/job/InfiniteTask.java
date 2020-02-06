package quartz.job;

import lombok.extern.log4j.Log4j2;
import org.quartz.InterruptableJob;
import org.quartz.JobExecutionContext;
import org.quartz.UnableToInterruptJobException;

@Log4j2
public class InfiniteTask extends JobManager implements InterruptableJob
{
    private Thread thread;

    @Override
    public void execute(JobExecutionContext context)
    {
        try
        {
            thread = Thread.currentThread();

            while (true)
            {
                System.out.println("Hello, I am the infinite task.");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Ooops, something went wrong in InfiniteTask");
        }
    }

    @Override
    public void interrupt() throws UnableToInterruptJobException
    {
        thread.interrupt();
    }
}
