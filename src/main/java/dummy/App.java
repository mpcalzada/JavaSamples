package dummy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * {@link App}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class App
{
    public static void main(String[] args)
    {
        // Create new Thread by using a executor service
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Start the execution of my service
        executorService.execute(new WatcherService());

        // Inject dependency of my executor service
        BatchServiceJob.setExecutorService(executorService);

        // Start task that might start at 00:00
        JobLauncher.launch();
    }
}
