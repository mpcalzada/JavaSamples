/**
 * The <code>ThreadTask</code> class
 * <p>
 * com.mcalzada.executors
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package executors;

import java.util.Random;

public class ThreadTask implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            int rand = new Random().nextInt(9999);
            Thread.sleep(rand);
            System.out.println("Running the thread" + Thread.currentThread().getName()+rand);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
