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
public class App3 {

    public static void main(String[] args) {
        Logger log = Logger.getLogger("App3.class");
        try {
            PropertyConfigurator.configure("log4jDB.properties");
            log.fatal("Esto es un error fatal");
            log.error("Esto es un error");
            log.warn("Esto es una advertencia");
            log.info("Esto es un mensaje de informacion");
            log.debug("Esto es un mensaje de debug");
            log.trace("Esto es un mensaje de rezabilidad");

            int a = 1;
            int b = 0;
            int c = a / b;
        } catch (Exception e) {
            log.fatal("Error " + e);
        }
    }
}
