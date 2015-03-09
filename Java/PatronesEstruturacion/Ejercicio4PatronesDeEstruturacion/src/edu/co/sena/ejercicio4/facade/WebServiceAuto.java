/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.facade;

import java.util.List;

/**
 *
 * @author toshiba_
 */
public interface WebServiceAuto {
    

    public String documento (int indice);
    List<String> buscaVehiculo(int precioMedio, int desviacionMax);
}
