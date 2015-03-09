/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.flyweight;

/**
 *
 * @author toshiba_
 */
public class Cliente {

    public static void main(String[] args) {
        FabricaOpcion fabrica = new FabricaOpcion();
        VehiculoSolicitado vehiculo = new VehiculoSolicitado();
        vehiculo.agregaOpciones("Air bag ", 80, fabrica);
        vehiculo.agregaOpciones("Direccion asisitida ", 90, fabrica);
        vehiculo.agregaOpciones("Elevalunas electricos ", 85, fabrica);
        vehiculo.muestraOpciones();
    }

}
