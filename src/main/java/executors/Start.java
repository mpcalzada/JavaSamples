/**
 * The <code>Start</code> class
 * <p>
 * com.mcalzada.executors
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package executors;

public class Start
{
    public static void start()
    {
        new Thread(new AsyncTask()).start();
        new Thread(new AsyncTask()).start();
        new Thread(new AsyncTask()).start();
    }
}
