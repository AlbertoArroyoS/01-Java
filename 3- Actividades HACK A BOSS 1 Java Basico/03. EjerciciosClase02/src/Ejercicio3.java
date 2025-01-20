import java.util.Scanner;
/*
Crear un programa en Java que permita ingresar un valor numérico correspondiente al código de un tipo de comprobante
y devuelva la denominación correspondiente, de acuerdo con la siguiente tabla (utilizar una estructura condicional múltiple):
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Seleccione una opción del 1 al 10:");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("FACTURAS A");
                break;
            case 2:
                System.out.println("NOTAS DE DEBITO A");
                break;
            case 3:
                System.out.println("NOTAS DE CREDITO A");
                break;
            case 4:
                System.out.println("RECIBOS A");
                break;
            case 5:
                System.out.println("NOTAS DE VENTA AL CONTADO A");
                break;
            case 6:
                System.out.println("FACTURAS B");
                break;
            case 7:
                System.out.println("NOTAS DE DEBITO B");
                break;
            case 8:
                System.out.println("NOTAS DE CREDITO B");
                break;
            case 9:
                System.out.println("RECIBOS B1");
                break;
            case 10:
                System.out.println("NOTAS DE VENTA AL CONTADO B");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }

    }

}
