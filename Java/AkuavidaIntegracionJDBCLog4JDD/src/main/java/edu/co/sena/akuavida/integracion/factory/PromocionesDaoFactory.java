/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.factory;

import java.sql.Connection;
import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.jdbc.*;

public class PromocionesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PromocionesDao
	 */
	public static PromocionesDao create()
	{
		return new PromocionesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PromocionesDao
	 */
	public static PromocionesDao create(Connection conn)
	{
		return new PromocionesDaoImpl( conn );
	}

}
