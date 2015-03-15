/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplolog4j.ejemplo1.ejerciciolog4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author ColsutecR
 */
public class App1 {

    public static void main(String[] args) {
        
        Logger log = Logger.getLogger("App1.class");

        PropertyConfigurator.configure("log4j.properties");
        log.fatal("Esto es un error fatal");
        log.error("Esto es un error");
        log.warn("Esto es una advertencia");
        log.info("Esto es un mensaje de informacion");
        log.debug("Esto es un mensaje de debug");
        log.trace("Esto es un mensaje de rezabilidad");
    }
}
