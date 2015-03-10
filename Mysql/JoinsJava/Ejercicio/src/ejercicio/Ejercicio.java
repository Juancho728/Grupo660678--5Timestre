/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        double total = 0;

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

        List<JoinTO> lista1 = new ArrayList<>();

        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            rs = sentencia.executeQuery(sql);

            if (rs.next() == true) {
                rs.beforeFirst();

                while (rs.next() == true) {

                    JoinTO itemTemporal = new JoinTO();
                    itemTemporal.setCantidad(rs.getInt("item.Cantidad"));
                    itemTemporal.setNombreProducto(rs.getString("pro.Nombre"));
                    itemTemporal.setValorTotal(rs.getInt("item.Costo_Total"));
                    itemTemporal.setValorUnitario(rs.getInt("item.Costo_Unitario"));

                    lista1.add(itemTemporal);

                }
            } else {
                System.out.println("No existe el carrito");
            }

            for (JoinTO lista11 : lista1) {
                System.out.println(lista11.toString());
                total = total + lista11.getValorTotal();
            }
            System.out.println("El total de la factura es de: " + total);
            
            
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
