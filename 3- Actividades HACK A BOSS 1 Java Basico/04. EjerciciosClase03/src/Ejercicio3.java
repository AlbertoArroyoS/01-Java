import java.util.ArrayList;
import java.util.List;
/*
Ejercicio Nº 2 - POO
Crear una clase Impresora, que tenga los siguientes atributos: modelo, tipo de conexión, fecha de fabricación y hojas disponibles (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

a)     En el metodo main: Crear un vector de tipo Impresora de tres posiciones. Crear tres impresoras y guardarlas en él.
b)     En el metodo main: Recorrer el vector creado y mostrar por pantalla el modelo y tipo de conexión de cada impresora almacenada.
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        Impresora impresora1 = new Impresora("A00001", "WIFI", "01/02/2020", 200);
        Impresora impresora2 = new Impresora("B00002", "USB A", "09/09/2019", 100);
        Impresora impresora3 = new Impresora("C00003", "USB C", "17/02/2024", 150);

        //En un array
        Impresora[] impresoras = new Impresora[3];
        impresoras[0] = impresora1;
        impresoras[1] = impresora2;
        impresoras[2] = impresora3;


        System.out.println("\nLista 1 de impresoras del array:");
        for (int i = 0; i < impresoras.length; i++) {
            System.out.println("Modelo: " + impresoras[i].getModelo() +
                    ", Tipo de conexion: " + impresoras[i].getTipoConexion() +
                    ", Fecha de fabricacion: " + impresoras[i].getFechaFabricacion() +
                    ", Hojas disponibles: " + impresoras[i].getHojasDisponibles());
        }

        System.out.println("\nLista 2 de impresoras del array:");
        for (Impresora impresora : impresoras) {
            System.out.println("Modelo: " + impresora.getModelo() +
                    ", Tipo de conexion: " + impresora.getTipoConexion() +
                    ", Fecha de fabricacion: " + impresora.getFechaFabricacion() +
                    ", Hojas disponibles: " + impresora.getHojasDisponibles());
        }

        // Añadir los clientes a la lista
        List<Impresora> listaImpresoras = new ArrayList<>();
        listaImpresoras.add(impresora1);
        listaImpresoras.add(impresora2);
        listaImpresoras.add(impresora3);

        System.out.println("\nLista de impresoras de una List:");
        for (Impresora impresora : listaImpresoras) {
            System.out.println("Modelo: " + impresora.getModelo() +
                    ", Tipo de conexion: " + impresora.getTipoConexion() +
                    ", Fecha de fabricacion: " + impresora.getFechaFabricacion() +
                    ", Hojas disponibles: " + impresora.getHojasDisponibles());
        }


    }
}