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
import edu.co.sena.akuavida.integracion.dao.FacturaDao;
import edu.co.sena.akuavida.integracion.dto.Factura;
import edu.co.sena.akuavida.integracion.exceptions.FacturaDaoException;
import edu.co.sena.akuavida.integracion.factory.FacturaDaoFactory;

public class FacturaDaoSample
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
		// findByCuenta("", "");
		// findWhereIdFacturaEquals(0);
		// findWhereFechaEquals(null);
		// findWhereCuentaTipoDocumentoEquals("");
		// findWhereCuentaNumeroDocumentoEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCuenta'
	 * 
	 * @param cuentaTipoDocumento
	 * @param cuentaNumeroDocumento
	 */
	public static void findByCuenta(String cuentaTipoDocumento, String cuentaNumeroDocumento)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findByCuenta(cuentaTipoDocumento, cuentaNumeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdFacturaEquals'
	 * 
	 * @param idFactura
	 */
	public static void findWhereIdFacturaEquals(int idFactura)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereIdFacturaEquals(idFactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaEquals'
	 * 
	 * @param fecha
	 */
	public static void findWhereFechaEquals(Date fecha)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereFechaEquals(fecha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCuentaTipoDocumentoEquals'
	 * 
	 * @param cuentaTipoDocumento
	 */
	public static void findWhereCuentaTipoDocumentoEquals(String cuentaTipoDocumento)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereCuentaTipoDocumentoEquals(cuentaTipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCuentaNumeroDocumentoEquals'
	 * 
	 * @param cuentaNumeroDocumento
	 */
	public static void findWhereCuentaNumeroDocumentoEquals(String cuentaNumeroDocumento)
	{
		try {
			FacturaDao _dao = getFacturaDao();
			Factura _result[] = _dao.findWhereCuentaNumeroDocumentoEquals(cuentaNumeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getFacturaDao'
	 * 
	 * @return FacturaDao
	 */
	public static FacturaDao getFacturaDao()
	{
		return FacturaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Factura dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdFactura() );
		buf.append( ", " );
		buf.append( dto.getFecha() );
		buf.append( ", " );
		buf.append( dto.getCuentaTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getCuentaNumeroDocumento() );
		System.out.println( buf.toString() );
	}

}
