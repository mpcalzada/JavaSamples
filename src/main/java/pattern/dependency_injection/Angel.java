package pattern.dependency_injection;

/**
 * {@link Angel}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Angel implements Estado
{
    @Override
    public void sonerir(String reason)
    {
        System.out.println("Angel: Im very happy because " + reason);
    }

    @Override
    public void llorar(String reason)
    {
        System.out.println("Angel: Im very sad because " + reason);
    }
}
