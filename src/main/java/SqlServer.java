import java.sql.*;

/**
 * Created by Marco Calzada on 24/07/2017.
 */
public class SqlServer
{
    Connection connection;              //Conexion a la base de datos (Stream)
    ResultSet resultSet;                //Guarda tu query cuando haces select
    PreparedStatement preparedStatement;//Ejecuta un query que lleva parametros
    Statement statement;                //Ejecuta un query

    public SqlServer()
    {

    }

    public Connection getConexion()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://host:puerto/db");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }

    public void seleccionar()
    {
        String query = "select * from loyalty_cards where haschode = 15";
        connection = getConexion();

        try
        {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            //while (resultSet.next()){
            if (resultSet.next())
            {
                String card_number = resultSet.getString("number_card");
                String hashcode = resultSet.getString("hashcode");
                int puntos = resultSet.getInt("points");


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean update(String hashcode)
    {
        //String query = "update loyalty_cards set number_card = ? where hashcode = ?";
        String query = "update loyalty_cards set number_card = ? where hashcode = ?";

        connection = getConexion();

        try
        {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "Referencia");
            preparedStatement.setString(2, hashcode);


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return true;
    }
}