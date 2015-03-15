/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.negocio.example2;

import edu.co.sena.akuavida.negocio.example.*;
import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.akuavida.integracion.dao.DepartamentoDao;
import edu.co.sena.akuavida.integracion.dto.Departamento;
import edu.co.sena.akuavida.integracion.exceptions.DepartamentoDaoException;
import edu.co.sena.akuavida.integracion.factory.DepartamentoDaoFactory;
import static edu.co.sena.akuavida.negocio.example2.MunicipioDaoSample.findAll;

public class DepartamentoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereIdDepartamentoEquals("");
		// findWhereNombreDepartamentoEquals("");
            
            
           Departamento departamento = new Departamento();
           departamento.setIdDepartamento("38");
           departamento.setNombreDepartamento("LA L");
           
           DepartamentoDao daoDepartamento = getDepartamentoDao();
           daoDepartamento.insert(departamento);
       
        System.out.println("-----");
        departamento.setNombreDepartamento("El Bronx");
        daoDepartamento.update(departamento.createPk(), departamento);
        findAll();
           
           
           
           
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			DepartamentoDao _dao = getDepartamentoDao();
			Departamento _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdDepartamentoEquals'
	 * 
	 * @param idDepartamento
	 */
	public static void findWhereIdDepartamentoEquals(String idDepartamento)
	{
		try {
			DepartamentoDao _dao = getDepartamentoDao();
			Departamento _result[] = _dao.findWhereIdDepartamentoEquals(idDepartamento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreDepartamentoEquals'
	 * 
	 * @param nombreDepartamento
	 */
	public static void findWhereNombreDepartamentoEquals(String nombreDepartamento)
	{
		try {
			DepartamentoDao _dao = getDepartamentoDao();
			Departamento _result[] = _dao.findWhereNombreDepartamentoEquals(nombreDepartamento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getDepartamentoDao'
	 * 
	 * @return DepartamentoDao
	 */
	public static DepartamentoDao getDepartamentoDao()
	{
		return DepartamentoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Departamento dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdDepartamento() );
		buf.append( ", " );
		buf.append( dto.getNombreDepartamento() );
		System.out.println( buf.toString() );
	}

}
