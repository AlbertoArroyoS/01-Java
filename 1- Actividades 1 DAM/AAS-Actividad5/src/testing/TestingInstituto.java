package testing;

import modelo.dao.InstitutoDaoImplList;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

/**
 * Clase en la que realizamos los siguientes test de Instituto:
 * 
 * 1. Listar la empresa.
 * 2. Alta personas.
 * 3. Alta persona con id no existente.
 * 4. Buscar persona por nif.
 * 5. Eliminar persona.
 * 6. Buscar por tipo.
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 * 
 */

public class TestingInstituto {
	
	private static final String SEPARACION = "-------------------------------------------------------------------------------------------------------------------------";


	public static void main(String[] args) {
		
		InstitutoDaoImplList instituto = new InstitutoDaoImplList();

	
		Profesor profesor1 = new Profesor("0111111A", "Miguel Gomez", "Calle Pintor","92633545","Musica");
		Persona persona1 = new Profesor("0144444A", "Enrique Fernandez", "Calle Carlos Eraña","926116981","Fisica");
		Alumno alumno1 = new Alumno("0233333B", "Elsa Ruiz", "Calle Mata","926299223","2º Bachillerato");
		Persona persona2 = new Alumno("0244444B", "Erika Arroyo", "Calle Bachiller","926227482","1º Bachillerato");
		Administrativo administrativo1 = new Administrativo("0333333C", "Maria Perez", "Calle Paloma","926333333","Controlar asistencia y pasar informes");
		Persona persona3 = new Administrativo("0344444C", "Inmaculada Aguado", "Calle Tercia","92636513","Llamadas telefonicas, recepcion");

		//1. Listar la empresa
		
		System.out.println(SEPARACION);
		System.out.println("1. Listar mi instituto:\n");
				
		for(Persona ele: instituto.buscarTodas())
			System.out.println(ele);
			System.out.println(SEPARACION);
			
		//2 Alta personas 
			
		System.out.println("2.1. Añadir persona que tiene un nif existente:\n");
		System.out.println(profesor1);
		instituto.altaPersona(profesor1);
		System.out.println(SEPARACION);
		System.out.println("2.2. Listar instituto despúes pedir añadir el empleado " + profesor1.getNombre() +":\n");
		for(Persona ele: instituto.buscarTodas())
			System.out.println(ele);
		System.out.println("\n"+ "Devuelve: " + instituto.altaPersona(profesor1));
		System.out.println("\n** No se ha añadido");
		System.out.println(SEPARACION);
		
		//3. Alta persona con id no existente
		
		System.out.println("3.1. Añadir persona que tiene un nif no existente:\n");
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println(alumno1);
		System.out.println(administrativo1);
		instituto.altaPersona(persona1);
		instituto.altaPersona(persona2);
		instituto.altaPersona(persona3);
		instituto.altaPersona(alumno1);
		instituto.altaPersona(administrativo1);
		System.out.println(SEPARACION);
		System.out.println("3.2. Listar instituto despúes pedir añadir a las personas " + persona1.getNombre() +", "+ persona2.getNombre()+", " + persona3.getNombre()+":\n");
		for(Persona ele: instituto.buscarTodas())
			System.out.println(ele);
		System.out.println("\n** Añadidos correctamente" );
		System.out.println(SEPARACION);	
		
		//4.1. Buscar persona por nif
		
		System.out.println("4.1. Mostrar persona con nif 0122222A:\n");		
		System.out.println(instituto.buscarPersona("0122222A"));
		System.out.println("\n4.1. Mostrar persona con nif 0222222B:\n");		
		System.out.println(instituto.buscarPersona("0222222B"));
		System.out.println("\n4.1. Mostrar persona con nif 0322222C:\n");		
		System.out.println(instituto.buscarPersona("0322222C"));
		System.out.println(SEPARACION);
		
		//4.2. Buscar varias
		
		System.out.println("4.2. Mostrar personas con array de nif:\n");
		String [] ids = {"0122222A","0222222B","0322222C"};
		for (String ele: ids)
			System.out.println(instituto.buscarPersona(ele));
		System.out.println(SEPARACION);
		
		//5. Eliminar persona
		
		System.out.println("5.1. Pedimos eliminar la siguiente persona:\n");
		System.out.println(persona1);
		System.out.println(SEPARACION);
		instituto.eliminarPersona(persona1);
		System.out.println("5.2. Listar empresa tras borrar el empleado : " + persona1.getNombre()+ "\n");
		for(Persona ele: instituto.buscarTodas())
			System.out.println(ele);
		System.out.println(SEPARACION);
		
		//6. Buscar por tipo + competencias/curso/tarea + actividad a realizar de cada grupo
				
		System.out.println("6.1. Mostrar profesores: \n");		
		for (Persona ele: instituto.buscarPersonasPorTipo("Profesor")) {
			System.out.println(ele);
			System.out.println("Competencias: " + ((Profesor)ele).getCompetencias());
			System.out.println("Actividad: " + ((Profesor)ele).ponerNotas()+ "\n");
		}
		System.out.println(SEPARACION);
		System.out.println("\n6.2. Mostrar alumnos: \n");
		
		for (Persona ele: instituto.buscarPersonasPorTipo("alumno")) {
			System.out.println(ele);
			System.out.println("Curso: " + ((Alumno)ele).getCurso());
			System.out.println("Actividad: " + ((Alumno)ele).hacerExamen()+ "\n");
			
		}
		System.out.println(SEPARACION);
		System.out.println("\n6.3. Mostrar administrativos: \n");
		
		for (Persona ele: instituto.buscarPersonasPorTipo("administrativo")) {
			System.out.println(ele);
			System.out.println("Tareas: " + ((Administrativo)ele).getTareas());
			System.out.println("Actividad: " + ((Administrativo)ele).gestionarMatricula()+ "\n");
		}
		System.out.println(SEPARACION);
		
	}

}
