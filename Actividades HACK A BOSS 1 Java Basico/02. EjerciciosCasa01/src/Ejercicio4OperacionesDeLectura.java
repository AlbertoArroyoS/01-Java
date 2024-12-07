import java.util.Scanner;

public class Ejercicio4OperacionesDeLectura {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int numero1 = leer.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero2 = leer.nextInt();
        System.out.println("\n*********************************************");
        System.out.println("Resultado de las operaciones");
        System.out.println("*********************************************");
        sumar(numero1, numero2);
        restar(numero1, numero2);
        multiplicar(numero1, numero2);
        dividir1(numero1, numero2);
        dividir2(numero1, numero2);
        dividir3(numero1, numero2);


    }
    private static void sumar(int numero1, int numero2) {
        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    private static void restar(int numero1, int numero2) {
        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    private static void multiplicar (int numero1, int numero2) {
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }

    /**
     * Metodo para realizar la division.
     * En caso de que el el divisor (numero2) sea 0 dira que la operacion no se puede ejecutar
     *
     * @param numero1 el dividendo, un número entero proporcionado por el usuario.
     * @param numero2 el divisor, un número entero proporcionado por el usuario.
     */
    private static void dividir1(int numero1, int numero2) {
        //Si el numero 2 es cero lo muestra por pantalla y para lo demas realiza la operacion
        if (numero2==0){
            System.out.println("*La division 1 no se puede dividir entre 0");
        }
        else{
            double resultado = (double)numero1 / numero2;
            String resultado2Decimales = String.format("%.2f", resultado);//paso a cadena con 2 decimales
            System.out.println("El resultado de la división1 es: " + resultado2Decimales);
        }

    }

    /**
     * Metodo para realizar la division, parsea el resultado de la division a double.
     * En caso de que el divisor (numero2) sea 0, el resultado de la operacion sera infinito
     *
     * @param numero1 el dividendo, un número entero proporcionado por el usuario.
     * @param numero2 el divisor, un número entero proporcionado por el usuario.
     */
    private static void dividir2(int numero1, int numero2) {
        //Con float y double la division entre 0 da infinito, no para el programa
        double resultado = (double) numero1 / numero2;
        String resultado2Decimales = String.format("%.2f", resultado);
        System.out.println("El resultado de la división2 es: " + resultado2Decimales);
    }
    /**
     * Realiza la operación de división entre dos números enteros, convirtiendo el resultado a tipo double.
     * Si el divisor (numero2) es igual a 0, se maneja una excepción para evitar un error en tiempo de ejecución.
     *
     * @param numero1 el dividendo, un número entero proporcionado por el usuario.
     * @param numero2 el divisor, un número entero proporcionado por el usuario.
     */
    private static void dividir3(int numero1, int numero2) {
        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división3 es: " + resultado);
        } catch (Exception e) {
            System.out.println("*Excepcion: No se puede dividir entre 0");
        }
    }
}
