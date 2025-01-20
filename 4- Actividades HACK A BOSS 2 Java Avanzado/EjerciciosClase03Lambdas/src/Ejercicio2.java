import java.util.List;
import java.util.function.Predicate;

/*
Ejercicio Nº 2: Funciones Lamda
Crear una lista de Integer con de 10 números, el nombre de la lista debe ser numeros. Una vez cargado el listado, debe obtener la cantidad de elementos que son mayores a 10.

Realizar lo anterior de la forma habitual (con programación imperativa por medio de un bucle,  condicional y contador) y luego con programación funcional utilizando una función lamda.
Para hacerlo con programación funcional, utilize:
numeros.stream.filter.(aquí va la función lamba).count().
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(19, 2, 13, 4, 5, 6, 7, 11, 9, 10);
        int contador = 0;

        for (Integer numero : numeros) {
            if (numero > 10) {
                contador++;
            }
        }
        System.out.println("Cantidad de elementos mayores a 10: " + contador);

        // **Programación funcional**

        //numeros.stream().filter(numero -> numero > 10).count();
        //System.out.println(numeros.stream().filter(numero -> numero > 10).count());

        // forma 1
        long contadorStream = numeros.stream()
                               .filter(numero -> numero > 10)
                               .count();

        System.out.println("Cantidad de elementos mayores a 10: " + contadorStream);

        // forma 2
        Predicate<Integer> esMayorA10 = numero -> numero > 10;
        long contadorStream2 = numeros.stream().filter(esMayorA10).count();
        System.out.println("Cantidad de elementos mayores a 10: " + contadorStream2);

    }

}
