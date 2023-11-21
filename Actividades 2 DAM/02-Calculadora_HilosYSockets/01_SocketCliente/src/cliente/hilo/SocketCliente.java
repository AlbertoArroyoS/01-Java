package cliente.hilo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//VERSION 1 PARA QUE CADA OPERACION SOLO USE 1 SOCKET Y NO CREA OTRO HASTA QUE HAY OTRO CLIENTE
public class SocketCliente {
	
	// IP y Puerto a la que nos vamos a conectar
	public static final int PUERTO = 3333;
	public static final String IP_SERVER = "localhost";
	private static Scanner leer;
		
	static {
			leer = new Scanner(System.in);
	}

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("   APLICACION CLIENTE CALCULADORA   ");
		System.out.println("-----------------------------------");
		//En este objeto vamos a encapsular la IP y el puerto al que nos vamos a conectar
		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
		
		try (Scanner sc = new Scanner(System.in)){
						
			System.out.println("CLIENTE: Esperando a que el servidor acepte la conexion");
			Socket socketAlServidor = new Socket();
			socketAlServidor.connect(direccionServidor);
			System.out.println("CLIENTE: Conexion establecida... a " + IP_SERVER + 
					" por el puerto " + PUERTO);
			//Creamos el objeto que nos va a permitir leer la salida del servidor
		
			InputStreamReader entrada = new InputStreamReader(socketAlServidor.getInputStream());
			//Esta clase nos ayuda a leer datos del servidor linea a linea en vez de 
			//caracter a caracter como la clase InputStreamReader
			BufferedReader entradaBuffer = new BufferedReader(entrada);
			//Creamos el objeto que nos permite mandar informacion al servidor
			PrintStream salida = new PrintStream(socketAlServidor.getOutputStream());
			
			
			boolean continuar = true;
			do {

				//Cargamos el menu inicial y recuperamos la opción elegida
				int opcion = menu();
				//Si la opcion está fuera del rango de opciones se repetira el menu
				while (opcion<1 || opcion>5){
					opcion = menu();
				}
				if (opcion == 5) {
					System.out.println("Salir del programa");
					continuar=false;
				}else {
					//Introducimos los numero
					System.out.println("CLIENTE: Introduzca primer numero");
					String numero1 = sc.nextLine();//supongamos el numero 3
					System.out.println("CLIENTE: Introduzca segundo numero");
					String numero2 = sc.nextLine();//supongamos el numero 4
					
					//Cadena que le voy a pasar con el numero1-numero2-operacion elegida en el menu
					String operacion = numero1 + "-" + numero2 + "-" + String.valueOf(opcion);
					
					//Enviamos la cadena al servidor
					salida.println(operacion);
					
					System.out.println("CLIENTE: Esperando al resultado del servidor...");
					
					//Resultado que viene por parte del servidor
					String resultado = entradaBuffer.readLine();
					System.out.println(resultado);
					
					/*
					System.out.println("CLIENTE: Quiere hacer otra operacion? S/N");
					String sContinuar = sc.nextLine();
					if (sContinuar.equalsIgnoreCase("n")) {
						continuar = false;
					}*/
					socketAlServidor.close();
				}	
				
			}while(continuar);
			//Nota, no cierro ni "entrada" ni "salida" ya que se encarga el objeto
			//socket cuando salgamos del bloque try-catch
			
			//Cerramos la conexion
			//socketAlServidor.close();
		} catch (UnknownHostException e) {
			System.err.println("CLIENTE: No encuentro el servidor en la direccion" + IP_SERVER);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("CLIENTE: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("CLIENTE: Error -> " + e);
			e.printStackTrace();
		}
		leer.close();
		System.out.println("CLIENTE: Fin del programa");

	}
	
	//Menu inicial de la aplicacion
	public static int menu() {
			
		int opcion = 0;
		System.out.println("----------------------------------------------------");
		System.out.println("|                      MENU                        |");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar ");
		System.out.println("4. Dividir ");
		System.out.println("5. Salir de la aplicación");
		System.out.println("----------------------------------------------------");
		System.out.println("Introduzca una opción del 1 al 5, si quiere salir 5");
		System.out.println("----------------------------------------------------");
		
		try {
			opcion = leer.nextInt();
			
		} catch (java.util.InputMismatchException e) {
	        // Atrapar la excepción si se ingresa algo que no es un entero
	        System.out.println("Entrada no válida. Ingrese un número entero.");
	        leer.next(); // Limpiar el búfer de entrada para evitar un bucle infinito
	    }
		
		if (opcion<1 || opcion > 5) {
			System.out.println("OPCION INCORRECTA");
		}
		
		return opcion;
		
	}
	

}
