import java.util.Arrays;
import java.util.List;
/*
Ejercicio Nº 1: Funciones Lamda
Crear una lista de String con los nombres de los meses (los 12), para cargar el listado NO utilizar el método .add() investigar otra forma de cargarlo.
Una vez cargado el listado, debe mostrar cada uno de los elementos de la siguiente forma:
            “El mes es: “+mes
Realizar lo anterior de la forma habitual (con programación imperativa) y luego realizar con programación funcional utilizando una función lambda.

 */
public class Ejercicio1 {
    public static void main(String[] args) {

        //Primera forma de llenar la lista con Arrays.asList
        //asList permite nulos y puede ser mutable
        List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre");

        //Segunda forma de llenar la lista con List.of
        //list.of no permite nulos y es inmutable
        List<String> meses2 = List.of(
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        );


        System.out.println("Imprimir los meses con un for");
        for (String mes : meses2) {
            System.out.println("El mes es: " + mes);
        }
        System.out.println("Imprimir los meses con un forEach lambda");
        meses2.forEach(mes -> System.out.println("El mes es: " + mes));

        System.out.println("Imprimir los meses con un forEach lambda double colon");
        meses2.forEach(System.out::println);

    }
}