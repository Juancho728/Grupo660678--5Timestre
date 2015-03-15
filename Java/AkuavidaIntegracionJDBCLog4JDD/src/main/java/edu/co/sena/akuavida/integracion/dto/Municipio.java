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

public class Municipio implements Serializable
{
	/** 
	 * This attribute maps to the column idMunicipio in the municipio table.
	 */
	protected String idMunicipio;

	/** 
	 * This attribute represents whether the attribute idMunicipio has been modified since being read from the database.
	 */
	protected boolean idMunicipioModified = false;

	/** 
	 * This attribute maps to the column Nombre_Municipio in the municipio table.
	 */
	protected String nombreMunicipio;

	/** 
	 * This attribute represents whether the attribute nombreMunicipio has been modified since being read from the database.
	 */
	protected boolean nombreMunicipioModified = false;

	/** 
	 * This attribute maps to the column Departamento_idDepartamento in the municipio table.
	 */
	protected String departamentoIddepartamento;

	/** 
	 * This attribute represents whether the attribute departamentoIddepartamento has been modified since being read from the database.
	 */
	protected boolean departamentoIddepartamentoModified = false;

	/**
	 * Method 'Municipio'
	 * 
	 */
	public Municipio()
	{
	}

	/**
	 * Method 'getIdMunicipio'
	 * 
	 * @return String
	 */
	public String getIdMunicipio()
	{
		return idMunicipio;
	}

	/**
	 * Method 'setIdMunicipio'
	 * 
	 * @param idMunicipio
	 */
	public void setIdMunicipio(String idMunicipio)
	{
		this.idMunicipio = idMunicipio;
		this.idMunicipioModified = true;
	}

	/** 
	 * Sets the value of idMunicipioModified
	 */
	public void setIdMunicipioModified(boolean idMunicipioModified)
	{
		this.idMunicipioModified = idMunicipioModified;
	}

	/** 
	 * Gets the value of idMunicipioModified
	 */
	public boolean isIdMunicipioModified()
	{
		return idMunicipioModified;
	}

	/**
	 * Method 'getNombreMunicipio'
	 * 
	 * @return String
	 */
	public String getNombreMunicipio()
	{
		return nombreMunicipio;
	}

	/**
	 * Method 'setNombreMunicipio'
	 * 
	 * @param nombreMunicipio
	 */
	public void setNombreMunicipio(String nombreMunicipio)
	{
		this.nombreMunicipio = nombreMunicipio;
		this.nombreMunicipioModified = true;
	}

	/** 
	 * Sets the value of nombreMunicipioModified
	 */
	public void setNombreMunicipioModified(boolean nombreMunicipioModified)
	{
		this.nombreMunicipioModified = nombreMunicipioModified;
	}

	/** 
	 * Gets the value of nombreMunicipioModified
	 */
	public boolean isNombreMunicipioModified()
	{
		return nombreMunicipioModified;
	}

	/**
	 * Method 'getDepartamentoIddepartamento'
	 * 
	 * @return String
	 */
	public String getDepartamentoIddepartamento()
	{
		return departamentoIddepartamento;
	}

	/**
	 * Method 'setDepartamentoIddepartamento'
	 * 
	 * @param departamentoIddepartamento
	 */
	public void setDepartamentoIddepartamento(String departamentoIddepartamento)
	{
		this.departamentoIddepartamento = departamentoIddepartamento;
		this.departamentoIddepartamentoModified = true;
	}

	/** 
	 * Sets the value of departamentoIddepartamentoModified
	 */
	public void setDepartamentoIddepartamentoModified(boolean departamentoIddepartamentoModified)
	{
		this.departamentoIddepartamentoModified = departamentoIddepartamentoModified;
	}

	/** 
	 * Gets the value of departamentoIddepartamentoModified
	 */
	public boolean isDepartamentoIddepartamentoModified()
	{
		return departamentoIddepartamentoModified;
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
		
		if (!(_other instanceof Municipio)) {
			return false;
		}
		
		final Municipio _cast = (Municipio) _other;
		if (idMunicipio == null ? _cast.idMunicipio != idMunicipio : !idMunicipio.equals( _cast.idMunicipio )) {
			return false;
		}
		
		if (idMunicipioModified != _cast.idMunicipioModified) {
			return false;
		}
		
		if (nombreMunicipio == null ? _cast.nombreMunicipio != nombreMunicipio : !nombreMunicipio.equals( _cast.nombreMunicipio )) {
			return false;
		}
		
		if (nombreMunicipioModified != _cast.nombreMunicipioModified) {
			return false;
		}
		
		if (departamentoIddepartamento == null ? _cast.departamentoIddepartamento != departamentoIddepartamento : !departamentoIddepartamento.equals( _cast.departamentoIddepartamento )) {
			return false;
		}
		
		if (departamentoIddepartamentoModified != _cast.departamentoIddepartamentoModified) {
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
		if (idMunicipio != null) {
			_hashCode = 29 * _hashCode + idMunicipio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idMunicipioModified ? 1 : 0);
		if (nombreMunicipio != null) {
			_hashCode = 29 * _hashCode + nombreMunicipio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreMunicipioModified ? 1 : 0);
		if (departamentoIddepartamento != null) {
			_hashCode = 29 * _hashCode + departamentoIddepartamento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (departamentoIddepartamentoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return MunicipioPk
	 */
	public MunicipioPk createPk()
	{
		return new MunicipioPk(idMunicipio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.akuavida.integracion.dto.Municipio: " );
		ret.append( "idMunicipio=" + idMunicipio );
		ret.append( ", nombreMunicipio=" + nombreMunicipio );
		ret.append( ", departamentoIddepartamento=" + departamentoIddepartamento );
		return ret.toString();
	}

}