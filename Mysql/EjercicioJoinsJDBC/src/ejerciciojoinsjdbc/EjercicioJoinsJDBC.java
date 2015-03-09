/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojoinsjdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba_
 */
public class EjercicioJoinsJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        
        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        
        String a = JOptionPane.showInputDialog("Escriba el id de la factura ");
        String sql = "select item.Cantidad, pro.Nombre, item.Costo_Unitario, item.Costo_Total "
                + " from akuavida.producto pro  "
                + "inner join akuavida.item item "
                + " inner join akuavida.pedido ped"
                + " inner join akuavida.factura fac"
                + " where pro.ID_producto=item.Producto_ID_producto "
                + "and" + " ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura "
                + "and" + " fac.ID_Factura=item.Pedido_Factura_ID_Factura "
                + "and" + " fac.ID_Factura= " + a;
        System.out.println(sql);
        
        try {
            
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            
            rs = sentencia.executeQuery(sql);
            
            if (rs.next() == true) {
                while (rs.next() == true) {
                    
                    System.out.println(rs.getString("Cantidad"));
                    System.out.println(rs.getString("Nombre"));
                    System.out.println(rs.getString("Costo_Total"));
                    System.out.println(rs.getString("Costo_Unitario"));
                    
                    System.out.println("____________________________________________");
                }
            } else {
                System.out.println("No existe el carrito");
            }
            
            boolean resultado = sentencia.execute(sql);
            if (resultado = true) {
                System.out.println("Se pudo realizar el joins");
            } else {
                System.out.println("No se pudo realizar el joins");
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
