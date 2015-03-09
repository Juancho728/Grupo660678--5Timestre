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
public class EmployeedDTO extends PeopleDTO implements Serializable {

    private String idEmplyeedDTO;

    public EmployeedDTO() {
    }

    public String getIdEmplyeedDTO() {
        return idEmplyeedDTO;
    }

    public void setIdEmplyeedDTO(String idEmplyeedDTO) {
        this.idEmplyeedDTO = idEmplyeedDTO;
    }

    @Override
    public String toString() {
        return "EmployeedDTO{" + "idEmplyeedDTO: " + idEmplyeedDTO
                + ", primerNombre: " + this.getPrimerNombre()
                + ", segundoNombre: " + this.getSegundoNombre()
                + ", primerApellido: " + this.getPrimerApellido()
                + ", segundoApellido: " + this.getSegundoApellido() + '}';
    }

}
