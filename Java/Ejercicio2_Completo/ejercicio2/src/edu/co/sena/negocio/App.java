/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.negocio;

import edu.co.sena.integracion.entity.dao.CustomerDAO;
import edu.co.sena.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.integracion.factory.DAOAbstractFactory;
import edu.co.sena.integracion.factory.DAOFactory;
import edu.co.sena.integracion.modelo.dto.CustomerDTO;
import edu.co.sena.integracion.modelo.dto.EmployeedDTO;
import edu.co.sena.integracion.modelo.dto.PeopleDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class App {

    public static void main(String[] args) throws Exception {

        CustomerDTO cus = new CustomerDTO();
        cus.setIdCustomerDTO("1");
        cus.setPrimerNombre("Juan");
        cus.setSegundoNombre("David");
        cus.setPrimerApellido("Montero");
        cus.setSegundoApellido("Bogota");
        

        System.out.println(cus.toString());

        EmployeedDTO emp = new EmployeedDTO();
        emp.setIdEmplyeedDTO("2");
        emp.setPrimerNombre("Carlos");
        emp.setSegundoNombre("Eduardo");
        emp.setPrimerApellido("Montoya");
        emp.setSegundoApellido("Patiño");
          System.out.println("----------------------------");

        System.out.println(emp.toString());

        PeopleDTO per = new PeopleDTO();
        per.setPrimerNombre("Andres");
        per.setSegundoNombre("Felipe");
        per.setPrimerApellido("Castañeda");
        per.setSegundoApellido("Sanchez");
          System.out.println("----------------------------");

        System.out.println(per.toString());
        System.out.println("----------------------------");

        DAOFactory Fabrica = DAOAbstractFactory.getdaofACTORY(DAOAbstractFactory.MYSQL_FACTORY);
        EmployeedDAO emp1SalidoFabrica = Fabrica.createEmployeedDAO();
        CustomerDAO cli1SalidaFabrica = Fabrica.createCustomerDAO();
        
        emp1SalidoFabrica.insert(per);
        emp1SalidoFabrica.delete(per);
        emp1SalidoFabrica.update(per);
        emp1SalidoFabrica.findById(per);
        System.out.println("____");
        cli1SalidaFabrica.insert(cus);
        cli1SalidaFabrica.delete(cus); 
        cli1SalidaFabrica.update(cus); 
        cli1SalidaFabrica.findById(cus);
        System.out.println("_________");
        List<PeopleDTO> listaDeEmpleados = new ArrayList<>();
        listaDeEmpleados.add(emp);
        listaDeEmpleados.add(emp);
        listaDeEmpleados.add(emp);
        listaDeEmpleados.add(emp);
        listaDeEmpleados.add(emp);
        
        emp1SalidoFabrica.insert(listaDeEmpleados);
        
        System.out.println("_________");
        List<PeopleDTO> listaDeClientes = new ArrayList<>();
        listaDeClientes.add(per);
        listaDeClientes.add(per);
        listaDeClientes.add(per);
        
        cli1SalidaFabrica.insert(listaDeClientes);
        
    }
    
    

}
