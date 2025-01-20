package modelo.dao;

import java.util.List;

import modelo.javabean.Persona;

/**
 * Interface del instituto
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public interface InstitutoDao {
	
	//Metodos que implementan el interface
	
	boolean altaPersona(Persona persona);
	Persona buscarPersona(String nif);
	List<Persona> buscarTodas();
	boolean eliminarPersona(Persona persona);
	List<Persona> buscarPersonasPorTipo(String tipoPersona);	

}
