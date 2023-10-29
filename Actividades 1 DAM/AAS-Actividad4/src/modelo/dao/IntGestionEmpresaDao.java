package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Empleado;

/**
 * Interface de la gestion de la empresa
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public interface IntGestionEmpresaDao {

	/*
	 * Metodos que implementan el interface
	 */
	
	boolean alta(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	Empleado eliminarUno(int posRelativa);
	
	// en bbdd seria Empleado eliminarUno(int idEmpleado)
	
	/*
	 * Para modificar, le pasamos un empleado, te cambia un empleado por otro
	 * y te dice el empleado que tenias antes
	 */
	boolean modificarUno(Empleado empleado); 
	ArrayList<Empleado> buscarPorSexo(char genero);
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepartamento);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);
	
	
}
