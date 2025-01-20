import modelo.entidad.Cliente;
/*
Ejercicio Nº 5: Streams y Optionals
Crear una clase Cliente con el atributo: apellido, luego crear 10 objetos del tipo cliente y cargarlos al listado. Una vez cargado el listado, mediante programación funcional (utilizando: Stream, Lambdas y optionals) realizar lo siguiente:
·Obtener el primer cliente cuyo apellido coincida con uno buscado, en la búsqueda NO debe tener en cuenta las mayúsculas/minúsculas.
·El item anterior devuelve un Optional, debe tratarlo de las siguientes formas:
1.Obtenerlo directamente con el metodo: get()
2.Si está presente(isPresent) el cliente, muestre: “Un cliente encontrado” caso contrario muestre: “No se encontró ningún cliente”.
3.Si encontró devolver el cliente correspondiente y si no encontró, crear uno nuevo con el apellido buscado.
4.Si encontró, devolver el apellido y si no encontró, devolver “Cliente no encontrado”.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Crear una lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Gonzalez"));
        clientes.add(new Cliente("Perez"));
        clientes.add(new Cliente("Lopez"));
        clientes.add(new Cliente("Martinez"));
        clientes.add(new Cliente("Rodriguez"));
        clientes.add(new Cliente("Sanchez"));
        clientes.add(new Cliente("Fernandez"));
        clientes.add(new Cliente("Garcia"));
        clientes.add(new Cliente("Jimenez"));
        clientes.add(new Cliente("Diaz"));

        String apellidoBuscado = "Wayne"; // Puedes cambiar este valor para probar otras búsquedas

        Optional<Cliente> clienteEncontrado = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst();


        // 1. Obtener el cliente directamente con el metodo get()
        //Cliente cliente = clienteEncontrado.get();
        //System.out.println("1. Cliente encontrado: " + cliente.getApellido());

        // 2. Si el cliente está presente, mostrar un mensaje, sino mostrar otro
        if (clienteEncontrado.isPresent()) {
            System.out.println("Un cliente encontrado: ");
        } else {
            System.out.println("No se encontró ningún cliente");
        }

        String clienteEncontradoString = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                .map(Cliente::getApellido)
                .orElse("No se encontró ningún cliente");

        System.out.println("2. " + clienteEncontradoString);

        // 3. Si encontró, devolver el cliente correspondiente; si no, crear uno nuevo
        //Cliente clienteDevuelto = clienteEncontrado.orElseGet(() -> new Cliente(apellidoBuscado));
        //System.out.println("Cliente devuelto: " + clienteDevuelto.getApellido());


        Cliente clienteEncontradoCliente = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                .orElseGet(() -> {
                    Cliente nuevoCliente = new Cliente(apellidoBuscado);
                    clientes.add(nuevoCliente); // Agregar el cliente a la lista
                    return nuevoCliente;
                });

        Cliente clienteEncontradoCliente2 = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                .orElse(new Cliente(apellidoBuscado));

        System.out.println("3. Cliente encontrado o añadido: " + clienteEncontradoCliente);


        // 4. Si encontró, devolver el apellido; si no, devolver "Cliente no encontrado"
        //String resultado = clienteEncontrado.map(Cliente::getApellido).orElse("Cliente no encontrado");
        //System.out.println("Resultado final: " + resultado);

        String devolverApellido = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                .map(Cliente::getApellido)
                .orElse("Cliente no encontrado");

        System.out.println("4. " + devolverApellido);

        //Otra opcion del punto 4
        clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoBuscado))
                .findFirst()
                        .ifPresentOrElse(
                                c -> System.out.println("Cliente encontrado: " + c.getApellido()),
                                () -> System.out.println("Cliente no encontrado")
                        );


        System.out.println("Lista final");
        clientes.forEach(cliente -> System.out.println("Apellido: " + cliente.getApellido()));





    }
}
