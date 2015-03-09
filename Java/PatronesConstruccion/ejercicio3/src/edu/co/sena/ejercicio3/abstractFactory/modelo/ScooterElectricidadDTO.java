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
public class ScooterElectricidadDTO extends ScooterDTO {

    private String voltaje;
    private String amperaje;

    public ScooterElectricidadDTO() {
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(String amperaje) {
        this.amperaje = amperaje;
    }

    @Override
    public String toString() {
        return "AutomovilElectricidadDTO{Placa: " + this.getPlaca() + "Modelo: " + this.getModelo() + "Color: " + this.getColor() + "Pasajaeros: " + this.getPasajero() + "Voltaje: " + voltaje + ", Amperaje: " + amperaje + '}';
    }

}
