package modificadores;

/**
 * The <code>Paster</code> class
 * <p>
 * modificadores
 * <p>
 * Created on 10/01/2018.
 *
 * @author Marco Calzada
 */

public class Pastel
{
    public static int tamaño = 1;
    private Sabores sabor;
    private static final Pastel _INSTANCE = new Pastel();

    private Pastel(){

    }

    public static Pastel getInstance()
    {
        return _INSTANCE;
    }

    public enum Sabores
    {
        CHOCOLATE(1), VAINILLA(2), FRESA(3);

        private int value;

        Sabores(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }

        public static Sabores fromValue(int valor)
        {
            Sabores sabores = null;
            switch (valor)
            {
                case 1:
                    sabores = CHOCOLATE;
                    break;
                case 2:
                    sabores = VAINILLA;
                    break;
                case 3:
                    sabores = FRESA;
                    break;
            }

            return sabores;
        }
    }

    public static int getTamaño()
    {
        return tamaño;
    }

    public static void setTamaño(int tamaño)
    {
        Pastel.tamaño = tamaño;
    }

    public Sabores getSabor()
    {
        return sabor;
    }

    public void setSabor(Sabores sabor)
    {
        this.sabor = sabor;
    }
}
