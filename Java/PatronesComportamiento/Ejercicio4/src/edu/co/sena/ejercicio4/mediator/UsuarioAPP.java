/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.mediator;

/**
 *
 * @author toshiba_
 */
public class UsuarioAPP {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.agregarControl(new ZonaInformacion("Nombre "));
        formulario.agregarControl(new ZonaInformacion("Apellidos "));
        PopupMenu menu = new PopupMenu("Coprestatario");
        menu.agregarOpcion("Sin coprestatario ");
        menu.agregarOpcion("Con coprestatario ");
        formulario.agregarControl(menu);
        formulario.setMenuCoprestatario(menu);
        Boton boton = new Boton("OK");
        formulario.agregarControl(boton);
        formulario.setBotonOK(boton);
        formulario.agregaControlCoprestatario(new ZonaInformacion("Nombre del coprestatario "));
        formulario.agregaControlCoprestatario(new ZonaInformacion("Apellidos del coprestatario "));
        formulario.informa();

    }
}
