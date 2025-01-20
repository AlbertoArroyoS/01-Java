package modelo.javabean;


/**
 * Entidad Alumno, que hereda de la entidad Persona. Con un atributo privado de tipo string curso.
 * 
 * @see Persona
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class Alumno extends Persona{
	
	//ATRIBUTOS PRIVADOS
	
	/**
	 * Curso al que pertenece
	 */
	private String curso;

	//CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public Alumno() {
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
	 * @param curso es el curso al que pertenece
	 */
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}
	
	// GETTERS AND SETTERS 
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// METODOS DE PERSONA REESCRITOS

	/**
	 * El método trabajar() devuelve una cadena que indica el tipo de tarea que realiza el profesor
	 * En el cual obtendremos el nombre del profesor a traves del getNombre
	 * 
	 * @return String con El alumno + nombre del alumno + va a estudiar para el curso + curso 
	 * Ejemplo: “El alumno Alicia Torres va a estudiar para el curso 1º Bachillerato”
	 */
	@Override
	public String trabajar() {
		String trabajar = "El alumno " + getNombre() + " va a estudiar para el curso: " + curso;
		return trabajar;
	}
	
	// REESCRIBIR toString obteniendo los atributos privados de Persona a traves de get + atributos propios
	
	/**
	 * Metodo toString() reescrito para obtener los atributos privados de Persona a traves de los get
	 * añadiendo el atributo propio curso
	 */
	@Override
	public String toString() {
		return "Alumno [nif=" + getNif() + ", nombre=" + getNombre() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono()
				+ ", curso=" + curso + "]";
	}
	
	// METODOS PROPIOS
	
	/**
	 * El metodo hacerExamen() devuelve una cadena que indica la actividad que va a realizar el alumno
	 * 
	 * @return String con El alumno + nombre del alumno + va a hacer su examen
	 * Ejemplo “El alumno Alicia Torres va a hacer su examen”
	 */
	public String hacerExamen() {
		String ponerNotas = "El alumno " + getNombre() + " va a hacer su examen";
		return ponerNotas;
	}
	
}
