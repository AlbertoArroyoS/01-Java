import java.util.Scanner;

public class AasActividad2Ejercicio3 {

	public static void main(String[] args) {

		int contadorNombres = 0, sumaSalarios = 0;
		double salario = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca nombre: ");
		String nombre = leer.next();
		if(!nombre.equalsIgnoreCase("FIN")) //para que en no solo se active el contador si no es Fin de primeras
			contadorNombres++;
		
		/*creo bucle para que se salga en caso de que se escriba FIN 
		 *(en cualquiera de sus configuraciones de mayúsculas y minúsculas 
		 */
		
		while (!nombre.equalsIgnoreCase("FIN")) {

			System.out.println("Introduzca su salario: ");
			salario = leer.nextDouble();
			sumaSalarios += salario;
			System.out.println("Introduzca sexo, H o M : ");
			String sexo = leer.next();
			System.out.println("-----------------------------------------");
			System.out.println("A: " + nombre);
			System.out.println("B: " + funcionSalario(salario));
			System.out.println("C: " + funcionSexo(sexo));		
			System.out.println("-----------------------------------------");
			System.out.println("Introduzca nombre: ");
			nombre = leer.next();
			if(!nombre.equalsIgnoreCase("FIN"))
				contadorNombres++;

		}
		leer.close();
		System.out.println("Número de nombres introducidos: " + contadorNombres);
		System.out.println("La suma de los salarios es: " + sumaSalarios);
		if(contadorNombres == 0)
			System.out.println("La media de los salarios es: " +contadorNombres);
		else
			System.out.println("La media de los salarios es: " + (sumaSalarios/contadorNombres));
		System.out.println("FIN DE PROGRAMA");
		
	}
	
	//Función que devuelve el literal del sexo
	
	public static String funcionSexo(String sexo) {
		String funcionSexo = "";
		switch (sexo) {
			case "H": case "h":
				funcionSexo = "Hombre";
				break;
			case "M": case "m":
				funcionSexo = "Mujer";
				break;
			default:
				funcionSexo = "Sexo Erróneo";		
		}
		return funcionSexo;			
	}
	
	//Función que devuelve el literal del salario
	
	public static String funcionSalario(double salario) {
		String funcionSalario = "";
		if(salario < 25000)
			funcionSalario = "Salario Bajo";
		if(salario >= 25000 && salario <= 45000)
			funcionSalario = "Salario Medio";
		if(salario > 45000)
			funcionSalario = "Salario Alto";
		
		return funcionSalario;
	}
}