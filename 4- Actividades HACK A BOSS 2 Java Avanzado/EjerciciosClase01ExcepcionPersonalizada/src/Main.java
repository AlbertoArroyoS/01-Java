import exception.FechaException;
import modelo.entidad.Fecha;
/*
Ejercicio Nº 1: “Fecha” – Excepción Personalizada
Proteger la integridad de una clase
Cuando creamos una clase, estamos tratando de representar algo que tiene un cierto comportamiento. Los valores que se guardan en sus atributos pueden tener que respetar un rango de valores, en ese caso, tenemos que proteger la integridad de la clase, veamos un ejemplo. Una fecha es algo bien conocido por todos, pero si la clase representa algo no tan habitual, quien tiene que utilizar la clase no tiene por qué saber con qué rango de valores se debe trabajar. A fines prácticos, vamos a establecer que los días pueden estar entre 1 y 31 sin importar el mes y los meses entre 1 y 12.
Tareas a realizar:
a)     Crear una clase llamada Fecha con los atributos enteros: day, month e year.
b)     Crear un constructor que reciba todos los atributos.
c)     Crear una clase que extienda de Exception llamada: FechaException, agregar sus constructores correspondientes.
d)     En el constructor de la clase Fecha implementar la validación necesaria para que los atributos: day y month estén en el rango correcto, de no ser así debe lanzar la excepción FechaException indicando el mensaje correspondiente.
e)     En el método main, realizar distintas pruebas para verificar si lanza correctamente la excepción cuando corresponde.

 */
public class Main {
    public static void main(String[] args) throws FechaException {

        // Prueba 1: Fecha válida
        //Fecha fechaValida = new Fecha(15, 8, 2023);
        //System.out.println("Fecha válida: " + fechaValida);

        // Prueba 2: Día inválido
        //Fecha fechaDiaInvalido = new Fecha(32, 5, 2023); // Esto lanzará una excepción
        //System.out.println("Fecha creada: " + fechaDiaInvalido);

        // Prueba 3: Mes inválido
        //Fecha fechaMesInvalido = new Fecha(10, 13, 2023); // Esto lanzará una excepción
        //System.out.println("Fecha creada: " + fechaMesInvalido);

        // Prueba 4: Día y mes inválidos
        Fecha fechaInvalida = new Fecha(0, 0, 2023); // Esto lanzará una excepción
        System.out.println("Fecha creada: " + fechaInvalida);

    }
}