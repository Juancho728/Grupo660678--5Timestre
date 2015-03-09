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
public class WebServiceAutoImpl implements WebServiceAuto{

    protected Catalogo catalogo = new ComponenteCatalogo();
    protected GestionDocumento gestionaDocumento = new ComponenteGestionDocumento();
    
    @Override
    public String documento(int indice) {
    return gestionaDocumento.documento(indice);
    }

    @Override
    public List<String> buscaVehiculo(int precioMedio, int desviacionMax) {
    return catalogo.buscaVehiculos(precioMedio - desviacionMax, precioMedio + desviacionMax);
    
    }
    
}
