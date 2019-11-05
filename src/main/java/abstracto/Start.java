package abstracto;

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
        Transaction transaction;

        transaction = new Balance();
        System.out.println(transaction.process());

        transaction = new Prepaid();
        System.out.println(transaction.process());

        transaction = new Redemption();
        System.out.println(transaction.process());
    }
}
