public class Recursividad {

    //metodo recursivo
    public void imprimir(int numero) {
        if (numero <= 5) {
            System.out.println(numero);
            imprimir(numero + 1);
            System.out.println("Dentro del if " + numero);
        }
        System.out.println("Fuera del if " + numero);
    }

    //metodo llamado: sumar(), este metodo debe recibir un parámetro entero n
    // y realizar la suma de los números naturales hasta n (el número pasado por parámetro) y devolver ese valor.
    public int sumar(int n) {
        System.out.println("n: " + n);

        if (n == 0) {
            return 0;
        } else {
            //Recursivo que devuelve la suma de los números naturales hasta n
            return n + sumar(n - 1);
        }

        /*
        if (n > 0) {
            // Llamada recursiva: suma n + llamada recursiva con (n - 1)
            return n + sumar(n - 1);
        } else {

            return 0;
        }*/

    }
}
