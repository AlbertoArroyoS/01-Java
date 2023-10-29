package cliente.hilo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

//VERSION 2 PARA QUE CADA OPERACION CIERRE EL SOCKET Y USE UNO NUEVO

public class SocketCliente2 {
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
        InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);

        try (Scanner sc = new Scanner(System.in)) {

            boolean continuar = true;
            do {
                System.out.println("CLIENTE: Esperando a que el servidor acepte la conexion");

                try (Socket socketAlServidor = new Socket()) {
                    socketAlServidor.connect(direccionServidor);
                    System.out.println("CLIENTE: Conexion establecida... a " + IP_SERVER +
                            " por el puerto " + PUERTO);

                    InputStreamReader entrada = new InputStreamReader(socketAlServidor.getInputStream());
                    BufferedReader entradaBuffer = new BufferedReader(entrada);
                    PrintStream salida = new PrintStream(socketAlServidor.getOutputStream());

                    int opcion = menu();
                    while (opcion < 1 || opcion > 5) {
                        opcion = menu();
                    }
                    if (opcion == 5) {
                        System.out.println("Salir del programa");
                        continuar = false;
                    } else {
                        System.out.println("CLIENTE: Introduzca primer número");
                        String numero1 = sc.nextLine();
                        System.out.println("CLIENTE: Introduzca segundo número");
                        String numero2 = sc.nextLine();
                        String operacion = numero1 + "-" + numero2 + "-" + String.valueOf(opcion);
                        salida.println(operacion);
                        System.out.println("CLIENTE: Esperando al resultado del servidor...");
                        String resultado = entradaBuffer.readLine();
                        System.out.println(resultado);
                    }
                } catch (IOException e) {
                    System.err.println("CLIENTE: Error de entrada/salida");
                    e.printStackTrace();
                }

            } while (continuar);
        } catch (Exception e) {
            System.err.println("CLIENTE: Error -> " + e);
            e.printStackTrace();
        }
        leer.close();
        System.out.println("CLIENTE: Fin del programa");
    }

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
            System.out.println("Entrada no válida. Ingrese un número entero.");
            leer.next();
        }

        if (opcion < 1 || opcion > 5) {
            System.out.println("OPCIÓN INCORRECTA");
        }

        return opcion;
    }
}

