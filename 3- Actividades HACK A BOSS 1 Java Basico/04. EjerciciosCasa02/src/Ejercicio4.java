import java.util.Scanner;
/*
Ejercicio Nº 4 - Matrices
Imagina que estás trabajando en un sistema de reservas de asientos para un teatro.
Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
- Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
-Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
- Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
- A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear la matriz de asientos 5x5
        char[][] asientos = new char[5][5];
        int fila = 0;
        int asiento = 0;
        Scanner leer = new Scanner(System.in);

        // Inicializar los asientos vacios
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'O';
            }
        }

        boolean continuar = true;

        // Bucle principal para gestionar reservas
        while (continuar) {
            // Mostrar el mapa actual de asientos
            System.out.println("Mapa actual de asientos:");
            mostrarMapa(asientos);


            boolean validacionNumero=false;
            // Bucle elegir numero fila/asiento con validacion por si se mete numero fuera de rango
            while(!validacionNumero){
                // Pedir al usuario que elija una fila y un asiento
                System.out.print("Ingrese el número de fila (1-5): ");
                fila = leer.nextInt();
                System.out.print("Ingrese el número del asiento (1-5): ");
                asiento = leer.nextInt();
                // Validar si la posición ingresada es válida
                if (fila < 1 || fila > 5 || asiento < 1 || asiento > 5) {
                    System.out.println("Posición inválida. Por favor, ingrese un asiento dentro del rango 1-5.");
                    //validacionNumero = false;
                }else{
                    validacionNumero = true;
                }
            }
            // Verificar si el asiento está ocupado o vacío
            boolean validacionReserva=false;
            // Bucle para verificar si el asiento esta ocupado o vacio
            while(!validacionReserva){
                //Comprobar si en la posicion del array tiene el caracter X
                if (asientos[fila - 1][asiento - 1] == 'X') {
                    System.out.println("El asiento está ocupado. Por favor, elija otro asiento.");
                    System.out.print("Ingrese el número de fila (1-5): ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese el número del asiento (1-5): ");
                    asiento = leer.nextInt();
                } else {
                    // Marcar el asiento como ocupado
                    asientos[fila - 1][asiento - 1] = 'X';
                    System.out.println("¡Reserva realizada con éxito!");
                    mostrarMapa(asientos);
                    validacionReserva=true;
                }
            }


            // Preguntar si el usuario quiere realizar otra reserva
            System.out.print("¿Desea realizar otra reserva? (S/N): ");
            //Coger el primer caracter de la entrada
            char respuesta = leer.next().toUpperCase().charAt(0);
            if (respuesta != 'S') {
                continuar = false;
            }
        }

        // Mostrar el mapa final de asientos
        System.out.println("Mapa final de asientos:");
        mostrarMapa(asientos);

        leer.close();
    }

    // Método para mostrar el mapa de asientos
    public static void mostrarMapa(char[][] asientos) {
        System.out.println("Asiento 1 2 3 4 5");
        for (int i = 0; i < asientos.length; i++) {
            System.out.print("Fila " + (i + 1) + "  ");
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
