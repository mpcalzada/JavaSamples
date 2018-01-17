package herencia;

/**
 * The <code>Nieto</code> class
 * <p>
 * herencia
 * <p>
 * Created on 10/01/2018.
 *
 * @author Marco Calzada
 */

public class Nieto extends Hijo implements Humano
{
    public Nieto()
    {
        //System.out.println("Constructor herencia.Nieto");
    }

    @Override
    public void correr()
    {
        System.out.printf("Todavia no se correr.");
    }


}
