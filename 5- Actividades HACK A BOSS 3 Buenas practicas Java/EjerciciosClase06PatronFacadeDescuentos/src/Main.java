import entidades.Producto;
import entidades.Tarjeta;
import facade.DescuentoFacade;

/*
Ejercicio Nº 2: Patrón FACADE
Analizar el código fuente del ejemplo del pratrón facade, implementar el siguiente escenario:
Supongamos que tenemos que programar un sistema de cálculo de descuento en un supermercado.
Hay descuentos acumulables (se suman los porcentajes) según:
●Por tarjeta: si es del banco Star Bank tiene un 20% de descuento extra.
●Por tipo de producto: las latas tienen un 10% de descuento.
●Por cantidad: si compran más de 12 hay un descuento del 15%.
Cada política de descuento está implementada en una API diferente:
1.	ApiTarjeta: int descuento(Tarjeta)
2.	ApiProducto: int descuento(Producto)
3.	ApiCantidad: int descuento(cantidad)

Por lo cual se implementará una fachada que permita exponer el cálculo de descuento de alto nivel que utilice las diferentes apis.
Hay que modelar también las clases:
●Producto: nombre String y tipo String
●Tarjeta: número String y banco String
Utilizando el patrón Facade se quiere hacer una fachada que permita simplificar el cálculo de descuento con producto, tarjeta y cantidad como parámetros.

 */
public class Main {
    public static void main(String[] args) {
        // Crear los objetos necesarios
        Tarjeta tarjeta = new Tarjeta("123456789", "Star Bank");
        Producto producto = new Producto("Coca Cola", "lata");
        int cantidad = 15;

        // Crear la fachada
        DescuentoFacade descuentoFacade = new DescuentoFacade();

        // Calcular el descuento total
        int descuentoTotal = descuentoFacade.calcularDescuento(tarjeta, producto, cantidad);

        System.out.println("El descuento total es: " + descuentoTotal + "%");
    }
}
