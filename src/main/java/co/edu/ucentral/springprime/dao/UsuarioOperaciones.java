package co.edu.ucentral.springprime.dao;


import co.edu.ucentral.springprime.modelo.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioOperaciones implements Operacion<usuario> {

    private final String sqlClear="INSERT INTO usuario(Usuario,Contraseña) VALUES (?,?)";


    @Override
    public boolean guardar(usuario dato) {
        ManejadorConexiones mc = new ManejadorConexiones();
        Connection conexActiva= mc.conectarse();

        if (conexActiva !=null){
            try {
                PreparedStatement ps = conexActiva.prepareStatement(sqlClear);

                ps.setString( 1, dato.getUsuario());
                ps.setString( 2, dato.getContraseña());
            }
            catch (SQLException e){
                e.printStackTrace();
            }finally{
                mc.desconexion(conexActiva);
            }
        }
        return false;
    }
}
