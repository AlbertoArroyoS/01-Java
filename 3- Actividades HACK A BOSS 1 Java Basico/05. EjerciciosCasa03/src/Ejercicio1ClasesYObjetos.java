import modelo.entidad.Electrodomestico;

/*
Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
Luego, realiza las siguientes acciones:


a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.


b) Crea 1 objeto de la clase Electrodomestico sin parámetros.


c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.


d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
 */
class Ejercicio1ClasesYObjetos {
    public static void main(String[] args) {

        Electrodomestico el1 = new Electrodomestico(0001,"Marca1","Modelo1","A++","Blanco");
        Electrodomestico el2 = new Electrodomestico(0002,"Marca2","Modelo2","A++++","Negro");
        Electrodomestico el3 = new Electrodomestico(0003,"Marca3","Modelo3","A+","Acero");

        Electrodomestico el4 = new Electrodomestico();

        // Mostrar marca, modelo y consumo energético de los creados con parámetros
        System.out.println("Electrodoméstico 1: Marca = " + el1.getMarca() + ", Modelo = " + el1.getModelo() + ", Consumo = " + el1.getConsumo());
        System.out.println("Electrodoméstico 2: Marca = " + el2.getMarca() + ", Modelo = " + el2.getModelo() + ", Consumo = " + el2.getConsumo());
        System.out.println("Electrodoméstico 3: Marca = " + el3.getMarca() + ", Modelo = " + el3.getModelo() + ", Consumo = " + el3.getConsumo());

        System.out.println("Electrodoméstico 4: Marca = " + el4.getMarca()); // Devuelve Null

    }
}