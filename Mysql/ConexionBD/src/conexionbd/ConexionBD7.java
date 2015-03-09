/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ColsutecR
 */
public class ConexionBD7 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {

            String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "123456789";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement();
            int i = 56;
            rs = sentencia.executeQuery("Select * from akuavida.categorias" + i);
            System.out.println("______________________");
            
            if(!rs.wasNull()){
            while (rs.next() == true) {
                System.out.println("ID_Categoria: " + rs.getString("ID_Categoria"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("______________________");
            }
            }else{
                System.out.println("No hay datos");
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro la sentencia correctamente");
            }
            
            if(!rs.wasNull()){
            rs.close();
                System.out.println("se cerro el result correctamente");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }
    }
}
