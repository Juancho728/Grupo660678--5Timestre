/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.factory.oracle;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.integracion.entity.dao.oracle.CustomerDAOOracleImpl;
import edu.co.sena.integracion.entity.dao.oracle.EmployeedDAOOracleImpl;
import edu.co.sena.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author colsutec R
 */
public class OracleDAOFactory extends DAOAbstractFactory{

    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOOracleImpl();
    }

    @Override
    public CustomerDAO createCustomerDAO() {
        return new CustomerDAOOracleImpl();
    }
    
    
}
