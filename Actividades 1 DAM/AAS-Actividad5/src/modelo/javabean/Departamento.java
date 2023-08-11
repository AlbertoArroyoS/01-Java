package modelo.javabean;

import java.util.Objects;

/**
 * Entidad departamento, con un idDepartemento, descripcion y un objeto de tipo Localidad
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class Departamento {
	
	/*
	 * atributos privados
	 */
	
	private int idDepar;
	private String descripcion;
	private Localidad localidad;
	
	/*
	 * constructures
	 */
	
	public Departamento(int idDepar, String descripcion, Localidad localidad) {
		super();
		this.idDepar = idDepar;
		this.descripcion = descripcion;
		this.localidad = localidad;
	}


	public Departamento() {
		super();
	}
	/*
	 * getter and setter
	 */

	public int getIdDepar() {
		return idDepar;
	}


	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Localidad getLocalidad() {
		return localidad;
	}


	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	/*
	 * metodos reescritos de Object
	 */
	
	@Override
	public String toString() {
		return "Departamento [idDepar=" + idDepar + ", descripcion=" + descripcion + ", localidad=" + localidad + "]";
	}
	
	/*
	 * 
	 */

	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return idDepar == other.idDepar;
	}
	
	
	
	
}
