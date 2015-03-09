/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractFactory.modelo;

/**
 *
 * @author ColsutecR
 */
public class AutomovilGasolinaDTO extends AutomovilDTO{

    private String capacidadTanque;

    public AutomovilGasolinaDTO() {
    }

    public String getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(String capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String toString() {
        return "AutomovilGasolinaDTO{ Placa: " + this.getPlaca() + "Modelo: "+this.getModelo() + "Color: " + this.getColor() + "Pasajaeros: " + this.getPasajero() +  "capacidadTanque: " + capacidadTanque +  '}';
    }
    
    

}
