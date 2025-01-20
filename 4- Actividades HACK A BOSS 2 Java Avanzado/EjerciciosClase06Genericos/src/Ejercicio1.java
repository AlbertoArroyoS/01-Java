import modelo.entidad.ejemplo1.Caja;

public class Ejercicio1 {
    public static void main(String[] args) {


        Caja<String> cajaDeCadenas = new Caja<>();
        cajaDeCadenas.ponerContenido("Hola, soy una cadena");
        System.out.println(cajaDeCadenas.obtenerTipo());
        System.out.println(cajaDeCadenas.obtenerTipo2());

        Caja<Integer> cajaDeEnteros = new Caja<>();
        cajaDeEnteros.ponerContenido(199);
        System.out.println(cajaDeEnteros.obtenerTipo());
        System.out.println(cajaDeEnteros.obtenerTipo2());

        Caja<Boolean> cajaDeBooleanos = new Caja<>();
        cajaDeBooleanos.ponerContenido(true);
        System.out.println(cajaDeBooleanos.obtenerTipo());
        System.out.println(cajaDeBooleanos.obtenerTipo2());

        Caja<Double> cajaDeDoubles = new Caja<>();
        cajaDeDoubles.ponerContenido(123.45);
        System.out.println(cajaDeDoubles.obtenerTipo());
        System.out.println(cajaDeDoubles.obtenerTipo2());

        Caja<Object> cajaDeObjetos = new Caja<>();
        cajaDeObjetos.ponerContenido(new Object());
        System.out.println(cajaDeObjetos.obtenerTipo());
        System.out.println(cajaDeObjetos.obtenerTipo2());
    }

}