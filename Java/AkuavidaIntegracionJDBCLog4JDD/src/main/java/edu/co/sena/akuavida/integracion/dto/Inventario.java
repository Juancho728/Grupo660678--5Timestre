/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.akuavida.integracion.dto;

import edu.co.sena.akuavida.integracion.dao.*;
import edu.co.sena.akuavida.integracion.factory.*;
import edu.co.sena.akuavida.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Inventario implements Serializable
{
	/** 
	 * This attribute maps to the column ID_Inventario in the inventario table.
	 */
	protected int idInventario;

	/** 
	 * This attribute represents whether the attribute idInventario has been modified since being read from the database.
	 */
	protected boolean idInventarioModified = false;

	/** 
	 * This attribute maps to the column Cantidad in the inventario table.
	 */
	protected int cantidad;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/** 
	 * This attribute maps to the column Producto_ID_producto in the inventario table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute represents whether the attribute productoIdProducto has been modified since being read from the database.
	 */
	protected boolean productoIdProductoModified = false;

	/** 
	 * This attribute maps to the column Cantidad_Producto_Comprado in the inventario table.
	 */
	protected float cantidadProductoComprado;

	/** 
	 * This attribute represents whether the attribute cantidadProductoComprado has been modified since being read from the database.
	 */
	protected boolean cantidadProductoCompradoModified = false;

	/** 
	 * This attribute maps to the column Fecha_De_Compra in the inventario table.
	 */
	protected Date fechaDeCompra;

	/** 
	 * This attribute represents whether the attribute fechaDeCompra has been modified since being read from the database.
	 */
	protected boolean fechaDeCompraModified = false;

	/**
	 * Method 'Inventario'
	 * 
	 */
	public Inventario()
	{
	}

	/**
	 * Method 'getIdInventario'
	 * 
	 * @return int
	 */
	public int getIdInventario()
	{
		return idInventario;
	}

	/**
	 * Method 'setIdInventario'
	 * 
	 * @param idInventario
	 */
	public void setIdInventario(int idInventario)
	{
		this.idInventario = idInventario;
		this.idInventarioModified = true;
	}

	/** 
	 * Sets the value of idInventarioModified
	 */
	public void setIdInventarioModified(boolean idInventarioModified)
	{
		this.idInventarioModified = idInventarioModified;
	}

	/** 
	 * Gets the value of idInventarioModified
	 */
	public boolean isIdInventarioModified()
	{
		return idInventarioModified;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return int
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadModified = true;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
	}

	/**
	 * Method 'getProductoIdProducto'
	 * 
	 * @return String
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/**
	 * Method 'setProductoIdProducto'
	 * 
	 * @param productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
		this.productoIdProductoModified = true;
	}

	/** 
	 * Sets the value of productoIdProductoModified
	 */
	public void setProductoIdProductoModified(boolean productoIdProductoModified)
	{
		this.productoIdProductoModified = productoIdProductoModified;
	}

	/** 
	 * Gets the value of productoIdProductoModified
	 */
	public boolean isProductoIdProductoModified()
	{
		return productoIdProductoModified;
	}

	/**
	 * Method 'getCantidadProductoComprado'
	 * 
	 * @return float
	 */
	public float getCantidadProductoComprado()
	{
		return cantidadProductoComprado;
	}

	/**
	 * Method 'setCantidadProductoComprado'
	 * 
	 * @param cantidadProductoComprado
	 */
	public void setCantidadProductoComprado(float cantidadProductoComprado)
	{
		this.cantidadProductoComprado = cantidadProductoComprado;
		this.cantidadProductoCompradoModified = true;
	}

	/** 
	 * Sets the value of cantidadProductoCompradoModified
	 */
	public void setCantidadProductoCompradoModified(boolean cantidadProductoCompradoModified)
	{
		this.cantidadProductoCompradoModified = cantidadProductoCompradoModified;
	}

	/** 
	 * Gets the value of cantidadProductoCompradoModified
	 */
	public boolean isCantidadProductoCompradoModified()
	{
		return cantidadProductoCompradoModified;
	}

	/**
	 * Method 'getFechaDeCompra'
	 * 
	 * @return Date
	 */
	public Date getFechaDeCompra()
	{
		return fechaDeCompra;
	}

	/**
	 * Method 'setFechaDeCompra'
	 * 
	 * @param fechaDeCompra
	 */
	public void setFechaDeCompra(Date fechaDeCompra)
	{
		this.fechaDeCompra = fechaDeCompra;
		this.fechaDeCompraModified = true;
	}

	/** 
	 * Sets the value of fechaDeCompraModified
	 */
	public void setFechaDeCompraModified(boolean fechaDeCompraModified)
	{
		this.fechaDeCompraModified = fechaDeCompraModified;
	}

	/** 
	 * Gets the value of fechaDeCompraModified
	 */
	public boolean isFechaDeCompraModified()
	{
		return fechaDeCompraModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Inventario)) {
			return false;
		}
		
		final Inventario _cast = (Inventario) _other;
		if (idInventario != _cast.idInventario) {
			return false;
		}
		
		if (idInventarioModified != _cast.idInventarioModified) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
			return false;
		}
		
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (productoIdProductoModified != _cast.productoIdProductoModified) {
			return false;
		}
		
		if (cantidadProductoComprado != _cast.cantidadProductoComprado) {
			return false;
		}
		
		if (cantidadProductoCompradoModified != _cast.cantidadProductoCompradoModified) {
			return false;
		}
		
		if (fechaDeCompra == null ? _cast.fechaDeCompra != fechaDeCompra : !fechaDeCompra.equals( _cast.fechaDeCompra )) {
			return false;
		}
		
		if (fechaDeCompraModified != _cast.fechaDeCompraModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idInventario;
		_hashCode = 29 * _hashCode + (idInventarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (productoIdProductoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(cantidadProductoComprado);
		_hashCode = 29 * _hashCode + (cantidadProductoCompradoModified ? 1 : 0);
		if (fechaDeCompra != null) {
			_hashCode = 29 * _hashCode + fechaDeCompra.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaDeCompraModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InventarioPk
	 */
	public InventarioPk createPk()
	{
		return new InventarioPk(idInventario, productoIdProducto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Inventario: " );
		ret.append( "idInventario=" + idInventario );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", productoIdProducto=" + productoIdProducto );
		ret.append( ", cantidadProductoComprado=" + cantidadProductoComprado );
		ret.append( ", fechaDeCompra=" + fechaDeCompra );
		return ret.toString();
	}

}
