/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.builder;

/**
 *
 * @author toshiba_
 */
public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {
    
    public ConstructorDocumentacionVehiculoHtml() {
        
        documentacion = new DocumentacionHtml();
    }
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML> solicitud de pedido cliente: " + nombreCliente + "/<HTML>";
        documentacion.agregarDocumento(documento);
    }
    
    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<HTML> solicitud de matriculacion solicitante: " + nombreSolicitante + "/<HTML>";
        documentacion.agregarDocumento(documento);
        
    }
    
}
