/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.integracion.factory.mysql;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.integracion.entity.dao.mysql.CustomerDAOMysqlImpl;
import edu.co.sena.integracion.entity.dao.mysql.EmployeedDAOMysqlImpl;
import edu.co.sena.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author colsutec R
 */
public class MysqlDAOFactory extends DAOAbstractFactory{
    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOMysqlImpl();
    }

    @Override
    public CustomerDAO createCustomerDAO() {
        return new CustomerDAOMysqlImpl();
    }
    
}
