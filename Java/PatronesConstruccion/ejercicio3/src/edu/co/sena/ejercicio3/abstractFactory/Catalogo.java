/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractFactory;

import edu.co.sena.ejercicio3.abstractFactory.modelo.AutomovilElectricidadDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.AutomovilGasolinaDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.ScooterElectricidadDTO;
import edu.co.sena.ejercicio3.abstractFactory.modelo.ScooterGasolinaDTO;

/**
 *
 * @author ColsutecR
 */
public class Catalogo {

    public static void main(String[] args) {
        FabricaVehiculo fabrica1 = new FabricaVehiculoElectricidad();
        AutomovilElectricidadDTO auto1 = (AutomovilElectricidadDTO) fabrica1.creaAutomovil();
        auto1.setPlaca("UPQ777");
        auto1.setModelo("Ferrari");
        auto1.setColor("Negro");
        auto1.setPasajero("2");
        auto1.setAmperaje("250");
        auto1.setVoltaje("500");
        System.out.println(auto1.toString());
        System.out.println("_________________________");
        ScooterElectricidadDTO scoteer1 = (ScooterElectricidadDTO) fabrica1.creaScoter();
        scoteer1.setPlaca("SDF123");
        scoteer1.setModelo("Ford");
        scoteer1.setColor("Gris");
        scoteer1.setPasajero("1");
        scoteer1.setVoltaje("100");
        scoteer1.setAmperaje("120");
        System.out.println(scoteer1.toString());
       System.out.println("_________________________");
        
        
        
        FabricaVehiculo fabrica2 = new FabricaVehiculoGasolina();
        AutomovilGasolinaDTO auto2 = (AutomovilGasolinaDTO) fabrica2.creaAutomovil();
        auto2.setPlaca("HHP666");
        auto2.setModelo("Pichirilo");
        auto2.setColor("Blanco");
        auto2.setPasajero("5");
        auto2.setCapacidadTanque("1600");
        System.out.println(auto2.toString());
        System.out.println("_________________________");
        ScooterGasolinaDTO scooter2 = (ScooterGasolinaDTO)fabrica2.creaScoter();
        scooter2.setPlaca("ABC123");
        scooter2.setModelo("AKT");
        scooter2.setColor("Rojo");
        scooter2.setPasajero("1");
        scooter2.setCapacidadTanque("100");
        System.out.println(scooter2.toString());
        
    }
}
