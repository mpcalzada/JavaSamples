/**
 * Created by Marco Calzada on 17/05/2017.
 */
public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Multithreading Java Sample");
        multithread.Start.start();

        System.out.println("Accessing members Java Sample");
        modificadores.Start.start();

        System.out.println("Optionals Java Sample");
        optionals.Start.start();

        System.out.println("Executors Java Sample");
        executors.Start.start();

        System.out.println("Callable Java Sample");
        callables.Start.start();

        System.out.println("Abstract class Java Sample");
        abstracto.Start.start();
    }
}