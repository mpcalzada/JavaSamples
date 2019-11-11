package herencia;

import com.ks.lib.tcp.Cliente;
import com.ks.lib.tcp.ClienteSSL;
import com.ks.lib.tcp.EventosTCP;
import com.ks.lib.tcp.Tcp;

/**
 * Created by Marco Calzada on 25/05/2017.
 */
public class ClienteTCP extends Cliente implements EventosTCP
{
    public ClienteTCP()
    {
        this.setEventos(this);
    }

    @Override
    public void conexionEstablecida(Cliente cliente)
    {
        System.out.println("Conexion Establecida");
    }

    @Override
    public void conexionEstablecida(ClienteSSL clienteSSL)
    {

    }

    @Override
    public void errorConexion(String s)
    {
        System.out.println("Error de conexion");
    }

    @Override
    public void datosRecibidos(String s, byte[] bytes, Tcp tcp)
    {
        System.out.println("Dato Recibido " + s);
    }

    @Override
    public void cerrarConexion(Cliente cliente)
    {
        System.out.println("Conexion Cerrada");
    }

    @Override
    public void cerrarConexion(ClienteSSL clienteSSL)
    {

    }
}
