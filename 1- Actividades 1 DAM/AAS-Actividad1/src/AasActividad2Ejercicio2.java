import java.util.Scanner;

public class AasActividad2Ejercicio2 {

	public static void main(String[] args) {
		
		// inicializo variables y creo una variable que contenga el aleatorio entre el 1 y el 40 con Math.random
		
		int contadorIntentos = 0, numero = 0;
		int numeroAleatorio = (int)(Math.random()*40+1);
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Adivine un número entre el 1 y el 40 incluidos : ");
		numero = leer.nextInt();
		
		if(numero<41 && numero >0) {
			
			//decimos si el numero introducido es mayor o menor que el aleatorio
			
			while(numeroAleatorio != numero) {
				if(numeroAleatorio > numero)
					System.out.println("El número a adivinar es mayor");
				else
					System.out.println("El número a adivinar es menor");
				
				contadorIntentos++;
				System.out.println("Siguiente intento : ");
				numero = leer.nextInt();
			}
			
			
			leer.close();
			System.out.println("ENHORABUENA, HA ACERTADO EL NÚMERO " + numeroAleatorio);
			System.out.println("Número de intentos erroneos : " + contadorIntentos);
			System.out.println("FIN DE PROGRAMA");
		}
		else {
			System.out.println("No ha introducido un número entre el 1 y el 40 incluidos");
			System.out.println("FIN DE PROGRAMA");
		}
			

	}

}
