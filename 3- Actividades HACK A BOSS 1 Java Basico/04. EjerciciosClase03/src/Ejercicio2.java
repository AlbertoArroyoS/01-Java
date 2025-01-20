import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        //a)
        Cliente c1 = new Cliente(1, "Alberto", 500);
        Cliente c2 = new Cliente(2, "Isabel", 200);
        Cliente c3 = new Cliente(3, "Erika", 150);
        //b)
        Cliente c4 = new Cliente();
        //c)
        c4.setNumeroCliente(4);
        c4.setNombre("Julian");
        c4.setDeuda(900);
        //d)
        System.out.println("\nLista de Clientes con getter:");
        System.out.println("Cliente: "+c1.getNumeroCliente()+" ,Nombre: "+c1.getNombre()+" ,Deuda: "+c1.getDeuda());
        System.out.println("Cliente: "+c2.getNumeroCliente()+" ,Nombre: "+c2.getNombre()+" ,Deuda: "+c2.getDeuda());
        System.out.println("Cliente: "+c3.getNumeroCliente()+" ,Nombre: "+c3.getNombre()+" ,Deuda: "+c3.getDeuda());

        System.out.println("Cliente: "+c4.getNumeroCliente()+" ,Nombre: "+c4.getNombre()+" ,Deuda: "+c4.getDeuda());


        // Añadir los clientes a la lista
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);

        System.out.println("\nLista de Clientes de una List:");
        for (Cliente cliente : listaClientes) {
            System.out.println("Cliente: " + cliente.getNumeroCliente() +
                    ", Nombre: " + cliente.getNombre() +
                    ", Deuda: " + cliente.getDeuda());
        }

        //En un array
        Cliente[] clientes = new Cliente[4];
        clientes[0] = c1;
        clientes[1] = c2;
        clientes[2] = c3;
        clientes[3] = c4;

        System.out.println("\nLista de Clientes del array:");
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNumeroCliente() +
                    ", Nombre: " + cliente.getNombre() +
                    ", Deuda: " + cliente.getDeuda());
        }
    }
}