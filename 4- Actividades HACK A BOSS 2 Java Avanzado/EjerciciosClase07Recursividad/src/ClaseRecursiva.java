public class ClaseRecursiva<T> {


    public void mostrarContenidoArray(T[] array, int indice) {

        // Si el índice es menor al tamaño del array, mostrar el contenido del array en el índice actual
        // y llamar recursivamente al metodo con el índice incrementado en 1.
        if (indice < array.length) {
            System.out.println("Elemento en índice " + indice + ", valor: " + array[indice]);
            mostrarContenidoArray(array, indice + 1);
        }

    }
}
