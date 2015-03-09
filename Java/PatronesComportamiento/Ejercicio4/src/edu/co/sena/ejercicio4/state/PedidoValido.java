/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.state;

/**
 *
 * @author toshiba_
 */
public class PedidoValido extends EstadoPedido {

    public PedidoValido(Pedido pedido) {
        super(pedido);

    }

    public void agregaProducto(Producto producto) {
    }

    public void borra() {
        pedido.getProductos().clear();
    }

    public void suprimeProducto(Producto producto) {
    }

    public EstadoPedido estadoSiguiente() {
        return new PedidoEntregado(pedido);
    }
}
