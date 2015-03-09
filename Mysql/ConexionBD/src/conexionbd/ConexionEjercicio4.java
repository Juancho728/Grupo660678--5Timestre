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
public class ConexionEjercicio4 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        String a = JOptionPane.showInputDialog("Escriba el Id del carrito ");
        String sql = "Select * "
                + "FROM akuavida.carrito_de_compras cdc "
                + "where cdc.ID_carrito = '" + a + "'"
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

                    System.out.println("id carrito: " + rs.getString(1));
                    System.out.println("total: " + rs.getString(2));
                    System.out.println("subtotal: " + rs.getString(3));

                    System.out.println("____________________________________________");
                }
            } else {
                System.out.println("No existe el carrito");
            }

            String bx = JOptionPane.showInputDialog("Escriba el id del carrito ");
            String sql2 = "DELETE FROM `akuavida`.carrito_de_compras WHERE ID_Carrito = '"+bx+"' ;";
             

            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            int resultado = sentencia.executeUpdate(sql2);
            if (resultado == 1) {
                System.out.println("Se Elimino el carrito");
            } else {
                System.out.println("No se elimino el carrito");
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
