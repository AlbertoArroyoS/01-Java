package testing;

import modelo.javabean.Departamento;
import modelo.javabean.Empleado;
import modelo.javabean.Localidad;
import modelo.javabean.Trabajo;

/**
 * Clase en la que realizamos los siguientes test del empleado:
 * 
 * 1. Obtenemos los datos del empleado:
 * Nombre, apellidos, genero, nombre del departamento, nombre del trabajo, direccion, ciudad y pais
 * 
 * 2. Obtenemos los datos del trabajo del empleado:
 * Id del trabajo, descripcion, salario minimo y salario maximo.
 * 
 * 3. Obtenemos datos del departamento del trabajo del empleado:
 * Id del departamento, descripcion, localidad, direccion, ciudad y pais.
 * 
 * 4. Obtenemos otros datos del empleado
 * Salario bruto, salario mensual, literal del genero, email corporativo y nombre completo.
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 * 
 */

public class TestingEmpleado {

	private static final String SEPARACION = "------------------------------------------------------";

	public static void main(String[] args) {
		
		Localidad localidad1 = new Localidad(6, "AVD Daily Planet 29", "Metropolis", "EEUU");
		Departamento departamento1 = new Departamento(23, "Sucesos", localidad1);
		Trabajo trabajo1 = new Trabajo("Reportajes", "Periodista", 25000, 35000);
		Empleado empleado1 = new Empleado(6, "Clark","Kent", 'H', "clarkkent@dc.com" , 29000, 3000, trabajo1, departamento1);
		
		/*
		 * Obtenemos los datos del empleado a través del objeto empleado
		 * Obtenemos los datos del departamento a traves del objeto empleado que a su vez apunta a departamento
		 * Obtenemos los datos del trabajo a traves del objeto empleado que a su vez apunta a trabajo
		 * Obtenemos los datos de la dirección, ciudad y pais a través del empleado que apuntan a localidad
		 * 
		 */
		
		System.out.println(SEPARACION);
		System.out.println(empleado1);
		System.out.println(SEPARACION);
		System.out.println("DATOS DEL EMPLEADO");
		System.out.println(SEPARACION);
		System.out.println("Nombre: " + empleado1.getNombre());
		System.out.println("Apellidos: " + empleado1.getApellidos());
		System.out.println("Género: " + empleado1.getGenero());
		System.out.println("Nombre del departamento: " + empleado1.getDepartamento().getDescripcion());
		System.out.println("Nombre de su trabajo: " + empleado1.getTrabajo().getDescripcion());
		System.out.println("Dirección: " + empleado1.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad: " + empleado1.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País: "+empleado1.getDepartamento().getLocalidad().getPais());
		
		
		/*
		 * Extraemos del empleado su trabajo, su departamento y su localidad
		 */
		
		System.out.println(SEPARACION);
		System.out.println("Datos del trabajo del empleado");
		System.out.println(SEPARACION);
		System.out.println(empleado1.getTrabajo());
		System.out.println(SEPARACION);
		System.out.println("Id Trabajo: " + empleado1.getTrabajo().getIdTrabajo());
		System.out.println("Descripción: " + empleado1.getTrabajo().getDescripcion());
		System.out.println("Salario mínimo: " + empleado1.getTrabajo().getMinSalario());
		System.out.println("Salario máximo: " + empleado1.getTrabajo().getMaxSalario());
		System.out.println(SEPARACION);
		System.out.println("Datos del departamento del empleado");
		System.out.println(SEPARACION);
		System.out.println(empleado1.getDepartamento());
		System.out.println(SEPARACION);
		System.out.println("Id Departemento: " + empleado1.getDepartamento().getIdDepar());
		System.out.println("Descripción: " + empleado1.getDepartamento().getDescripcion());
		System.out.println("Localidad: " + empleado1.getDepartamento().getLocalidad().getIdLocalidad());
		System.out.println("Dirección: " + empleado1.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad: " + empleado1.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País: " + empleado1.getDepartamento().getLocalidad().getPais());
		
		/*
		 * Mostramos informacion de que obtenemos de los métodos responsabilidad de la clase Empleado
		 */
		
		System.out.println(SEPARACION);
		System.out.println("Otros datos del empleado");
		System.out.println(SEPARACION);
		System.out.println("Salario Bruto : " + empleado1.salarioBruto());
		System.out.println("Salario mensual : " + empleado1.salarioMensual(12));
		System.out.println("El literal de sexo es : " + empleado1.literalSexo());
		System.out.println("El email corporativo es : " + empleado1.obtenerEmail());
		System.out.println("El nombre completo es : " + empleado1.nombreCompleto());
		System.out.println(SEPARACION);
		
	}

}
