package testing;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

/**
 * Clase en la que realizamos los siguientes test de Persona:
 * 
 * 1. Ejecutamos el método toString() sobre cada.
 * 2. Ejecutamos el método trabajar() sobre cada uno de ellos.
 * 3. Ejecutamos el método llamar(Persona p) para que el alumno llame al profesor.
 * 4.1. Ejecutamos el método ponerNotas() del objeto Profesor.
 * 4.2. Ejecutamos el método ponerNotas() Casting persona
 * 5. Ejecutamos el método hacerExamen() del objeto Alumno.
 * 6. Ejecutamos el método gestionarMatricula() del objeto Administrativo.
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 * 
 */

public class Principal {

	private static final String SEPARACION = "-------------------------------------------------------------------------------------------------------";

	public static void main(String[] args) {
		
		//Creamos un objeto Profesor, un objeto Alumno, un objeto Administrativo y uno Persona para hacer casting
		
		Profesor profesor1 = new Profesor("05555555A", "Carlos Robles", "Calle Calatrava","926111111","Matematicas");
		Alumno alumno1 = new Alumno("06666666B", "Alicia Torres", "Calle Toledo","926222222","1º Bachillerato");
		Administrativo administrativo1 = new Administrativo("0777777C", "Rosa Torres", "Calle Paloma","926333333","Hacer matriculas y controlar asistencia");
		Persona persona1 = new Profesor("0144444A", "Pedro Fernandez", "Calle Santa Teresa","926111111","Literatura");


		//1. Ejecutamos el método toString() sobre cada uno de ellos
		
		System.out.println(SEPARACION);
		System.out.println("1. Informacion de las personas: \n");
		System.out.println(profesor1);
		System.out.println(alumno1);
		System.out.println(administrativo1);
		System.out.println(SEPARACION);
		
		//2. Ejecutamos el método trabajar() sobre cada uno de ellos
		
		System.out.println("2. Método trabajar():\n");
		System.out.println(profesor1.trabajar());
		System.out.println(alumno1.trabajar());
		System.out.println(administrativo1.trabajar());
		System.out.println(SEPARACION);
		
		//3. Ejecutamos el método llamar(Persona p) para que el alumno llame al profesor
		
		System.out.println("3. Método llamar():\n");
		System.out.println(alumno1.llamar(profesor1));
		System.out.println(administrativo1.llamar(alumno1));
		System.out.println(profesor1.llamar(administrativo1));
		System.out.println(SEPARACION);
		
		//4.1. Ejecutamos el método ponerNotas() del objeto Profesor
		
		System.out.println("4.1. Método ponerNotas(): \n");
		System.out.println(profesor1.ponerNotas());
		System.out.println(SEPARACION);
		
		//4.2. Ejecutamos el método ponerNotas() Casting persona
		
		System.out.println("4.2. Método ponerNotas(), Casting: \n");
		System.out.println(((Profesor)persona1).ponerNotas());
		System.out.println(SEPARACION);
		
		//5. Ejecutamos el método hacerExamen() del objeto Alumno
		
		System.out.println("5. Método hacerExamen(): \n");
		System.out.println(alumno1.hacerExamen());
		System.out.println(SEPARACION);
		
		//6. Ejecutamos el método gestionarMatricula() del objeto Administrativo
		System.out.println("6. Método gestionarMatricula():\n");
		System.out.println(administrativo1.gestionarMatricula());
		System.out.println(SEPARACION);
				
	}

}
