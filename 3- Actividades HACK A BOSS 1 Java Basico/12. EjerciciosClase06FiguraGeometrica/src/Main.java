import modelo.entidad.Circulo;
import modelo.entidad.Cuadrado;
import modelo.entidad.FiguraGeometrica;
import modelo.entidad.Rectangulo;

import java.util.ArrayList;
/*
Ejercicio Nº 2 - Collections, Clases Abstractas
a)     Crear una clase abstracta llamada FiguraGeometrica con los siguientes atributos: id, color, coordenadas. Establecer un método abstracto para calcular el área de la figura que deveuelva un double.

b)     Crea la clase Circulo que herede de FiguraGeometrica. Agrega atributos específicos, como: radio. Implementa el método abstracto de la superclase.

c)     Crea la clase Rectangulo que herede de FiguraGeometrica. Agrega atributos específicos, como: lado1 y lado2. Implementa el método abstracto de la superclase.
d)     Crea la clase Cuadrado que herede de FiguraGeometrica. Agrega atributos específicos, como: lado. Implementa los métodos abstractos de la superclase.

e)     Main: En el programa principal, crea objetos de diferentes tipos de figuras geometricas (circulo, rectángulos y cuadrados) y añádelos a un ArrayList de tipo FiguraGeometrica.

f)     Polimorfismo: Recorrer el ArrayList de Figuras geometricas y mostrar la información de cada uno de ellos, incluyendo el cálculo el área de la figura.
Ejercicio Nº 2 - Collections, Clases Abstractas
a)     Crear una clase abstracta llamada FiguraGeometrica con los siguientes atributos: id, color, coordenadas. Establecer un método abstracto para calcular el área de la figura que deveuelva un double.

b)     Crea la clase Circulo que herede de FiguraGeometrica. Agrega atributos específicos, como: radio. Implementa el método abstracto de la superclase.

c)     Crea la clase Rectangulo que herede de FiguraGeometrica. Agrega atributos específicos, como: lado1 y lado2. Implementa el método abstracto de la superclase.
d)     Crea la clase Cuadrado que herede de FiguraGeometrica. Agrega atributos específicos, como: lado. Implementa los métodos abstractos de la superclase.

e)     Main: En el programa principal, crea objetos de diferentes tipos de figuras geometricas (circulo, rectángulos y cuadrados) y añádelos a un ArrayList de tipo FiguraGeometrica.

f)     Polimorfismo: Recorrer el ArrayList de Figuras geometricas y mostrar la información de cada uno de ellos, incluyendo el cálculo el área de la figura.

 */
public class Main {
    public static void main(String[] args) {


        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();


        figuras.add(new Circulo(1, "Rojo", "(0, 0)", 5));
        figuras.add(new Rectangulo(2, "Azul", "(2, 3)", 4, 6));
        figuras.add(new Cuadrado(3, "Verde", "(-1, -1)", 3));


        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println("El área es: " + String.format("%.2f", figura.calcularArea()));
        }

        System.out.println("****Listado circulos*****");
        for (FiguraGeometrica figura : figuras) {
            if (figura instanceof Circulo) {
                System.out.println(figura);
            }
        }

    }
}