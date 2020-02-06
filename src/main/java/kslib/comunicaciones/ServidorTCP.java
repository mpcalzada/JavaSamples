package kslib.comunicaciones;

import com.ks.lib.tcp.*;

/**
 * {@link ServidorTCP}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class ServidorTCP extends Servidor implements EventosTCP
{
    public ServidorTCP()
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
