package sincronizacion;

/**
 * {@link ObjetoCompartido}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class ObjetoCompartido
{
    private static final ObjetoCompartido INSTANCE = new ObjetoCompartido();

    private ObjetoCompartido()
    {

    }

    public static ObjetoCompartido getInstance()
    {
        return INSTANCE;
    }

    public void printData(String owner, String data)
    {
        System.out.println("Im being used by " + owner + " with data: " + data);
    }
}
