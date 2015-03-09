/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.bridge;

/**
 *
 * @author toshiba_
 */
public class Usuario {

    public static void main(String[] args) {
        
        FormularioMatriculacionEspana formulario1 = new FormularioMatriculacionEspana(new FormHtmlImpl());
        formulario1.visualiza();
        if (formulario1.administraZona()) {
            formulario1.generaDocumento();
        }
        
        System.out.println();
        
        FormularioMatriculacionColombia formulario2 = new FormularioMatriculacionColombia(new FormAppletImpl());
        formulario2.visualiza();
        if (formulario2.administraZona()) {
            formulario2.generaDocumento();
        }

    }
}
