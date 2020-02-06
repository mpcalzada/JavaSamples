package pattern.dependency_injection;

/**
 * {@link Marco}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Marco implements Estado
{
    private String apellido = "Calzada";

    public Marco()
    {
    }

    public Marco(String apellido)
    {
        this.apellido = apellido;
    }

    @Override
    public void sonerir(String reason)
    {
        System.out.println("Marco " + apellido + " Im very happy because " + reason);
    }

    @Override
    public void llorar(String reason)
    {
        System.out.println("Marco" + apellido + " Im very sad because " + reason);
    }

}
