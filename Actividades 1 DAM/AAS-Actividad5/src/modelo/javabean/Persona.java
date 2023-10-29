package modelo.javabean;

import java.util.Objects;

/**
 * Entidad Persona, de tipo abstracto. Con los atributos privados de tipo string, nif, nombre, direccion, telefono.
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public abstract class Persona {
	
	//ATRIBUTOS PRIVADOS
	
	/**
	 * Nif es el numero de idendificacion fiscal univoco de la persona 
	 */
	private String nif;
	
	/**
	 * Nombre mas apellidos de la persona
	 */
	private String nombre;
	
	/**
	 * Direcion de residencia
	 */
	private String direccion;
	
	/**
	 * Telefono de contacto
	 */
	private String telefono;

	
	//CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		super();
	}
	
	/**
	 * Constructor con parametros
	 * 
	 * @param nif representa al numero de identificacion fiscal de la persona
	 * @param nombre representa al nombre y apellidos de la persona
	 * @param direccion representa a la direccion de la persona
	 * @param telefono representa al telefono de contacto de la persona
	 */
	
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	// GETTERS AND SETTERS
	
	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//METODOS REESCRITOS DE OBJECT

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	/**
	 * Metodo equals reescrito en el que toda Persona será la misma si el nif es el mismo
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}
	
	//METODOS RESPONSABILIDAD DE LOS ATRIBUTOS DE INSTANCIA DE LA CLASE
	
	/**
	 * El método llamar() devuelve una cadena similar a esta: “Alicia Torres llamando a Carlos Robles”. 
	 * Como parte de la cadena se utilizará la propiedad nombre del objeto al que se aplica y del objeto pasado como argumento.
	 * 
	 * @param p Persona pasada por parametro
	 * @return String que incluye a la Persona que invoca el metodo + llamando a + Persona pasada por parametro
	 */
	public String llamar (Persona p) {
		
		String llamar= nombre + " llamando a " + p.nombre;
		
		return llamar;	
		
	}
	
	//METODO ABSTRACTO QUE OBLIGA A SOBREESCRIBIR A LAS CLASES QUE HEREDEN
	
	/**
	 * El método trabajar() se especializará en cada subclase para devolver una cadena que indique el tipo de tarea que realiza cada perfil de persona
	 * 
	 */
	public abstract String trabajar();
	
}
