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
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class ConexionEjercicio2 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        String b = JOptionPane.showInputDialog("Escriba la Categorias_ID_Categoria ");
        String c = JOptionPane.showInputDialog("Escriba el Nombre ");
        String d = JOptionPane.showInputDialog("Escriba el precio ");
        String e = JOptionPane.showInputDialog("Escriba la descripcion ");
        String f = JOptionPane.showInputDialog("Escriba la cantidad ");
        String g = JOptionPane.showInputDialog("Escriba el activo ");
        String h = JOptionPane.showInputDialog("Escriba el impuesto ");
        String a = JOptionPane.showInputDialog("Escriba el Id del producto ");
        String sql = "UPDATE akuavida.producto "
                + "SET "
                + "Categorias_ID_Categoria = " + b + " ,"
                + "Nombre = ' " + c + "',"
                + "Precio = " + d + ","
                + "Descripcion = '" + e + "',"
                + "Cantidad = " + f + ","
                + "impuesto = " + h + " "
                + "WHERE ID_producto = '" + a + "';";
        System.out.println(sql);

        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            int resultado = sentencia.executeUpdate(sql);
            if (resultado == 1) {
                System.out.println("Se Actualizaron los datos");
            } else {
                System.out.println("No se Actualizaron los datos");
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro la sentencia correctamente");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }
    }

}
