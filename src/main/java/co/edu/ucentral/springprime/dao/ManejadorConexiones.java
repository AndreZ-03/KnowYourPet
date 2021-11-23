package co.edu.ucentral.springprime.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ManejadorConexiones {
    public Connection conectarse(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd-knowyourpet","andres","200302");
            return conex;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public void desconexion(Connection conex){
        if (conex!=null){
            try {
                conex.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }

        }

    }
}
