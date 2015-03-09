/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototype;

/**
 *
 * @author ColsutecR
 */
public class Usuario {

    public static void main(String[] args) {
        //inicializacion de la documentacion en blaco
       DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.instance();
       documentacionEnBlanco.incluye(new OrdenDePedido());
       documentacionEnBlanco.incluye(new CertificadoCesion());
       documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        //creacion de documentacion nuevo para dos clientes         
       DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Juancho");
       DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Fabian");
       documentacionCliente1.visualiza();
       documentacionCliente2.visualiza();
       
    }
}
