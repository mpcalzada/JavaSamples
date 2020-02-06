package dummy;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link WatcherService}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class WatcherService implements Runnable
{
    @Getter
    private static List<String> modifiedFilesNames = new ArrayList<>();

    @Override
    public void run()
    {
        // Files monitoring
        // while ( time < 00:00 )
        String fileName = "";
        modifiedFilesNames.add(fileName);
    }
}
