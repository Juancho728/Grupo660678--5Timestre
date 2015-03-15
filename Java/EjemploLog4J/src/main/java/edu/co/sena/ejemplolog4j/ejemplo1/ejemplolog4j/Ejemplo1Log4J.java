/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplolog4j.ejemplo1.ejemplolog4j;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author ColsutecR
 */
public class Ejemplo1Log4J {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("Ejemplo1Log4J.class");
        
        PropertyConfigurator.configure("log4j.properties");
        log.fatal("Esto es un error fatal");
        log.error("Esto es un error");
        log.warn("Esto es una advertencia");
        log.info("Esto es un mensaje de informacion");
        log.debug("Esto es un mensaje de debug");
        log.trace("Esto es un mensaje de rezabilidad");
    }
}
