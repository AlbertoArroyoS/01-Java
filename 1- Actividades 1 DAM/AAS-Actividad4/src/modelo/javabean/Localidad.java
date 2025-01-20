package modelo.javabean;

import java.util.Objects;

/**
 * Entidad localidad, con una id de la localidad, una direccion, una ciudad y un pais
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class Localidad {
	
	/*
	 * atributos privados
	 */
	
	private int idLocalidad;
	private String direccion;
	private String ciudad;
	private String pais;

	
	/*
	 * constructures
	 */
	
	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		super();
		this.idLocalidad = idLocalidad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}


	public Localidad() {
		super();
	}
	
	/*
	 * getter and setter
	 */


	public int getIdLocalidad() {
		return idLocalidad;
	}


	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}

	/*
	 * metodos reescritos de Object
	 */
	
	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idLocalidad);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localidad other = (Localidad) obj;
		return idLocalidad == other.idLocalidad;
	}
		
}
