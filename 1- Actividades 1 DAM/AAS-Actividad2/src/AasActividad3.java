import java.util.Scanner;

public class AasActividad3 {
	
	private static Scanner leer;
	
	static {
		leer = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		int opcion = 0;
		
		opcion = menu();
		//creo bucle para que se repita si la opcion es del 1 al 3, se salga y diga adios si es 4, y si es distinta no haga nada
		
		while (opcion>0 && opcion<4) {
			
			switch(opcion) {
				case 1: //numero de decimal a binario
					System.out.println("Introduzca un número para convertir a binario : ");
					int numero1 = leer.nextInt();
					String resultado = opcion1(numero1);
					System.out.println("El número " +numero1 + " en binario es : " + resultado  );
					opcion = menu();
					break;
				case 2: //calculadora
					double num1 = 0, num2 = 0;
					String operador = "";
					System.out.println("Introduzca el primer número : ");
					num1 = leer.nextDouble();
					System.out.println("Introduzca el segundo número : ");
					num2 = leer.nextDouble();
					System.out.println("Introduzca operador (+, -, *, /, %): ");
					operador = leer.next();
					char operadorChar = operador.charAt(0);
					opcion2 (num1, num2, operadorChar);
					opcion = menu();
					break;
				case 3://palabra, muestra consonantes/vocales, longitud
					System.out.println("Introduzca una palabra : ");
					String palabra = leer.next();
					opcion3(palabra);
					opcion = menu();
					break;
			}
			
		}
		if(opcion == 4) 
			System.out.println("Adiós");
		
		leer.close();
		
						

	}
	//funcion que muestra el menu y devuelve el entero de la opcion mostrada para poderlo usar en el switch del main
	
	public static int menu() {
		
		int opcion = 0;
		System.out.println("----------------------------------------------------");
		System.out.println("|                      MENU                        |");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Conversor decimal-binario");
		System.out.println("2.- Calculadora");
		System.out.println("3.- Analizador de frase");
		System.out.println("4.- Salir");
		System.out.println("----------------------------------------------------");
		System.out.println("Introduzca una opción del 1 al 3, si quiere salir 4");
		System.out.println("----------------------------------------------------");
		opcion = leer.nextInt();
		
		if (opcion<1 || opcion > 4) {
			System.out.println("OPCION INCORRECTA");
		}
		
		return opcion;
	}
	
	/*
	 * funcion pasar de decimal a binario, solo hay que acumular el % del numero introducido e ir dividiendolo entre 2 el numero en bucle,
	 * darle la vuelta a la cadena
	 */
	public static String opcion1(int numero) { 
		
		String binario = "", acumuladorCadena = "", pasarCadena = "";
		
		while(numero != 0 && numero !=1) {
			
			int restoDivision = numero % 2; //El resto de la division siempre sera 0 o 1
			pasarCadena = String.valueOf(restoDivision); //paso el resto a tipo cadena
			
			acumuladorCadena += pasarCadena ; //voy acumulando cada caracter del resto
			numero /= 2; //divido el numero entro 2 dentro del bucle para obtener el siguiente caracter
			
			}
		//tengo el cuenta que el ultimo resultado de la division y que se añada a la cadena	
	
		if (numero == 1) { //cuando el numero ya se ha dividido al maximo posible, el ultimo resultado de la division siempre sera 1 o que introduzcas 1 de primeras
			acumuladorCadena += numero; //añado al acumulador el ultimo resultado de la division posible
		}
		if (numero == 0) { //en caso de que introduzcas el número 0
			acumuladorCadena += numero; //añado al acumulador el ultimo resultado de la division posible
		}
	
		/*Doy la vuelta a la cadena como hemos visto en clase
		 * veo longitud cadena, la recorre a la inverca y se la asigno a la cariable binario
		 */
		
		for (int i = acumuladorCadena.length()-1; i>=0; i-- ) {
		
		binario += acumuladorCadena.charAt(i);
		
		}
		return binario;
	}
		
	//funcion calculadora de decimales y muestra el resultado con solo 2 decimales
	
	public static void opcion2(double num1,double num2, char op){
		double opcion2 = 0;
		/*
		 * Paso los datos que entran y el resultado de cada operacion
		 * a formato String x,xx de forma que muestre los 2 primeros decimales solo
		 */
		String numero1 = String.format("%.2f", num1);
		String numero2 = String.format("%.2f", num2);
		String opcion2Decimales = String.format("%.2f", opcion2);
	
				
		switch(op) {
			case '+' :
				opcion2 = num1 + num2;
				opcion2Decimales = String.format("%.2f", opcion2);
				System.out.println(numero1 + " " + op + " " + numero2 + " = " +opcion2Decimales);
				break;
			case '-' :
				opcion2 = num1 - num2;
				opcion2Decimales = String.format("%.2f", opcion2);
				System.out.println(numero1 + " " + op + " " + numero2 + " = " +opcion2Decimales);
				break;
			case '*' :
				opcion2 = num1 * num2;
				opcion2Decimales = String.format("%.2f", opcion2);
				System.out.println(numero1 + " " + op + " " + numero2 + " = " +opcion2Decimales);
				break;
			case '/' :
				opcion2 = num1 / num2;
				opcion2Decimales = String.format("%.2f", opcion2);
				System.out.println(numero1 + " " + op + " " + numero2 + " = " +opcion2Decimales);
				break;
			case '%' :
				opcion2 = num1 % num2;
				opcion2Decimales = String.format("%.2f", opcion2);
				System.out.println(numero1 + " " + op + " " + numero2 + " = " +opcion2Decimales);
				break;
			default:
				System.out.println("OPCIÓN INCORRECTA");
			
			
			}
			
	}
	
	//funcion que resuelve la opcion 3 de volacales,consonantes y longitud de una palabra  y la muestra por pantalla
	
	public static void opcion3(String palabra) {
		
		String acumuladorVocales = "";
		String acumuladorConsonantes = "";
		palabra = palabra.toLowerCase();
		
		//creo un bucle for para que recorra la longitud de la cadena
		
		for (int i=0; i< palabra.length(); i++) {
			
			char caracter = palabra.charAt(i);
			/*
			 * uso un switch porque ya lleva un comparador de contenido de caracteres incorporado, 
			 * no hace falta usar un .equals como con un if
			 * cuando detecte alguno de los case los acumula en el contador de vocales o consonantes segun corresponda
			 * 
			 */

			switch (caracter) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					acumuladorVocales += caracter;
					break;
				
				case 'á': case 'é': case 'í': case 'ó': case 'ú':
					acumuladorVocales += caracter;
					break;
		
				default:
					acumuladorConsonantes += caracter;
			}
			
		}
		/*
		 * Gracias por enseñarme en clase lo que queria hacer para mostrar los resultados por columnas alineados
		 */
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%-20s %-15s %-15s %-15s\n" , "PALABRA" , "CONSONANTES" , "VOCALES" , "LONGITUD");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%-20s %-15s %-15s %-15s\n" , palabra , acumuladorConsonantes , acumuladorVocales , palabra.length());
		System.out.println("--------------------------------------------------------------");
		
	}
}
