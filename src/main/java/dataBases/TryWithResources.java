package dataBases;

import modificadores.Pastel;

import java.sql.*;

/**
 * The <code>TryWithResources</code> class
 * <p>
 * dataBases
 * <p>
 * Created on 17/01/2018.
 *
 * @author Marco Calzada
 */

public class TryWithResources
{
    private Connection connection;

    public TryWithResources()
    {
        connection = null;
    }

    public Connection conectarBD()
    {
        try (Connection connection = DriverManager.getConnection("", "", ""))
        {
            return connection;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void consultarDatosSeguro()
    {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT saber FROM PASTELES WHERE sabor = ?"))
        {
            preparedStatement.setString(1, "CHOCOLATE");
            //otras acciones previas a ejectar el query.

            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                //otas acciones
                while (resultSet.next())
                {
                    Pastel pastel = Pastel.getInstance();
                    pastel.setSabor(Pastel.Sabores.valueOf(resultSet.getString("sabor")));
                }
            }
        }
        catch (SQLException e)
        {
            // Genero una excepcion pero se cierra el prepared statement (Seguro)
            e.printStackTrace();
        }
    }

    public void insertarDatosSeguro()
    {
        try (Statement statement = connection.createStatement())
        {
            //otras acciones previas a ejectar el query.
            statement.executeUpdate("UPDATE Pasteles where sabor = 'CHOCOLATE' SET sabor = 'FRESA'");
        }
        catch (SQLException e)
        {
            // Genero una excepcion pero se cierra el prepared statement (Seguro)
            e.printStackTrace();
        }
    }
}
