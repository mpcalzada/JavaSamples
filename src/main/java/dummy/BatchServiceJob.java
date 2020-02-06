package dummy;

import lombok.Setter;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * {@link BatchServiceJob}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class BatchServiceJob implements Job
{
    @Setter
    private static ExecutorService executorService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException
    {
        // Stop the previous task (File monitor)
        executorService.shutdownNow();

        // Get modified file names
        List<String> fileNames = WatcherService.getModifiedFilesNames();

        // while ( time < 06:40 )
        // Process my file names

        // Start again the task
        executorService.execute(new WatcherService());
    }
}
