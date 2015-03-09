/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractFactory;

import edu.co.sena.ejercicio3.abstractFactory.modelo.AutomovilDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.AutomovilGasolinaDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.ScooterDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.ScooterGasolinaDTO;

/**
 *
 * @author ColsutecR
 */
public class FabricaVehiculoGasolina implements FabricaVehiculo{

    @Override
    public AutomovilDTO creaAutomovil() {
    return new AutomovilGasolinaDTO();
    }

    @Override
    public ScooterDTO creaScoter() {
    return new ScooterGasolinaDTO();
    }
    
}
