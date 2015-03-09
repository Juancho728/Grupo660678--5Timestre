/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.entity.dao.mysql;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author colsutec R
 */
public class CustomerDAOMysqlImpl implements CustomerDAO {

    @Override
    public void insert(PeopleDTO p) {
        System.out.println("Se inserto el cliente en MYSQL " + p.toString());
    }

    @Override
    public void update(PeopleDTO p) {
        System.out.println("Se actualizo el cliente en MYSQL " + p.toString());
    }

    @Override
    public void delete(PeopleDTO p) {
        System.out.println("Se elimino el cliente en MYSQL " + p.toString());
    }

    @Override
    public void findById(PeopleDTO p) {
        System.out.println("Se busca el cliente en MYSQL " + p.toString());
    }

    @Override
    public void insert(Collection<PeopleDTO> p) {
        for (PeopleDTO p1 : p) {
            System.out.println("Se inserto cliente en MYSQL " + p1.toString());
        }

    }
}
