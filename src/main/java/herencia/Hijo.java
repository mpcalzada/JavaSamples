package herencia;

/**
 * Created by Marco Calzada on 17/05/2017.
 */
public class Hijo extends Padre implements Humano
{
    protected int edad;

    static
    {
        apellido = "Gomez";
    }

    public Hijo()
    {
        //System.out.println("Constructor herencia.Hijo");
        this.nombre = "Pepito";
        this.edad = 30;
    }

    protected void hola(){

    }

    @Override
    public void correr()
    {
        System.out.println("Corro rapido.");
    }

    @Override
    public void hablar()
    {
        System.out.println("Hablo con groserias.");
    }
}
