import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/*
Ejercicio Nº 2 - Gestor de eventos - Individual

Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:


Filtra los eventos que están programados para una fecha específica.


Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.


Encuentra el evento más próximo en el tiempo utilizando Optionals.
 */
public class Main {
    public static void main(String[] args) {

        // Lista de eventos
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión de equipo", LocalDate.of(2024, 12, 20), "Reunión"),
                new Evento("Conferencia Java", LocalDate.of(2024, 12, 22), "Conferencia"),
                new Evento("Taller de liderazgo", LocalDate.of(2024, 12, 18), "Taller"),
                new Evento("Reunión con cliente", LocalDate.of(2024, 12, 20), "Reunión"),
                new Evento("Seminario Agile", LocalDate.of(2024, 12, 25), "Conferencia"),
                new Evento("Workshop Python", LocalDate.of(2024, 12, 21), "Taller")
        );

        // Operación 1: Filtrar eventos programados para una fecha específica
        LocalDate fechaFiltro = LocalDate.of(2024, 12, 20);
        List<Evento> eventosFiltrados = eventos.stream()
                .filter(e -> e.getFecha().equals(fechaFiltro))
                .collect(Collectors.toList());

        System.out.println("Eventos programados para la fecha " + fechaFiltro + ":");
        eventosFiltrados.forEach(System.out::println);

        // Operación 2: Agrupar eventos por categoría y contar cuántos hay en cada categoría

        //2.1 Con una lista de eventos

        /*
        List<Evento> eventosConteo = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> new Evento(entry.getKey(), null, entry.getValue() + " evento(s)"))
                .collect(Collectors.toList());

        System.out.println("\nLista de eventos para el conteo por categoría:");
        eventosConteo.forEach(System.out::println);*/

        //2.2 Con un Map
        Map<String, Long> conteoPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(
                        Evento::getCategoria,
                        Collectors.counting()
                ));

        System.out.println("\nConteo de eventos por categoría:");
        conteoPorCategoria.forEach((categoria, conteo) ->
                System.out.println(categoria + ": " + conteo));

        // Operación 3: Encontrar el evento más próximo en el tiempo
        Optional<Evento> eventoMasProximo = eventos.stream()
                .min(Comparator.comparing(Evento::getFecha));

        System.out.println("\nEvento más próximo en el tiempo:");
        eventoMasProximo.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No hay eventos programados.")
        );
    }
}