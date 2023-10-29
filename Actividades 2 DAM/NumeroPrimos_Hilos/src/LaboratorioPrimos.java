
public class LaboratorioPrimos extends Thread{
	
	private long numero;
	
	public LaboratorioPrimos (long numero) {
		
		this.numero = numero;
	}
	
	@Override
	public void run() {
		
        long tiempoInicio = System.currentTimeMillis();
        boolean primo = esPrimo(numero);
        long tiempoFinal = System.currentTimeMillis();
        String nombreHilo = Thread.currentThread().getName();
        
        System.out.println("-----------------------------------");
        System.out.println("Número procesado: " + numero);
        System.out.println("Hilo que lo ha procesado: " + nombreHilo);
        System.out.println("Tiempo de procesamiento: " + (tiempoFinal - tiempoInicio) + " ms");
        System.out.println("Es primo: " + primo);
        System.out.println("-----------------------------------");
    }
	
	
	public static boolean esPrimo(long numero) {
		  // El 0, 1 y 4 no son primos
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int i = 2; i < numero / 2; i++) {
		   // Si es divisible por cualquiera de estos números, no
		   // es primo
		    if (numero % i == 0)
		      return false;
		  }
		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
	}

}
