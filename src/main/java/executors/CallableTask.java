/**
 * The <code>CallableTask</code> class
 * <p>
 * com.mcalzada.executors
 * <p>
 * Created on 11/01/2019.
 *
 * @author MarcoCalzada
 */

package executors;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Boolean>
{
    @Override
    public Boolean call() throws Exception
    {
        return true;
    }
}
