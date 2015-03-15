/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.jdbc;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import edu.co.sena.akuavida.integracion.dto.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PagoDaoImpl extends AbstractDAO implements PagoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( PagoDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT Factura_ID_Factura, Tipo_Pago, Numero_Tarjeta FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( Factura_ID_Factura, Tipo_Pago, Numero_Tarjeta ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET Factura_ID_Factura = ?, Tipo_Pago = ?, Numero_Tarjeta = ? WHERE Factura_ID_Factura = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE Factura_ID_Factura = ?";

	/** 
	 * Index of column Factura_ID_Factura
	 */
	protected static final int COLUMN_FACTURA_ID_FACTURA = 1;

	/** 
	 * Index of column Tipo_Pago
	 */
	protected static final int COLUMN_TIPO_PAGO = 2;

	/** 
	 * Index of column Numero_Tarjeta
	 */
	protected static final int COLUMN_NUMERO_TARJETA = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column Factura_ID_Factura
	 */
	protected static final int PK_COLUMN_FACTURA_ID_FACTURA = 1;

	/** 
	 * Inserts a new row in the pago table.
	 */
	public PagoPk insert(Pago dto) throws PagoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isFacturaIdFacturaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Factura_ID_Factura" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTipoPagoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Tipo_Pago" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNumeroTarjetaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Numero_Tarjeta" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdFacturaModified()) {
				stmt.setInt( index++, dto.getFacturaIdFactura() );
			}
		
			if (dto.isTipoPagoModified()) {
				stmt.setString( index++, dto.getTipoPago() );
			}
		
			if (dto.isNumeroTarjetaModified()) {
				stmt.setString( index++, dto.getNumeroTarjeta() );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the pago table.
	 */
	public void update(PagoPk pk, Pago dto) throws PagoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isFacturaIdFacturaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Factura_ID_Factura=?" );
				modified=true;
			}
		
			if (dto.isTipoPagoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Tipo_Pago=?" );
				modified=true;
			}
		
			if (dto.isNumeroTarjetaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Numero_Tarjeta=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE Factura_ID_Factura=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdFacturaModified()) {
				stmt.setInt( index++, dto.getFacturaIdFactura() );
			}
		
			if (dto.isTipoPagoModified()) {
				stmt.setString( index++, dto.getTipoPago() );
			}
		
			if (dto.isNumeroTarjetaModified()) {
				stmt.setString( index++, dto.getNumeroTarjeta() );
			}
		
			stmt.setInt( index++, pk.getFacturaIdFactura() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the pago table.
	 */
	public void delete(PagoPk pk) throws PagoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getFacturaIdFactura() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the pago table that matches the specified primary-key value.
	 */
	public Pago findByPrimaryKey(PagoPk pk) throws PagoDaoException
	{
		return findByPrimaryKey( pk.getFacturaIdFactura() );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_ID_Factura = :facturaIdFactura'.
	 */
	public Pago findByPrimaryKey(int facturaIdFactura) throws PagoDaoException
	{
		Pago ret[] = findByDynamicSelect( SQL_SELECT + " WHERE Factura_ID_Factura = ?", new Object[] {  new Integer(facturaIdFactura) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the pago table that match the criteria ''.
	 */
	public Pago[] findAll() throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY Factura_ID_Factura", null );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_ID_Factura = :facturaIdFactura'.
	 */
	public Pago[] findByFactura(int facturaIdFactura) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Factura_ID_Factura = ?", new Object[] {  new Integer(facturaIdFactura) } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Factura_ID_Factura = :facturaIdFactura'.
	 */
	public Pago[] findWhereFacturaIdFacturaEquals(int facturaIdFactura) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Factura_ID_Factura = ? ORDER BY Factura_ID_Factura", new Object[] {  new Integer(facturaIdFactura) } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Tipo_Pago = :tipoPago'.
	 */
	public Pago[] findWhereTipoPagoEquals(String tipoPago) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Tipo_Pago = ? ORDER BY Tipo_Pago", new Object[] { tipoPago } );
	}

	/** 
	 * Returns all rows from the pago table that match the criteria 'Numero_Tarjeta = :numeroTarjeta'.
	 */
	public Pago[] findWhereNumeroTarjetaEquals(String numeroTarjeta) throws PagoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Numero_Tarjeta = ? ORDER BY Numero_Tarjeta", new Object[] { numeroTarjeta } );
	}

	/**
	 * Method 'PagoDaoImpl'
	 * 
	 */
	public PagoDaoImpl()
	{
	}

	/**
	 * Method 'PagoDaoImpl'
	 * 
	 * @param userConn
	 */
	public PagoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "akuavida.pago";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Pago fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Pago dto = new Pago();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Pago[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Pago dto = new Pago();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Pago ret[] = new Pago[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Pago dto, ResultSet rs) throws SQLException
	{
		dto.setFacturaIdFactura( rs.getInt( COLUMN_FACTURA_ID_FACTURA ) );
		dto.setTipoPago( rs.getString( COLUMN_TIPO_PAGO ) );
		dto.setNumeroTarjeta( rs.getString( COLUMN_NUMERO_TARJETA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Pago dto)
	{
		dto.setFacturaIdFacturaModified( false );
		dto.setTipoPagoModified( false );
		dto.setNumeroTarjetaModified( false );
	}

	/** 
	 * Returns all rows from the pago table that match the specified arbitrary SQL statement
	 */
	public Pago[] findByDynamicSelect(String sql, Object[] sqlParams) throws PagoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the pago table that match the specified arbitrary SQL statement
	 */
	public Pago[] findByDynamicWhere(String sql, Object[] sqlParams) throws PagoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new PagoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
