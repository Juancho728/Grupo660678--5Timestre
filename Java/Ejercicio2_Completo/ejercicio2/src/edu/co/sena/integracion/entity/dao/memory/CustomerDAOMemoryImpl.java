/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entity.dao.memory;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author colsutec R
 */
public class CustomerDAOMemoryImpl implements CustomerDAO {

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Inserte el cliente en memory " + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("actualizar el cliente en memory " + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Eliminar el cliente en memory " + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
       System.out.println("Se busca el cliente en memory " + p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
        for (PeopleDTO p1: p) {
            System.out.println("Se inserto cliente en memory " + p1.toString());
        }
    }

}
