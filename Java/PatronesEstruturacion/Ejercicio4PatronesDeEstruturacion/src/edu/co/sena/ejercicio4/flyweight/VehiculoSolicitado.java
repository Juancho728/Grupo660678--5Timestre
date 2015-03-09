/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toshiba_
 */
public class VehiculoSolicitado {

    public VehiculoSolicitado() {
    }
    
    protected List<OpcionVehiculo> opciones = new ArrayList<>();
    protected List<Integer> precioDeVentasOpciones = new ArrayList<>();

    public void agregaOpciones(String nombre, int precioDeVenta, FabricaOpcion fabrica) {
        opciones.add(fabrica.getOption(nombre));
        precioDeVentasOpciones.add(precioDeVenta);

    }

    public void muestraOpciones() {
        int indice, tamano;
        tamano = opciones.size();
        for (indice = 0; indice < tamano; indice++) {
            opciones.get(indice).visualiza(precioDeVentasOpciones.get(indice));
            System.out.println();
        }

    }

}
