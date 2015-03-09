/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba_
 */
public class EjercicioJDBC {

    public static void main(String[] args) throws SQLException {

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {

            String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "123456789";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");

            sentencia = conexion.createStatement();

            String i = JOptionPane.showInputDialog("Escriba el tipo de documento ");
            String o = JOptionPane.showInputDialog("Escriba el numero de documento ");
            String sql = "select * from akuavida.cuenta where Tipo_Documento = '" + i + "' and Numero_Documento = '" + o + " '";
            rs = sentencia.executeQuery(sql);

            while (rs.next() == true) {
                System.out.println("___________");
                System.out.println("Tip_Documento: " + rs.getString("Tipo_Documento"));
                System.out.println("Numero_Documento: " + rs.getString("Numero_Documento"));
                System.out.println("Primer_Nombre: " + rs.getString("Primer_Nombre"));
                System.out.println("Segundo_Nombre: " + rs.getString("Segundo_Nombre"));
                System.out.println("Primer_Apellido: " + rs.getString("Primer_Apellido"));
                System.out.println("Segundo_Apellido: " + rs.getString("Segundo_Apellido"));
                System.out.println("Contrasena: " + rs.getString("Contraseña"));
                System.out.println("Correo: " + rs.getString("Correo"));
                System.out.println("Direccion: " + rs.getString("Direccion"));
                System.out.println("Telefono: " + rs.getString("Telefono"));
                System.out.println("Rool: " + rs.getString("Rool"));
                System.out.println("Activo: " + rs.getString("Activo"));
                System.out.println("Ususario_idUsusario: " + rs.getString("Ususario_idUsusario"));
                System.out.println("___________");
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro la sentencia correctamente");
            }

            if (!rs.wasNull()) {
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
