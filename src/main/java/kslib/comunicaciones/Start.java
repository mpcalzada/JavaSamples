package kslib.comunicaciones;

import com.ks.lib.tcp.Cliente;
import com.ks.lib.tcp.Servidor;

/**
 * {@link Start}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class Start
{
    public static void start() throws Exception
    {
        Cliente cliente = new ClienteTCP();
        cliente.setIP("localhost");
        cliente.setPuerto(5000);

        Servidor servidor = new ServidorTCP();
        servidor.setIP("localhost");
        servidor.setPuerto(5000);

        servidor.conectar();
        cliente.conectar();
    }
}
