/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class ConexionBD9 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";
//        String a = JOptionPane.showInputDialog("Escriba el Id del producto ");
//        String b = JOptionPane.showInputDialog("Escriba la Categorias_ID_Categoria ");
//        String c = JOptionPane.showInputDialog("Escriba el Nombre ");
//        String d = JOptionPane.showInputDialog("Escriba el precio ");
//        String e = JOptionPane.showInputDialog("Escriba la descripcion ");
//        String f = JOptionPane.showInputDialog("Escriba la cantidad ");
//        String g = JOptionPane.showInputDialog("Escriba el activo ");
//        String h = JOptionPane.showInputDialog("Escriba el impuesto ");
        String sql = "INSERT INTO akuavida.producto"
                + "(ID_producto,"
                + "Categorias_ID_Categoria,"
                + "Nombre,"
                + "Precio,"
                + "Descripcion,"
                + "Cantidad,"
                + "Activo,"
                + "impuesto ) "
                + " VALUES\n"
                + "(?,?,?,?,?,?,?,?);";
        System.out.println(sql);

        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.prepareStatement(sql);
            
            sentencia.setString(1, "5161h");
            sentencia.setInt(2, 500);
            sentencia.setString(3, "Jaja");
            sentencia.setDouble(4, 1000);
            sentencia.setString(5,"ajsbhdbdbjdb" );
            sentencia.setInt(6, 50);
            sentencia.setBoolean(7, true);
            sentencia.setDouble(8, 16);
            

            boolean resultado = sentencia.execute(sql);
            if (resultado = true) {
                System.out.println("Se insertaron datos");
            } else {
                System.out.println("No se insertaron datos");
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
