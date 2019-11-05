package multithread;

import java.util.stream.Stream;

/**
 * {@link Start}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Start
{
    public static void start()
    {
        Stream.iterate(0, n -> n++).limit(500000).forEach(i -> {
            Data data = new Data(i + "00", i + "5204", i + "0001");
            Insertar.addData(data);
        });
    }
}
