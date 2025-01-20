package testing;

import modelo.dao.EmpresaDaoImplList;
import modelo.javabean.Departamento;
import modelo.javabean.Empleado;
import modelo.javabean.Localidad;
import modelo.javabean.Trabajo;

/**
 * Clase en la que realizamos los siguientes test de la empresa:
 * 
 * 1. Listar la empresa
 * 2.1. Buscar empleado con idempleado 3
 * 2.2. Buscar empleados con idEmpleado 1,3,4
 * 3. Buscar empleado por departamento
 * 4. Buscar empleado por trabajo que realiza
 * 5. Buscar por sexo
 * 6. Buscar por país
 * 7. Masa salarial de la empresa
 * 8.1. Alta empleado con id existente
 * 8.2. Alta empleado con id no existente
 * 9. Eliminar un empleado
 * 10. Eliminar por posicion
 * 11. Modificar un empleado
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 * 
 */

public class TestEmpresa {
	
	private static final String SEPARACION = "-------------------------------------------------------------------------------------------------------------------------";


	public static void main(String[] args) {
		
		// Creamos la empresa con su nombre
		
		EmpresaDaoImplList empresa1 = new EmpresaDaoImplList("Empresa1");
		
		// Creamos los objetos de localidad, departemento y empleado
		
		Localidad localidad1 = new Localidad(1, "AVD Manhattan 7", "Nueva York", "EEUU");
		Departamento departamento1 = new Departamento(1, "Investigación Ganma", localidad1);
		
		Empleado emp1 = new Empleado(1, "Bruce", "Banner", 'H', "brucebanner@avenger.com", 90000, 500, new Trabajo("Director", "Científico", 
				5000, 9500), departamento1);
		
		Empleado emp2 = new Empleado(5, "Steve", "Rogers", 'H', "steverogers@avenger.com", 7000, 700, new Trabajo("Avenger", "Seguridad", 
				5000, 9500), new Departamento(5, "Estrategia", new Localidad(1, "AVD Queens 3", "Nueva York", "EEUU")));
		
		//1. Listar la empresa
		
		System.out.println(SEPARACION);
		System.out.println("1. Listar mi empresa:\n");
		
		for(Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//2.1. Buscar empleado con idempleado 3
		
		System.out.println("2.1. Mostrar empleado con idEmpleado3:\n");		
		System.out.println(empresa1.buscarUno(3));
		System.out.println(SEPARACION);
		
		//2.2. Buscar empleados con idEmpleado 1,3,4
		
		System.out.println("2.2. Mostrar empleados con idEmpleado 1,2,4,7:\n");
		int [] ids = {1,2,4,7};
		for (int ele: ids)
			System.out.println(empresa1.buscarUno(ele));
		System.out.println(SEPARACION);
		
		//3. Buscar empleado por departamento
		
		System.out.println("3. Mostrar empleado cuyo departamento es idDepartamento1:\n");
		for (Empleado ele: empresa1.buscarPorDepartamento(1))
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//4. Buscar empleado por trabajo que realiza
		
		System.out.println("4.1. Mostrar empleado que cuyo trabajo es CEO:\n");
		for (Empleado ele: empresa1.buscarPorTrabajo("CEO"))
			System.out.println(ele);
		System.out.println(SEPARACION);
		System.out.println("4.2. Mostrar empleado cuyo trabajo es Jefa:\n");
		for (Empleado ele: empresa1.buscarPorTrabajo("Jefa"))
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//5. Buscar por sexo
		
		System.out.println("5.1. Mostrar los empleados que son de genero mujer:\n");
		for (Empleado ele: empresa1.buscarPorSexo('M')) {
					System.out.println(ele);		
		}
		System.out.println(SEPARACION);
		System.out.println("5.2. Mostrar los empleados que son de genero hombre:\n");
		for (Empleado ele: empresa1.buscarPorSexo('H')) {
				System.out.println(ele);		
		}
		System.out.println(SEPARACION);
		
		//6. Buscar por país
		
		System.out.println("6. Mostrar empleado con país EEUU:\n");
		for (Empleado ele: empresa1.buscarPorPais("EEUU"))
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//7. Masa salarial de la empresa
		
		System.out.println("7. La masa salarial de la empresa es: " + empresa1.masaSalarial() + " Euros");
		System.out.println(SEPARACION);
				
		//8.1. Alta empleado con id existente 
		
		System.out.println("8.1. Añadir el siguiente empleado que tiene un idEmpleado existente:\n");
		System.out.println(emp1);
		empresa1.alta(emp1);
		System.out.println(SEPARACION);
		System.out.println("8.1. Listar mi empresa despúes pedir añadir el empleado " + emp1.nombreCompleto() +":\n");
		for(Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println("\n"+ "Devuelve: " +empresa1.alta(emp1));
		System.out.println("\n** No se ha añadido");
		System.out.println(SEPARACION);
		
		//8.1. Alta empleado con id no existente
		
		System.out.println("8.2. Añadir el siguiente empleado que tiene un idEmpleado NO existente:\n");
		System.out.println(emp2);
		empresa1.alta(emp2);
		System.out.println(SEPARACION);
		System.out.println("8.2. Listar mi empresa despúes de pedir añadir el empleado " + emp2.nombreCompleto()+ "\n");
		for(Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println("\n** Añadido correctamente con idEmpleado " + emp2.getIdEmpleado());
		System.out.println(SEPARACION);		
		
		//9. Eliminar uno
		
		System.out.println("9.1. Pedimos eliminar el siguiente empleado:\n");
		System.out.println(emp2);
		System.out.println(SEPARACION);
		empresa1.eliminarUno(emp2);
		System.out.println("9.2. Listar empresa tras borrar el empleado : " + emp2.nombreCompleto()+ "\n");
		for(Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//10. Eliminar por posicion
		
		System.out.println("10.1. Pedimos eliminar empleado en la posición 3:\n");
		System.out.println(empresa1.eliminarUno(2));
		System.out.println(SEPARACION);
		System.out.println("10.2. Listar empresa tras eliminar posición 3:\n");
		for(Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//11. Modificar un empleado
		
		System.out.println("11.1. Modificar el empleado con idEmpleado 1 por el siguiente empleado:\n");
		//creamos un nuevo empleado
		Empleado emp3 = new Empleado(1, "Natasha", "Romanova", 'M', "viudanegra@avenger.com", 65000, 2900, new Trabajo("Espia", "Seguridad", 
						3000, 7000), new Departamento(5, "Estrategia", new Localidad(1, "AVD Stalingrado", "Volgogrado", "Rusia")));
					
		System.out.println(emp3);
		System.out.println(SEPARACION);
		empresa1.modificarUno(emp3);
		System.out.println("11.2. Listar empresa tras modificar el empleado con id empleado = "+ emp3.getIdEmpleado() +"\n");
		for(Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println(SEPARACION);
			

	}

}
