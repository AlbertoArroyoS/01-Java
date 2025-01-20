package testing;

import javabeans.Empleado;
import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {
		
		
		
		Scanner leer = new Scanner(System.in);
		
		//EMPLEADO 1
		
		Empleado empleado1 = new Empleado(111, "Alberto", "Arroyo Santofimia", "aarroyo@empleados.edix.com", 50_000, 500, 'H', 001);
		
		System.out.println("------------------------------------------------");
		System.out.println("Empleado1: ");
		System.out.println(empleado1);
		System.out.println("");
		System.out.println("Salario Bruto: " + empleado1.salarioBruto());
		System.out.println("Salario mensual: " + empleado1.salarioMensual(12));
		System.out.println("El literal de sexo es: " + empleado1.literalSexo());
		System.out.println("El email es: " + empleado1.obtenerEmail());
		System.out.println("El nombre completo es: " + empleado1.nombreCompleto());
		System.out.println("------------------------------------------------");
		
		
		//EMPLEADO 2
		
		Empleado empleado2 = new Empleado();
		
		empleado2.setIdEmpleado(222);
		empleado2.setNombre("Isabel");
		empleado2.setApellidos("Jurado Ruiz");
		empleado2.setEmail(empleado2.obtenerEmail());
		empleado2.setSalario(90_000);
		empleado2.setComplemento(3000);
		empleado2.setSexo('M');
		empleado2.setIdDepartamento(002);
		
			
		System.out.println("------------------------------------------------");
		System.out.println("Empleado2: ");
		System.out.println("Id Empleado2 : " + empleado2.getIdEmpleado());
		System.out.println("Nombre Empleado2: " + empleado2.getNombre() );
		System.out.println("Apellidos Empleado2: " + empleado2.getApellidos());
		System.out.println("Email Empleado2: " + empleado2.getEmail());
		System.out.println("Salario Empleado2: " + empleado2.getSalario());
		System.out.println("Complemento Empleado2: " + empleado2.getComplemento());
		System.out.println("Sexo: " + empleado2.getSexo());
		System.out.println("Id Departamento Empleado 2: " + empleado2.getIdDepartamento());
		
		System.out.println("");
		System.out.println("Salario Bruto: " + empleado2.salarioBruto());
		System.out.println("Salario mensual: " + empleado2.salarioMensual(12));
		System.out.println("El literal de sexo es: " + empleado2.literalSexo());
		System.out.println("El email es: " + empleado2.obtenerEmail());
		System.out.println("El nombre completo es: " + empleado2.nombreCompleto());
		System.out.println("------------------------------------------------");
		
		
		
		
		//EMPLEADO 3 por consola
		
		Empleado empleado3 = new Empleado();
	
		System.out.println("Introduzca Id del empleado 3: ");
		int idEmpleado = leer.nextInt();
		empleado3.setIdEmpleado(idEmpleado);
		leer.nextLine(); //AL PONER ESTO YA FUNCIONA
		
		System.out.println("Introduzca el nombre del empleado 3: ");
		String nombre = leer.nextLine();
		empleado3.setNombre(nombre);
		
		System.out.println("Introduzca los apellidos del empleado 3: ");
		String apellidos = leer.nextLine();
		empleado3.setApellidos(apellidos);

		System.out.println("Indroduzca el email del empleado 3: ");
		String email = leer.next();
		empleado3.setEmail(email);
		
		System.out.println("Introduzca el salario anual del empleado 3: ");
		double salario = leer.nextDouble();
		empleado3.setSalario(salario);
		
		System.out.println("Introduza el complemento del empleado 3: ");
		double complemento = leer.nextDouble();
		empleado3.setComplemento(complemento);
		
		System.out.println("Introduzca sexo del empleado 3: ");
		String sexoString = leer.next();
		char sexo = sexoString.charAt(0);
		empleado3.setSexo(sexo);
		
		System.out.println("Introduzca Id del delpartamento del empleado 3: ");
		int idDepartamento = leer.nextInt();
		empleado3.setIdDepartamento(idDepartamento);
		
		System.out.println("------------------------------------------------");
		System.out.println("Empleado3: ");
		System.out.println(empleado3);
		System.out.println("");
		System.out.println("Salario Bruto: " + empleado3.salarioBruto());
		System.out.println("Salario mensual: " + empleado3.salarioMensual(12));
		System.out.println("El literal de sexo es: " + empleado3.literalSexo());
		System.out.println("El email es: " + empleado3.obtenerEmail());
		System.out.println("El nombre completo es: " + empleado3.nombreCompleto());
		System.out.println("------------------------------------------------");
		


		
		
		leer.close();
	}

}
