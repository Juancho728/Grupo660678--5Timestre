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
public class ConexionEjercicio3 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        String a = JOptionPane.showInputDialog("Escriba el Id del producto ");
        String sql = "Select * "
                + "FROM akuavida.producto pro "
                + "where pro.ID_producto = '" + a + "'"
                + ";";
        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement();

            rs = sentencia.executeQuery(sql);

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {

                    System.out.println("id producto: " + rs.getString(1));
                    System.out.println("id Categoria: " + rs.getString(2));
                    System.out.println("Nombre: " + rs.getString(3));
                    System.out.println("Precio: " + rs.getString(4));
                    System.out.println("Descripcion: " + rs.getString(6));
                    System.out.println("Cantidad: " + rs.getString(7));
                    System.out.println("Activo: " + rs.getString(8));
                    System.out.println("Impuesto: " + rs.getString(9));
                    System.out.println("____________________________________________");
                }
            } else {
                System.out.println("No existe el producto");
            }

            String bx = JOptionPane.showInputDialog("Escriba la Categorias_ID_Categoria ");
            String cx = JOptionPane.showInputDialog("Escriba el Nombre ");
            String dx = JOptionPane.showInputDialog("Escriba el precio ");
            String exx = JOptionPane.showInputDialog("Escriba la descripcion ");
            String fx = JOptionPane.showInputDialog("Escriba la cantidad ");
            String gx = JOptionPane.showInputDialog("Escriba el activo ");
            String hx = JOptionPane.showInputDialog("Escriba el impuesto ");
            String ax = JOptionPane.showInputDialog("Escriba el Id del producto ");
            String sql2 = "UPDATE akuavida.producto "
                    + "SET "
                    + "Categorias_ID_Categoria = " + bx + " ,"
                    + "Nombre = ' " + cx + "',"
                    + "Precio = " + dx + ","
                    + "Descripcion = '" + exx + "',"
                    + "Cantidad = " + fx + ","
                    + "impuesto = " + hx + " "
                    + "WHERE ID_producto = '" + ax + "';";

            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            int resultado = sentencia.executeUpdate(sql2);
            if (resultado == 1) {
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
