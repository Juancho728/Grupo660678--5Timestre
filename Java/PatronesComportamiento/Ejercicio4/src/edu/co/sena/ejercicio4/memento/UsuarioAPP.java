/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.memento;

/**
 *
 * @author toshiba_
 */
public class UsuarioAPP {

    public static void main(String[] args) {
        
        Memento memento;
        OpcionVehiculo opcion1 = new OpcionVehiculo("Asientos en cuero");
        OpcionVehiculo opcion2 = new OpcionVehiculo("Reclinables");
        OpcionVehiculo opcion3 = new OpcionVehiculo("Asientos deportivos");
        opcion1.agregaOpcionIncompatible(opcion3);
        opcion2.agregaOpcionIncompatible(opcion3);
        CarritoOpciones carritoOpciones = new CarritoOpciones();
        carritoOpciones.agregarOpcion(opcion1);
        carritoOpciones.agregarOpcion(opcion2);
        carritoOpciones.visualiza();
        memento = carritoOpciones.agregarOpcion(opcion3);
        carritoOpciones.visualiza();
        carritoOpciones.anula(memento);
        carritoOpciones.visualiza();
    }
}
