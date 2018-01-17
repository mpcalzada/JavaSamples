package herencia;

/**
 * Created by Marco Calzada on 17/05/2017.
 */
public class Padre implements Humano
{
    protected String nombre;
    protected String genero;
    protected String colorCabello;
    protected static String apellido;

    static
    {
        apellido = "Perez";
    }

    public Padre()
    {
        //System.out.println("Constructor herencia.Padre");
        this.nombre = "Juan";
        this.genero = "Hombre";
    }

    public void correr()
    {
        System.out.println("Corro muy lento.");
    }

    public void hablar()
    {
        System.out.println("Hablo con propiedad");
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public static String getApellido()
    {
        return apellido;
    }

    public static void setApellido(String apellido)
    {
        Padre.apellido = apellido;
    }

    public String getColorCabello()
    {


        return colorCabello;
    }

    public void setColorCabello(String colorCabello)
    {
        this.colorCabello = colorCabello;
    }
}
