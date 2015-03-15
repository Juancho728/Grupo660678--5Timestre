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

public class Promociones implements Serializable
{
	/** 
	 * This attribute maps to the column Id_Promocion in the promociones table.
	 */
	protected String idPromocion;

	/** 
	 * This attribute represents whether the attribute idPromocion has been modified since being read from the database.
	 */
	protected boolean idPromocionModified = false;

	/** 
	 * This attribute maps to the column Descuentos in the promociones table.
	 */
	protected float descuentos;

	/** 
	 * This attribute represents whether the attribute descuentos has been modified since being read from the database.
	 */
	protected boolean descuentosModified = false;

	/** 
	 * This attribute maps to the column Nombre in the promociones table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column Precio in the promociones table.
	 */
	protected float precio;

	/** 
	 * This attribute represents whether the attribute precio has been modified since being read from the database.
	 */
	protected boolean precioModified = false;

	/** 
	 * This attribute maps to the column Producto_ID_producto in the promociones table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute represents whether the attribute productoIdProducto has been modified since being read from the database.
	 */
	protected boolean productoIdProductoModified = false;

	/**
	 * Method 'Promociones'
	 * 
	 */
	public Promociones()
	{
	}

	/**
	 * Method 'getIdPromocion'
	 * 
	 * @return String
	 */
	public String getIdPromocion()
	{
		return idPromocion;
	}

	/**
	 * Method 'setIdPromocion'
	 * 
	 * @param idPromocion
	 */
	public void setIdPromocion(String idPromocion)
	{
		this.idPromocion = idPromocion;
		this.idPromocionModified = true;
	}

	/** 
	 * Sets the value of idPromocionModified
	 */
	public void setIdPromocionModified(boolean idPromocionModified)
	{
		this.idPromocionModified = idPromocionModified;
	}

	/** 
	 * Gets the value of idPromocionModified
	 */
	public boolean isIdPromocionModified()
	{
		return idPromocionModified;
	}

	/**
	 * Method 'getDescuentos'
	 * 
	 * @return float
	 */
	public float getDescuentos()
	{
		return descuentos;
	}

	/**
	 * Method 'setDescuentos'
	 * 
	 * @param descuentos
	 */
	public void setDescuentos(float descuentos)
	{
		this.descuentos = descuentos;
		this.descuentosModified = true;
	}

	/** 
	 * Sets the value of descuentosModified
	 */
	public void setDescuentosModified(boolean descuentosModified)
	{
		this.descuentosModified = descuentosModified;
	}

	/** 
	 * Gets the value of descuentosModified
	 */
	public boolean isDescuentosModified()
	{
		return descuentosModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
	}

	/**
	 * Method 'getPrecio'
	 * 
	 * @return float
	 */
	public float getPrecio()
	{
		return precio;
	}

	/**
	 * Method 'setPrecio'
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio)
	{
		this.precio = precio;
		this.precioModified = true;
	}

	/** 
	 * Sets the value of precioModified
	 */
	public void setPrecioModified(boolean precioModified)
	{
		this.precioModified = precioModified;
	}

	/** 
	 * Gets the value of precioModified
	 */
	public boolean isPrecioModified()
	{
		return precioModified;
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
		
		if (!(_other instanceof Promociones)) {
			return false;
		}
		
		final Promociones _cast = (Promociones) _other;
		if (idPromocion == null ? _cast.idPromocion != idPromocion : !idPromocion.equals( _cast.idPromocion )) {
			return false;
		}
		
		if (idPromocionModified != _cast.idPromocionModified) {
			return false;
		}
		
		if (descuentos != _cast.descuentos) {
			return false;
		}
		
		if (descuentosModified != _cast.descuentosModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (precio != _cast.precio) {
			return false;
		}
		
		if (precioModified != _cast.precioModified) {
			return false;
		}
		
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (productoIdProductoModified != _cast.productoIdProductoModified) {
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
		if (idPromocion != null) {
			_hashCode = 29 * _hashCode + idPromocion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idPromocionModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(descuentos);
		_hashCode = 29 * _hashCode + (descuentosModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precio);
		_hashCode = 29 * _hashCode + (precioModified ? 1 : 0);
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (productoIdProductoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PromocionesPk
	 */
	public PromocionesPk createPk()
	{
		return new PromocionesPk(idPromocion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Promociones: " );
		ret.append( "idPromocion=" + idPromocion );
		ret.append( ", descuentos=" + descuentos );
		ret.append( ", nombre=" + nombre );
		ret.append( ", precio=" + precio );
		ret.append( ", productoIdProducto=" + productoIdProducto );
		return ret.toString();
	}

}