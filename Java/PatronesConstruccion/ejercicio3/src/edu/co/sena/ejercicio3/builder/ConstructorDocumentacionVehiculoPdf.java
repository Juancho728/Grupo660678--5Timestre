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
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        documentacion = new DocumentacionPdf();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF> solicitud de pedido cliente: " + nombreCliente + "/<PDF>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {

        String documento;
        documento = "<PDF> solicitud de matriculacion solicitante: " + nombreSolicitante + "/<PDF>";
        documentacion.agregarDocumento(documento);
    }

}
