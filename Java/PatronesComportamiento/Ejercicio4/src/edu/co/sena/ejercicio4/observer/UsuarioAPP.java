/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.observer;

/**
 *
 * @author toshiba_
 */
public class UsuarioAPP {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setDescripcion("Vehiculo economico");
        vehiculo.setPrecio(5000.0);
        VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
        vistaVehiculo.redibuja();
        vehiculo.setPrecio(4500.0);
        VistaVehiculo vistaVehiculo2 = new VistaVehiculo(vehiculo);
        vehiculo.setPrecio(5500.0);
    }
}