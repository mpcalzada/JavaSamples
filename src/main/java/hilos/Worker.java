package hilos;

/**
 * Created by Marco Calzada on 28/06/2017.
 */
public class Worker implements Runnable
{
    private String command;

    public Worker(String s)
    {
        this.command = s;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        return this.command;
    }
}
