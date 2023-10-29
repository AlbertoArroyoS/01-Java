package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;


/**
 * Clase en la que estan los metodos que implementan el interface:
 * 
 * 1. Alta de una persona
 * 2. Buscar una persona
 * 3. Buscar todas las personas
 * 4. Buscar personas por tipo, Casting.
 * 
 * @see InstitutoDao
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class InstitutoDaoImplList implements InstitutoDao{
	
	// ATRIBUTOS PRIVADOS
	
	private ArrayList<Persona> personas;
	
	//UN CONSTRUCTOR SOLO, PARA CARGAR LOS DATOS EN EL ARRAYLIST
	
	/**
	 * Constructor unico, que carga los datos en el ArrayList
	 */
	public InstitutoDaoImplList() {
		
		personas = new ArrayList<>();
		cargarDatos();
	}
	// METODO CARGAR DATOS PARA IMPROVISAR UNA PEQUEÑA BASE DE DATOS
	
	/**
	 * Metodo cargarDatos() añade al ArrayList objetos de las clases Profesor, Alumno y Administrativo
	 * como si se tratase de una pequeña base de datos para poder realizar los test
	 */
	private void cargarDatos() {
		personas.add(new Profesor("0111111A", "Carlos Robles", "Calle Calatrava","926111111","Matematicas"));
		personas.add(new Profesor("0122222A", "Nuria Lopez", "Calle Mata","926112221","Economia"));
		personas.add(new Alumno("0211111B", "Alicia Torres", "Calle Cañas","926223332","2º Bachillerato"));
		personas.add(new Alumno("0222222B", "Alfonso Ruiz", "Calle Progreso","926224442","1º Bachillerato"));
		personas.add(new Administrativo("0311111C", "Rosa Torres", "Calle Paloma","926335553","Hacer matriculas y controlar asistencia"));
		personas.add(new Administrativo("0322222C", "Monica Martinez", "Calle Rio","926336663","Llamadas telefonicas"));
	}
	
	//METODOS NO IMPLEMENTADOS
	
	//1. Alta de una persona
	
	/**
	 * El metodo altaPersona() da de alta al objeto Persona pasado por argumento en caso que no exista uno con el mismo nif.
	 * 
	 * @param persona Persona pasada por parametro.
	 * 
	 * @return Devuelve el objeto persona. En caso de que el nif no exista. False, en caso de que el nif ya exista y no se da de alta.
	 */
	@Override
	public boolean altaPersona(Persona persona) {
		// Premisa del alta, no admitimos empleados con el mismo id
		 
		if(personas.contains(persona))
			return false;
		else
			return personas.add(persona);
	}
	
	//2. Buscar persona por nif
	
	/**
	 * El metodo buscarPersona() buscar el nif pasado por parametro dentro de los objetos existentes uno por uno.
	 * 
	 * @param nif, representa el numero nif que queremos buscar
	 * 
	 * @return el objeto persona, en caso de que lo encuentre. NULL, en caso de que no lo encuentre.
	 * 
	 */
	@Override
	public Persona buscarPersona(String nif) {
		
		// Recorremos todos los objetos y obtenemos el que tiene un nif igual con equals		
		for (Persona ele: personas) {
			if (ele.getNif().equalsIgnoreCase(nif))
				return ele;
		}
		return null;
				
	}

	//3. Buscar todas las personas
	
	/**
	 * El metodo buscarTodas() devuelve una lista con todas las personas.
	 * 
	 * @return lista de personas
	 */
	@Override
	public List<Persona> buscarTodas() {
		
		return personas;
	}

	@Override
	public boolean eliminarPersona(Persona persona) {
		
		return personas.remove(persona);
	}
	
	//4. Buscar personas por tipo, Casting a cada tipo y que se añada a la List
	
	/**
	 * El metodo buscarPersonasPorTipo() busca las personas que son profesores, alumnos o administrativos.
	 * 
	 * @param tipoPersona, que es un String que dice el tipo de persona que es
	 * 
	 * @return Lista de profesores si se ha buscado profesor. Lista de administrativos si se ha buscado administrativo. Lista de alumnos si se ha buscado alumno
	 */
	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		
		List<Persona> aux = new ArrayList<>();
			for(Persona ele: personas) {
				if ((ele instanceof Profesor) && tipoPersona.equalsIgnoreCase("profesor")){
					aux.add(ele);
				}
				if ((ele instanceof Alumno)&& tipoPersona.equalsIgnoreCase("alumno")) {
					aux.add(ele);
				}
				if ((ele instanceof Administrativo)&& tipoPersona.equalsIgnoreCase("administrativo")){
					aux.add(ele);
				}
					
			}		
		return aux;
		
	}		

}
