package exceptions;

/**
 * {@link Assert}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Assert
{

    public static void notNull(Object obj, String msj) throws Exception
    {
        if (obj == null)
        {
            throw new Exception(msj);
        }
    }

    public void isTrue()
    {

    }
}
