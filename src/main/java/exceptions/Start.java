package exceptions;

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
        String val = null;
        String val2;

        try
        {
            Assert.notNull(val, "");
            System.out.println(val);
        }
        catch (Exception e)
        {
            val = "No funciono el assert.";
            System.out.println(val);
        }
    }
}
