/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entity.dao.mysql;

import edu.co.sena.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author colsutec R
 */
public class EmployeedDAOMysqlImpl implements EmployeedDAO{

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Se inserto el empleado en MYSQL " + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Se actualizo el empleado en MYSQL " + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
       System.out.println("Se elimino el empleado en MYSQL " + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
        System.out.println("Se busca el empleado en MYSQL " + p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
        for (PeopleDTO p1: p) {
            System.out.println("Se inserto empleado en MYSQL " + p1.toString());
        }
    }
    
    
}
