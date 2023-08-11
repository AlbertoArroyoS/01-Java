package modelo.javabean;

/**
 * Entidad Profesor que hereda de la entidad Persona. Con un atributo privado de tipo string competencias.
 * 
 * @see Persona
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class Profesor extends Persona {
	
	//ATRIBUTOS PRIVADOS
	
	/**
	 * competencias incluye las clases que va a impartir el profesor
	 */
	private String competencias;
	
	//CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public Profesor() {
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
	 * @param competencias son las clases que va a dar el profesor
	 */
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	
	// GETTERS AND SETTERS 
	
	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
		
	
	// METODOS DE PERSONA REESCRITOS
	
	/**
	 * El método trabajar() devuelve una cadena que indica el tipo de tarea que realiza el profesor
	 * En el cual obtendremos el nombre del profesor a traves del getNombre
	 * 
	 * @return String con El profesor + nombre del profesor + va a impartir su clase
	 * Ejemplo: “El profesor Carlos Robles va a impartir su clase”
	 */
	@Override
	public String trabajar() {
		
		String trabajar = "El profesor " + getNombre() + " va a impartir su clase";
		return trabajar;
	}
	
	// REESCRIBIR toString obteniendo los atributos privados de Persona a traves de get + atributos propios
	
	/**
	 * Metodo toString() reescrito para obtener los atributos privados de Persona a traves de los get
	 * añadiendo el atributo propio competencias
	 */
	@Override
	public String toString() {
		return "Profesor [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono()
				+ ", competencias=" + competencias + "]";
	}
	
	// METODOS PROPIOS
	
	/**
	 * El metodo ponerNotas() devuelve una cadena que indica la actividad que va a realizar el profesor
	 * 
	 * @return String con El profesor + nombre del profesor + va a corregir los examenes
	 * Ejemplo “El profesor Carlos Robles va a corregir los exámenes”.
	 */
	public String ponerNotas() {
		String ponerNotas = "El profesor " + getNombre() + " va a corregir los examenes";
		return ponerNotas;
	}

}
