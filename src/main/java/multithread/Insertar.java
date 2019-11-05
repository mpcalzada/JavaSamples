package multithread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@link Insertar}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Insertar
{

    private static Thread thread = new Thread();
    private static Queue<Data> QUEUE_DATA = new LinkedList<>();

    public static void addData(Data data)
    {
        QUEUE_DATA.add(data);

        if (!thread.isAlive())
        {
            thread = new Thread(Insertar::asyncProcessing);
            thread.setName("AsyncInsert");
            thread.start();
        }
    }

    private static void asyncProcessing()
    {
        while (!QUEUE_DATA.isEmpty())
        {
            Data data = QUEUE_DATA.poll();

            String query = "UPDATE WHERE AUTH_NUMBER = " + data.getAuthNumber() + "AND CARD_NUMBER = " + data.getCardNumber()

                    + "AND AMOUNT = " + data.getAmount();

            System.out.println("Query inserted into DB " + query);
        }
    }
}
