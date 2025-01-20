/*
Ejercicio Nº 4: Recursividad – Recorrer un array
Crear una clase llamada: ClaseRecursiva y crear un método llamado: mostrarContenidoArray, este método debe recibir dos parámetros: un array y un entero que representa el índice del array, cuando se invoca la primera vez se pasa cero. El método debe recorrer y mostrar cada elemento del array.

·        Para el tipo de datos del array se debe utilizar un Generic, es decir, se define el tipo de recién una vez que se crea un objeto de la clase.
·        El tipo de array que recibe el método: mostrarContenidoArray debe ser del tipo T.
·        No debe utilizar ninguna estructura repetitiva.
·        El método mostrarContenidoArray, debe ser recursivo, es decir, que se llame a sí mismo.
·        En el método: main() invocar al método: mostrarContenidoArray con distintos valores para verificar que funcione correctamente.
·        Analizar el comportamiento del método recursivo, si es necesario agregar algunos prints.
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        ClaseRecursiva<Integer> claseRecursiva = new ClaseRecursiva<>();
        Integer[] array = {1, 2, 3, 4, 5, 6};
        claseRecursiva.mostrarContenidoArray(array, 0);
        System.out.println("Lontigud del array: " + array.length);

        System.out.println("************************************");

        ClaseRecursiva<String> claseRecursiva2 = new ClaseRecursiva<>();
        String[] array2 = {"A", "B", "C", "D", "E"};
        claseRecursiva2.mostrarContenidoArray(array2, 0);
        System.out.println("Lontigud del array: " + array2.length);

        System.out.println("************************************");

        ClaseRecursiva<Double> claseRecursiva3 = new ClaseRecursiva<>();
        Double[] array3 = {1.1, 2.2, 3.3};
        claseRecursiva3.mostrarContenidoArray(array3, 0);
        System.out.println("Lontigud del array: " + array3.length);

    }
}
