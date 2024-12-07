import modelo.entidad.Socio;
import modelo.entidad.SocioHabilitado;
/*
Ejercicio Nº 1 - Herencia, Polimorfismo y Encapsulamiento
Crear una clase
"Socio" con los atributos: número socio, nombre, cuota mensual y actividad (con sus métodos y constructores correspondientes). Agregar también un método llamado “Costo Mensual” que devuelva el atributo cuota mensual. A partir de esto hacer lo siguientes pasos:

a)     Crear una clase hija: "Socio Habilitado" con atributos adicionales: costo de pileta y si está habilitado o no.

b)      Una vez creada la sub-clase, crear los
siguientes métodos en: "Socio Habilitado": sobrescribir el método “Costo Mensual” de la clase madre y agregar el costo de pileta(piscina).

En el método
"main", crear un objeto de cada clase. Llamar a los 2 métodos “Costo Mensual” desde cada objeto.
 */

public class Main {
    public static void main(String[] args) {

        Socio socio = new Socio(001,"Alberto", 90, "Actividad1");
        SocioHabilitado socioHabilitado = new SocioHabilitado(002,"Juan", 90, "Actividad2", 50, true);


        System.out.println(socio);
        System.out.println(socioHabilitado);
        System.out.println("Costo mensual Socio: "+ socio.costoMensual());
        System.out.println("Costo mensual Socio habilidado: "+ socioHabilitado.costoMensual());

    }
}