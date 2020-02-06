package kslib.comunicaciones;

import com.ks.lib.tcp.Cliente;
import com.ks.lib.tcp.EventosTCP;
import com.ks.lib.tcp.Tcp;

/**
 * {@link ClienteTCP}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
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
        System.out.println("Conexion establecida de " + this.getClass().getName());
    }

    @Override
    public void errorConexion(String s)
    {
        System.out.println("Error de conexion " + this.getClass().getName());
    }

    @Override
    public void datosRecibidos(String s, byte[] bytes, Tcp tcp)
    {
        System.out.println("Datos recibidos: " + s);
    }

    @Override
    public void cerrarConexion(Cliente cliente)
    {
        System.out.println("Cerrar conexion " + this.getClass().getName());
    }
}
