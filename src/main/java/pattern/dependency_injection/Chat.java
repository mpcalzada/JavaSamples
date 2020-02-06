package pattern.dependency_injection;

/**
 * {@link Chat}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Chat
{
    private final Estado estado;

    public enum MOOD
    {
        HAPPY, SAD
    }

    public Chat(Estado estado)
    {
        this.estado = estado;
    }

    public void enviarMensaje(String message, MOOD mood)
    {
        switch (mood)
        {
            case HAPPY:
                this.estado.sonerir(message);
                break;
            case SAD:
                this.estado.llorar(message);
                break;
        }
    }
}
