package modificadores;

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
        Pastel pastel = Pastel.getInstance();
        pastel.setSabor(Pastel.Sabores.FRESA);

        System.out.println(Pastel.Sabores.fromValue(1).toString());

        if (pastel.getSabor().equals(Pastel.Sabores.FRESA))
        {
            System.out.println("Sabor a Fresa");
        }
        switch (pastel.getSabor())
        {
            case CHOCOLATE:
                break;
            case VAINILLA:
                break;
            case FRESA:
                break;
        }

        System.out.println(pastel.getSabor().toString());
        System.out.println(pastel.getSabor().getValue() + "");
    }
}
