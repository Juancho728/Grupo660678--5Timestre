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
public class UsuarioWebService {

    public static void main(String[] args) {
        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));
        List<String> resultados = webServiceAuto.buscaVehiculo(6000, 1000);
        if (resultados.size() > 0) 
            System.out.println("Vehiculo(s) cuyo precio esta comprendido: " + "entre 5000 y 7000");
            for (String resulatado : resultados) 
                System.out.println("   " + resulatado);
            
        
    }
}
