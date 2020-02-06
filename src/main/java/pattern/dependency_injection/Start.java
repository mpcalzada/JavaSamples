package pattern.dependency_injection;

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
        Estado persona = new Marco("Rodriguez");
        Chat chat = new Chat(persona);

        chat.enviarMensaje("Te odio, nunca vuelvas a buscar", Chat.MOOD.SAD);
        chat.enviarMensaje("Mentí, yo te amo, ven a casa", Chat.MOOD.HAPPY);
    }
}
