/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractFactory;
import edu.co.sena.ejercicio3.abstractFactory.modelo.AutomovilDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.ScooterDTO;

/**
 *
 * @author ColsutecR
 */
public interface FabricaVehiculo {

    public AutomovilDTO creaAutomovil();
    public ScooterDTO creaScoter();

}
