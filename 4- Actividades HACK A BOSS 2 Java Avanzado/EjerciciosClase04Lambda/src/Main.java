import java.util.function.Function;

/*
Ejercicio Nº 3: Funciones Lamda
Realizar una interface funcional con un método que reciba un String y devuelva un String llamado: emitirMensaje.
Luego se deben realizar la implementación del método anterior de la siguiente forma que retorne lo siguiente:
   “Recibí el siguiente parámetro: “+parametro
Implementar de las siguientes formas:
1.	Usando una clase regular
2.	Usando una clase anónima
3.	Usando una expresión lamda compleja
4.	Usando una expresión lamda simple
5.	Usando una interface funcional ya existente
*/
public class Main {
    public static void main(String[] args) {

        // 1. Usando una clase regular
        MiClase miClase = new MiClase();
        System.out.println(miClase.emitirMensaje("Clase regular"));

        // 2. Usando una clase anónima
        MiInterfaceFuncional miInterfaceFuncional = new MiInterfaceFuncional() {
            @Override
            public String emitirMensaje(String parametro) {
                return "Recibí el siguiente parámetro: " + parametro;
            }
        };
        System.out.println(miInterfaceFuncional.emitirMensaje("Clase anonima"));

        // 3. Usando una expresión lamda compleja, puede tener mas de una linea de código
        MiInterfaceFuncional miInterfaceFuncionalLambdaCompleja = (String parametro) -> {
            return "Recibí el siguiente parámetro: " + parametro;
        };
        System.out.println(miInterfaceFuncionalLambdaCompleja.emitirMensaje("Lambda compleja"));

        // 4. Usando una expresión lamda simple
        MiInterfaceFuncional miInterfaceFuncionalLambdaSimple = p -> "Recibí el siguiente parámetro: "+p;
        System.out.println(miInterfaceFuncionalLambdaSimple.emitirMensaje("Lambda simple"));

        // 5. Usando una interface funcional ya existente
        Function<String, String> function = p -> "Recibí el siguiente parámetro: " + p;
        System.out.println(function.apply("Usando Function"));

    }
}