/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.modelo.dto;

import java.io.Serializable;

/**
 *
 * @author ColsutecR
 */
public class CustomerDTO extends PeopleDTO implements Serializable {

    private String idCustomerDTO;

    public CustomerDTO() {
    }

    public String getIdCustomerDTO() {
        return idCustomerDTO;
    }

    public void setIdCustomerDTO(String idCustomerDTO) {
        this.idCustomerDTO = idCustomerDTO;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "idCustomerDTO: " + idCustomerDTO + '}'
                + ", primerNombre: " + this.getPrimerNombre()
                + ", segundoNombre: " + this.getSegundoNombre()
                + ", PrimerApellido: " + this.getPrimerApellido()
                + ", segundoApellido: " + this.getSegundoApellido() + '}' ;
    }

}
