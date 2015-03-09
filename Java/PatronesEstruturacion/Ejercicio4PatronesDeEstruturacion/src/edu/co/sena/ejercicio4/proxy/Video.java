/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.proxy;

/**
 *
 * @author toshiba_
 */
public class Video implements Animacion {

    public Video() {
    }

    @Override
    public void clic() {
    }

    @Override
    public void dibuja() {
        System.out.println("Mostrar el video");
    }

    public void reproduce() {
        System.out.println("Reproducir el video");
    }

    public void carga() {
        System.out.println("Cargar el video");
    }

}
