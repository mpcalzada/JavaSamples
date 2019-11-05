/**
 * The <code>AsyncTask</code> class
 * <p>
 * com.mcalzada.executors
 * <p>
 * Created on 08/04/2019.
 *
 * @author MarcoCalzada
 */

package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AsyncTask extends Thread
{
    private ExecutorService executorService;

    public AsyncTask()
    {
        executorService = Executors.newFixedThreadPool(50);
    }

    @Override
    public void run()
    {
        try
        {
            executorService.submit(new ThreadTask());
            executorService.submit(new ThreadTask());
            executorService.submit(new ThreadTask());
            executorService.submit(new ThreadTask());

            executorService.shutdown();
            executorService.awaitTermination(30000, TimeUnit.MILLISECONDS);
            executorService.shutdownNow();

            System.out.println("Finish: " + executorService.isShutdown());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
