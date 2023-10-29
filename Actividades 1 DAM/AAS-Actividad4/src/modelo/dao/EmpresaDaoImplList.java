package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Departamento;
import modelo.javabean.Empleado;
import modelo.javabean.Localidad;
import modelo.javabean.Trabajo;

/**
 * Clase en la que estan los metodos que implementan el interface:
 * 
 * Alta de un empleado
 * Eliminar un empleado
 * Eliminar un empleado por su posicion
 * Modificar un empleado a través de su posición
 * Buscar empleados según sea su genero
 * Buscar un empleado por su idEmpleado
 * Buscar todos los empleados
 * Obtener masa salarial de la plantilla
 * Buscar empleados por departamento
 * Buscar empleados por trabajo
 * Buscar empleados por pais
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 *
 */

public class EmpresaDaoImplList implements IntGestionEmpresaDao{
	
	// Definimos los datos privados
	
	private String nombreEmpresa;
	private ArrayList<Empleado> plantilla;
		
	// Un constructor sólo, para constituir una empresa nueva
	 
	public EmpresaDaoImplList(String nombre) {
		this.nombreEmpresa = nombre;
		plantilla = new ArrayList<>();
		cargarDatos();
	}
	
	
	 // Metodo cargar datos
	 	
	private void cargarDatos() {
		plantilla.add(new Empleado(1, "Tony", "Stark", 'H', "tonystark@avenger.com", 92000, 8500, new Trabajo("CEO", "Ingeniería Mecatrónica", 
				5000, 9500), new Departamento(1, "Desarrollo tecnológico", new Localidad(1, "AVD Manhattan", "Nueva York", "EEUU"))));
		plantilla.add(new Empleado(2, "Bruce", "Wayne", 'H', "brucewayne@wayneenterprises.com", 75000, 5800, new Trabajo("CEO", "Director Wayne Enterprises", 
				6000, 9999), new Departamento(2, "Gerente", new Localidad(2, "AVD Gotham 1", "Gotham", "EEUU"))));
		plantilla.add(new Empleado(3, "Peter", "Parker", 'H', "peterparker@dailybugle.com", 15000, 1300, new Trabajo("Externo", "Fotografo", 
				900, 1500), new Departamento(3, "Reportajes", new Localidad(3, "AVD Queens", "Nueva York", "EEUU"))));
		plantilla.add(new Empleado(4, "Carol", "Danvers", 'M', "caroldanvers@avengers.com", 45000, 2600, new Trabajo("Jefa", "Seguridad militar", 
				3000, 4500), new Departamento(1, "Seguridad", new Localidad(4, "AVD Cabo Cañaveral 4", "Florida", "EEUU"))));

	}

	
	 // Getters and setter, SOLO del nombre
	  
	public String getNombre() {
		return nombreEmpresa;
	}



	public void setNombre(String nombre) {
		this.nombreEmpresa = nombre;
	}
	
	 //Metodos no implementados
	
	// Alta de un empleado
	 
	@Override
	public boolean alta(Empleado empleado) {
		 // Premisa del alta, no admitimos empleados con el mismo id
		 
		if(plantilla.contains(empleado))
			return false;
		else
			return plantilla.add(empleado);
	}

	// Eliminar un empleado

	@Override
	public boolean eliminarUno(Empleado empleado) {

			return plantilla.remove(empleado);
	}

		
	// Eliminar un empleado por su posicion

	@Override
	public Empleado eliminarUno(int posRelativa) {
		
		if(posRelativa >= plantilla.size())
			return null;
		else
			return plantilla.remove(posRelativa);
	}

	// Modificar un empleado a través de su posición
	
	@Override
	public boolean modificarUno(Empleado empleado) {
		//indexOf si no lo encuentra devuelve -1
		int posicion = plantilla.indexOf(empleado);
		if(posicion == -1)
			return false;
		else
			plantilla.set(posicion, empleado);
			return true;
	}

	// Buscar empleados según sea su genero

	@Override
	public ArrayList<Empleado> buscarPorSexo(char genero) {
		ArrayList<Empleado> aux = new ArrayList<>();
		for(Empleado ele: plantilla) {
			if (ele.getGenero()== genero)
				aux.add(ele);
		}
		return aux;

	}

	// Buscar un empleado por su idEmpleado

	@Override
	public Empleado buscarUno(int idEmpleado) {

		//creamos un objeto que solo tiene el id de lo que me estan pasando, cogemos posicion indexOf
		
		Empleado emp = new Empleado();
		emp.setIdEmpleado(idEmpleado);
		int posicion = plantilla.indexOf(emp);
		if(posicion ==-1)
			return null;
		else
			return plantilla.get(posicion);				
		
	}

	// Buscar todos los empleados, devuelve la plantilla completa

	@Override
	public ArrayList<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return plantilla;
	}

	// Obtener masa salarial de la plantilla, devuelve el salario+ comisiones

	@Override
	public double masaSalarial() {
		double masaSalarial=0;
		/*
		 * Obtenemos el salario+comisiones a traves del empleado y recorremos la plantilla sumando el salario
		 * del todos los empleados de la plantilla
		 * 
		 */
		for(Empleado ele: plantilla) {
			double salario = ele.getSalario();
			double comisiones = ele.getComision();
		//Obtenemos el salario de los trabajadores y se van sumando	
		//	System.out.println(salario); Asi veriamos los salarios uno a uno antes de mostrar el total
			masaSalarial += salario + comisiones;
		}
		return masaSalarial;
				
	}

	// Buscar empleados por departamento, devuelve el arraylist del departamento solicitado

	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
		/* Creamos un arraylist auxiliar y le añadimos los empleados que tengan el mismo idDepartamento que el int que entra
		*/ 
		ArrayList<Empleado> aux = new ArrayList<>();
		for(Empleado ele: plantilla) {
			if (ele.getDepartamento().getIdDepar() == idDepartamento)
				aux.add(ele);
		}
		return aux;
	}

	// Buscar empleados por trabajo, devuelve el arraylist del trabajo solicitado

	@Override
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		/* Creamos un arraylist auxiliar y le añadimos los empleados, que comparando con el equals,
		 * tengan el mismo idTrabajo que el String que entra
		*/ 
		
		ArrayList<Empleado> aux = new ArrayList<>();
		for(Empleado ele: plantilla) {
			if (ele.getTrabajo().getIdTrabajo().equalsIgnoreCase(idTrabajo))
				aux.add(ele);
		}
		return aux;
	}	

	//  Buscar empleados por pais, devuelve el arraylist del pais solicitado
	
	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		/* Creamos un arraylist auxiliar y le añadimos los empleados, que comparando con el equals,
		 * tengan el mismo pais que el String que entra
		*/ 
		ArrayList<Empleado> aux = new ArrayList<>();
		for(Empleado ele: plantilla) {
			if (ele.getDepartamento().getLocalidad().getPais().equalsIgnoreCase(pais))
				aux.add(ele);
		}
		return aux;
	}
		
	
}
