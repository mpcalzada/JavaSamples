import modificadores.Pastel;

/**
 * Created by Marco Calzada on 17/05/2017.
 */
public class App
{
    public static void main(String[] args) throws InterruptedException
    {

        Pastel.Sabores sabores;

        Pastel pastel = Pastel.getInstance();
        pastel.setSabor(Pastel.Sabores.FRESA);

        System.out.println(Pastel.Sabores.fromValue(1).toString());

        if (pastel.getSabor().equals(Pastel.Sabores.FRESA))
        {

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