package pattern.dependency_injection;

/**
 * {@link Persona}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Persona implements Estado
{
    @Override
    public void sonerir(String reason)
    {
        System.out.println("Im a computer with no feelings");
    }

    @Override
    public void llorar(String reason)
    {
        System.out.println("Im a computer with no feelings");
    }
}
