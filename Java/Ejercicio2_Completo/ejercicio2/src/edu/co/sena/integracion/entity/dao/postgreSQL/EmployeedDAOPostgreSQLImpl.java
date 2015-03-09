/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entity.dao.postgreSQL;

import edu.co.sena.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author colsutec R
 */
public class EmployeedDAOPostgreSQLImpl implements EmployeedDAO{

    @Override
    public void insert(PeopleDTO p) {
         System.out.println("Inserte el empleado en postgreSQL " + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
         System.out.println("Actualize el empleado en postgreSQL " + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
         System.out.println("Eliminar el empleado en postgreSQL " + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
        System.out.println("Se busca el empleado en postgreSQL " + p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
    for (PeopleDTO p1: p) {
            System.out.println("Se inserto empleado en postgreSQL " + p1.toString());
        }
    }
}
