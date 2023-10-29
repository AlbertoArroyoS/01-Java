import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
	    long num1 = leer.nextLong();
	    System.out.println("Ingrese el segundo número: ");
	    long num2 = leer.nextLong();
	    System.out.print("Ingrese el tercer número: ");
	    long num3 = leer.nextLong();
		
	    
	    
	    LaboratorioPrimos hilo1 = new LaboratorioPrimos(num1);
	    LaboratorioPrimos hilo2 = new LaboratorioPrimos(num2);
	    LaboratorioPrimos hilo3 = new LaboratorioPrimos(num3);
	    
	    
	    hilo1.start();
        hilo2.start();
        hilo3.start();
        
	}
	

    
}
