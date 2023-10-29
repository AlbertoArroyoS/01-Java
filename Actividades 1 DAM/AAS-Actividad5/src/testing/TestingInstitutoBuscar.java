package testing;

import modelo.dao.InstitutoDaoImplList;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

/**
 * Clase en la que realizamos test de busquedas mas especificos a los del TestingInstituto
 * Aqui no añadimos ni eliminamos ninguno, cargamos de los que hay en la base de datos
 * y nos centramos en los resultados de las busquedas.
 * Realizamos los siguientes test: 
 * 
 * 1. Buscar las personas dadas de alta.
 * 2. Buscar por tipo.
 * 3. Busquedas relacionadas con el NIF. Como buscar todos los nif con su nombre
 * 4.1. Buscar una persona por nif.
 * 4.2. Buscar varias por array
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 * 
 */

public class TestingInstitutoBuscar {
	
	
	private static final String SEPARACION = "-------------------------------------------------------------------------------------------------------------------------";


	public static void main(String[] args) {
		
		InstitutoDaoImplList instituto = new InstitutoDaoImplList();


		//1. Buscar las personas dadas de alta
		
		System.out.println("1. Todas las personas: \n");
		for(Persona ele: instituto.buscarTodas())
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//2. Buscar por tipo
		
		System.out.println("2.1. Mostrar profesores: \n");		
		for (Persona ele: instituto.buscarPersonasPorTipo("Profesor")) {
			System.out.println(ele);
		}
		System.out.println(SEPARACION);
		System.out.println("\n2.2. Mostrar alumnos: \n");
		
		for (Persona ele: instituto.buscarPersonasPorTipo("alumno")) {
			System.out.println(ele);
			
		}
		System.out.println(SEPARACION);
		System.out.println("\n2.3. Mostrar administrativos: \n");
		
		for (Persona ele: instituto.buscarPersonasPorTipo("administrativo")) {
			System.out.println(ele);
		}
		System.out.println(SEPARACION);
		
		//3. Buscar NIF
		
		System.out.println("3.1. Listar todos los dni dados de alta en buscar todas\n");
		for(Persona ele: instituto.buscarTodas())
			System.out.println(ele.getNif()+" : " + ele.getNombre());
		System.out.println("\n3.2. Buscar si algun nif, de los datos de alta, es el nif 0122222A, en metodo buscar todas\n");
		for(Persona ele: instituto.buscarTodas()) {
			if(ele.getNif().equalsIgnoreCase("0122222A")== true)
				System.out.println(ele.getNif() + " = " + ele.getNif().equalsIgnoreCase("0122222A") + " <---ENCONTRADO");
			else
				System.out.println(ele.getNif() + " = " + ele.getNif().equalsIgnoreCase("0122222A"));
		}
		System.out.println(SEPARACION);
		
		//4.1. Buscar persona por nif
		
		System.out.println("4.1. Mostrar persona con nif 0122222A:\n");		
		System.out.println(instituto.buscarPersona("0122222A"));
		System.out.println("\n4.1. Mostrar persona con nif 0222222B:\n");		
		System.out.println(instituto.buscarPersona("0222222B"));
		System.out.println("\n4.1. Mostrar persona con nif 0322222C:\n");		
		System.out.println(instituto.buscarPersona("0322222C"));
		System.out.println(SEPARACION);
				
		//4.2. Buscar varias por array
				
		System.out.println("4.2. Mostrar personas con array de nif 0122222A,0222222B,0322222C:\n");
		String [] ids = {"0122222A","0222222B","0322222C"};
		for (String ele: ids)
			System.out.println(instituto.buscarPersona(ele));
		System.out.println(SEPARACION);
				
	}

}
