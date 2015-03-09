/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.factory.postgrest;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.integracion.entity.dao.postgreSQL.CustomerDAOPostgreSQLImpl;
import edu.co.sena.integracion.entity.dao.postgreSQL.EmployeedDAOPostgreSQLImpl;
import edu.co.sena.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author colsutec R
 */
public class PostgreSQLDAOFactory extends DAOAbstractFactory {
    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOPostgreSQLImpl();
    }

    @Override
    public CustomerDAO createCustomerDAO() {
        return new CustomerDAOPostgreSQLImpl();
    }
    
}
