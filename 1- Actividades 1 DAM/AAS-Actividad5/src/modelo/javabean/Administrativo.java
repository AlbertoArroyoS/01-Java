package modelo.javabean;
/**
 * Entidad Administrativo, que hereda de la entidad Persona. Con un atributo privado de tipo string tareas.
 * 
 * @see Persona
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class Administrativo extends Persona{
	
	//ATRIBUTOS PRIVADOS
	
	/**
	 * Tareas que desarrolla
	 */
	private String tareas;
	
	//CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public Administrativo() {
		super();
	}
	
	//CONSTRUCTOR QUE LE LLEVAN LOS DATOS DE LA CLASE PADRE Y LOS PROPIOS
	
	/**
	 * Constructor con parametros
	 * 
	 * @param nif heredado de Persona, representa al numero de identificacion fiscal de la persona
	 * @param nombre heredado de Persona, representa al nombre y apellidos de la persona
	 * @param direccion heredado de Persona, representa a la direccion de la persona
	 * @param telefono heredado de Persona, representa al telefono de contacto de la persona
	 * @param tareas son las actividades que desarrollan
	 */
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}
	
	// GETTERS AND SETTERS 

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	// METODOS DE PERSONA REESCRITOS

	@Override
	public String trabajar() {
		String trabajar = "El administrativo " + getNombre() + " va a realizar estas tareas: " + tareas;
		return trabajar;
	}
	
	// REESCRIBIR toString obteniendo los atributos privados de Persona a traves de get + atributos propios
	
	/**
	 * Metodo toString() reescrito para obtener los atributos privados de Persona a traves de los get
	 * añadiendo el atributo propio tareas
	 */
	@Override
	public String toString() {
		return "Administrativo [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + ", telefono="
				+ getTelefono() + ", tareas=" + tareas + "]";
	}
	
	// METODOS PROPIOS
	
	/**
	 * El metodo gestionarMatricula() devuelve una cadena que indica la actividad que va a realizar el administrativo
	 * 
	 * @return String con El administrativo + nombre del administrativo + va a gestionar una matrícula
	 * Ejemplo “El administrativo Rosa Torres va a gestionar una matrícula”.
	 */
	public String gestionarMatricula() {
		String ponerNotas = "El administrativo " + getNombre() + " va a gestionar una matrícula";
		return ponerNotas;
	}	

}
