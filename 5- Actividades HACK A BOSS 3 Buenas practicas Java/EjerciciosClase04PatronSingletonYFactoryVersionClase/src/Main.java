import entidades.Empresa;
/*
Version Clase
Ejercicio Nº 4: Patrones Creacionales Singleton y Factory
Dada el siguiente diagrama de clases, se te encomienda el desafío de implementar los patrones: Singleton y Factory para construir objetos de estas clases a partir de
diferentes parámetros establecidos, por ejemplo: Si recibimos como parámetro “EMP-INT” deberás poder construir un objeto de la clase EmpleadoRelacionDependencia
y si el parámetro es “EMP-EXT” deberás poder construir un objeto de la clase EmpleadoContratado.
Lo anterior se realizará desde la clase: Empresa, luego de obtener el empleado creado por el factory, setear los datos del mismo.
 */
public class Main {

    public static void main(String[] args) {

        // Crear una empresa
        Empresa empresa = new Empresa();
        empresa.setRazonSocial("Empresa");
        empresa.crearEmpleados();
        empresa.mostrarEmpleados();

        double totalSueldo = empresa.calcularSueldoTotal(10);

        System.out.println("Total de Sueldos abonados: ");
        System.out.println(totalSueldo);


    }
}
