/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ConexionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "28071996";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.toString());
        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }


    }

}
