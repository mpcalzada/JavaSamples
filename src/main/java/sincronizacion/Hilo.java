package sincronizacion;

/**
 * {@link Hilo}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Hilo extends Thread
{
    @Override
    public void run()
    {
        ObjetoCompartido objetoCompartido = ObjetoCompartido.getInstance();

        for (int i = 0; i <= 1000000; i++)
        {
            objetoCompartido.printData(this.hashCode() + "", i + "");
        }
    }
}
