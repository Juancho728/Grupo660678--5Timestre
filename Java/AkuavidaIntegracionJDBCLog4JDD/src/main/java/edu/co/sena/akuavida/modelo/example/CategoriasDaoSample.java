/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.modelo.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.akuavida.integracion.dao.CategoriasDao;
import edu.co.sena.akuavida.integracion.dto.Categorias;
import edu.co.sena.akuavida.integracion.exceptions.CategoriasDaoException;
import edu.co.sena.akuavida.integracion.factory.CategoriasDaoFactory;

public class CategoriasDaoSample
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
		// findWhereIdCategoriaEquals(0);
		// findWhereNombreEquals("");
		// findWhereActivaEquals(0);
		// findWhereParienteEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CategoriasDao _dao = getCategoriasDao();
			Categorias _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdCategoriaEquals'
	 * 
	 * @param idCategoria
	 */
	public static void findWhereIdCategoriaEquals(int idCategoria)
	{
		try {
			CategoriasDao _dao = getCategoriasDao();
			Categorias _result[] = _dao.findWhereIdCategoriaEquals(idCategoria);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreEquals'
	 * 
	 * @param nombre
	 */
	public static void findWhereNombreEquals(String nombre)
	{
		try {
			CategoriasDao _dao = getCategoriasDao();
			Categorias _result[] = _dao.findWhereNombreEquals(nombre);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereActivaEquals'
	 * 
	 * @param activa
	 */
	public static void findWhereActivaEquals(short activa)
	{
		try {
			CategoriasDao _dao = getCategoriasDao();
			Categorias _result[] = _dao.findWhereActivaEquals(activa);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereParienteEquals'
	 * 
	 * @param pariente
	 */
	public static void findWhereParienteEquals(int pariente)
	{
		try {
			CategoriasDao _dao = getCategoriasDao();
			Categorias _result[] = _dao.findWhereParienteEquals(pariente);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCategoriasDao'
	 * 
	 * @return CategoriasDao
	 */
	public static CategoriasDao getCategoriasDao()
	{
		return CategoriasDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Categorias dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdCategoria() );
		buf.append( ", " );
		buf.append( dto.getNombre() );
		buf.append( ", " );
		buf.append( dto.getActiva() );
		buf.append( ", " );
		buf.append( dto.getPariente() );
		System.out.println( buf.toString() );
	}

}
