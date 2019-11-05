/**
 * The <code>Task</code> class
 * <p>
 * com.mcalzada.callables
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package callables;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>
{
    private static int cont = 0;
    private int id;

    public Task()
    {
        cont++;
        id = cont;

    }

    @Override
    public Integer call() throws Exception
    {
        System.out.println("Calling callable " + id);
        Thread.sleep(15000);
        return id;
    }
}
