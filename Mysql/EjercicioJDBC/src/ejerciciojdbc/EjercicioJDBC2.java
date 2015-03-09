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
 * @author ColsutecR
 */
public class EjercicioJDBC2 {
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

            String i = JOptionPane.showInputDialog("Escriba el Id del producto ");
            String sql = "select * from akuavida.producto where ID_producto = '" + i + "' ";
            rs = sentencia.executeQuery(sql);


            while (rs.next() == true) {
                System.out.println("___________");
                System.out.println("ID_Producto: " + rs.getString("ID_producto"));
                System.out.println("Categoria_ID_Categoria: " + rs.getString("Categorias_ID_Categoria"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("Precio: " + rs.getString("Precio"));
                System.out.println("Descripcion: " + rs.getString("Descripcion"));
                System.out.println("Cantidad: " + rs.getString("Cantidad"));
                System.out.println("Activo: " + rs.getString("Activo"));
                System.out.println("Impuesto: " + rs.getString("impuesto"));
                

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
