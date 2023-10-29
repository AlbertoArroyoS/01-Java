package servidor.hilo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;





//Este hilo va a entrar una opcion y devolvera segun la opcion marcada
//La conexion se mantendra abierta hasta que el cliente mande la palabra
//"FIN" al servidor.

//Recibe el socket que abre el servidor con el cliente y con el que
//mantendra la conversacion

public class HiloCalculadora implements Runnable{
	
	private Thread hilo;
	private static int numCliente = 0;
	private Socket socketAlCliente;	

	
	 /**
     * Constructor para crear un nuevo hilo de manejo de cliente.
     *
     * @param socketAlCliente representa el socket del cliente.
     * @param peliculas representa la lista de peliculas.
     */
	
	public HiloCalculadora(Socket socketAlCliente) {
		numCliente++;
		hilo = new Thread(this, "Hilo_"+numCliente);
		this.socketAlCliente = socketAlCliente;
		hilo.start();
	}


	@Override
	public void run() {
		System.out.println("Estableciendo comunicacion con " + hilo.getName());
		PrintStream salida = null;
		InputStreamReader entrada = null;
		BufferedReader entradaBuffer = null;
		
		try {
			//Salida del servidor al cliente
			salida = new PrintStream(socketAlCliente.getOutputStream());
			//Entrada del servidor al cliente
			entrada = new InputStreamReader(socketAlCliente.getInputStream());
			entradaBuffer = new BufferedReader(entrada);
			
			String textoRecibido = "";
			boolean continuar = true;
			String operacionRealizada="";
			int resultadoFinal=0;
			//Procesaremos entradas hasta que el texto del cliente sea FIN
			while (continuar) {		
				//trim() es un metodo que quita los espacios en blanco del principio
				//y del final
				//String que recibimos por parte del cliente
				
				textoRecibido = entradaBuffer.readLine();
				//System.out.println(textoRecibido);
				
				//si el texto sigue a nulo es la opcion 5 de salir, que no ha recibido nada y sigue nulo
				if (textoRecibido == null) {
				   // salida.println("Conexion cerrada con servidor" + hilo.getName());
					System.out.println("Conexion cerrada con "+ hilo.getName());   
				    socketAlCliente.close();
				    continuar = false;
				}else {
					//Como la informacion viene en una sola cadena de texto la separamos
					//Viene en el siguiente formato, numero1-numero2-operacion
					String[] operadores = textoRecibido.split("-");
					//Separo la informacion del string
					int iNumero1 = Integer.parseInt(operadores[0]);//3
					int iNumero2 = Integer.parseInt(operadores[1]);//4
					int operacion = Integer.parseInt(operadores[2]);
					
				
					switch (operacion) {
				    case 1:
				    	operacionRealizada= "Sumar";
				    	resultadoFinal = iNumero1 + iNumero2;
				        break;
				    case 2:
				    	operacionRealizada= "Restar";
				    	resultadoFinal = iNumero1 - iNumero2;
				        break;
				    case 3:
				    	operacionRealizada= "Multiplicar";
				    	resultadoFinal = iNumero1 * iNumero2;
				        break;
				    case 4:
				    	operacionRealizada= "Dividir";
				    	resultadoFinal = iNumero1 / iNumero2;
				        break;
				    default:
				        System.out.println("Operación no válida");
				        break;
					}
					
					
				}
				//Mandamos el resultado al cliente
				if (textoRecibido != null){
					salida.println("El resultado de " + operacionRealizada + " es igual a " + String.valueOf(resultadoFinal));		
				}
						            				
			}
			//Cerramos el socket
			socketAlCliente.close();
					
		} catch (IOException e) {
			System.err.println("HiloCalculadora: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("HiloCalculadora: Error");
			e.printStackTrace();
		}
			
	}
}
