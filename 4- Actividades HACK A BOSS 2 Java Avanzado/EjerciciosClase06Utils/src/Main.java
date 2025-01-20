import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Lista de comentarios de usuarios
        List<String> comentarios = Arrays.asList(
                "Este producto es genial. ¡Lo recomiendo!",
                "No estoy satisfecho con el servicio al cliente.",
                "Increíble oferta. ¡Compré dos!",
                "El envío fue rápido y el producto llegó en perfecto estado.",
                "No recomendaría este producto a nadie."
        );

        // Contar palabras más frecuentes
        Map<String, Integer> frecuenciaPalabras = contarPalabras(comentarios);
        System.out.println("Palabras más frecuentes:");
        frecuenciaPalabras.forEach((palabra, frecuencia) -> System.out.println(palabra + ": " + frecuencia));

        // Censurar ciertas palabras
        List<String> palabrasCensuradas = Arrays.asList("genial", "recomendaría", "rápido", "perfecto");
        List<String> comentariosCensurados = censurarPalabras(comentarios, palabrasCensuradas);
        System.out.println("\nComentarios censurados:");
        comentariosCensurados.forEach(System.out::println);


    }

    // Utilizando la clase java.util.StringTokenizer para contar palabras
    private static Map<String, Integer> contarPalabras(List<String> comentarios) {
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        for (String comentario : comentarios) {
            // Tokenizar el comentario en palabras a minúsculas y con delimitadores de puntuación
            StringTokenizer tokenizer = new StringTokenizer(comentario.toLowerCase(), " .,!?");
            //Mientras haya tokens, contar las palabras
            while (tokenizer.hasMoreTokens()) {
                String palabra = tokenizer.nextToken();
                // Incrementar la frecuencia de la palabra
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Ordenar por frecuencia descendente
        return sortByValueDescending(frecuenciaPalabras);
    }

    // Utilizando la clase java.util.Collections para ordenar un Map por valores de forma descendente
    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map) {
        // Crear una lista de entradas del mapa
        List<Map.Entry<K, V>> listaEntradas = new ArrayList<>(map.entrySet());
        // Ordenar la lista de entradas por valores de forma descendente
        listaEntradas.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        Map<K, V> mapaOrdenado = new LinkedHashMap<>();
        // Insertar las entradas ordenadas en un nuevo mapa
        for (Map.Entry<K, V> entrada : listaEntradas) {
            mapaOrdenado.put(entrada.getKey(), entrada.getValue());
        }

        return mapaOrdenado;
    }

    // Utilizando la clase java.util.StringJoiner para censurar palabras
    private static List<String> censurarPalabras(List<String> comentarios, List<String> palabrasCensuradas) {
        List<String> comentariosCensurados = new ArrayList<>();

        for (String comentario : comentarios) {
            // Reemplazar palabras censuradas por "*censurado*"

            //StringJoiner hace lo mismo que StringBuilder pero con un delimitador, en este caso un espacio
            StringJoiner joiner = new StringJoiner(" ");
            //StringTokenizer divide un string en tokens, en este caso por espacios
            //Un token es una palabra
            StringTokenizer tokenizer = new StringTokenizer(comentario, " ");
            //Mientras haya tokens
            while (tokenizer.hasMoreTokens()) {
                //Obtener el siguiente token
                String palabra = tokenizer.nextToken();
                //Si la lista de palabras censuradas contiene la palabra en minúsculas
                if (palabrasCensuradas.contains(palabra.toLowerCase())) {
                    // Censurar la palabra
                    joiner.add("*censurado*");
                } else {
                    joiner.add(palabra);
                }
            }
            comentariosCensurados.add(joiner.toString());
        }

        return comentariosCensurados;
    }



}


