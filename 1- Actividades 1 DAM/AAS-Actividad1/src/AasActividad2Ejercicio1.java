import java.util.Scanner;

public class AasActividad2Ejercicio1 {

	public static void main(String[] args) {
	
		// pedimos por teclado los 3 lados
		
		int lado1 = 0, lado2 = 0, lado3 = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca lado 1: ");
		lado1 = leer.nextInt();
		System.out.println("Introduzca lado 2: ");
		lado2 = leer.nextInt();
		System.out.println("Introduzca lado 3: ");
		lado3 = leer.nextInt();
		leer.close();
		
		/* Comprabamos si es valido o no, y en caso de serlo de cual es con if comprobando lados
		 * Equilátero: los tres lados iguales.
		 * Isósceles: dos iguales y uno desigual
		 * Escaleno: los tres lados distintos	
		 * 
		 */
		
		if((lado1+lado2 > lado3) && (lado1+lado3 > lado2) && (lado2+lado3 > lado1)) {
			System.out.println("El triángulo es válido");
			if(lado1 == lado2 && lado2 == lado3)
				System.out.println("El triángulo es equilatero");
			if(lado1 != lado2 && lado2 != lado3)
				System.out.println("El triángulo es escaleno");
			if((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1))
				System.out.println("El triángulo es isósceles");		
			
		}
		else
			System.out.println("El triángulo no es correcto");
		
		System.out.println("FIN DE PROGRAMA");
		
		
	}

}