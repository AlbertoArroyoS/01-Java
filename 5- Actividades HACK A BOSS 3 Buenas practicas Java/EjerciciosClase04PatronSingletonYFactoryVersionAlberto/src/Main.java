import entidades.Empresa;
/*
Version Alberto
Ejercicio Nº 4: Patrones Creacionales Singleton y Factory.
Dada el siguiente diagrama de clases, se te encomienda el desafío de implementar los patrones: Singleton y Factory para construir objetos de estas clases a partir de
diferentes parámetros establecidos, por ejemplo: Si recibimos como parámetro “EMP-INT” deberás poder construir un objeto de la clase EmpleadoRelacionDependencia
y si el parámetro es “EMP-EXT” deberás poder construir un objeto de la clase EmpleadoContratado.
Lo anterior se realizará desde la clase: Empresa, luego de obtener el empleado creado por el factory, setear los datos del mismo.
 */
public class Main {

    public static void main(String[] args) {

        //Crear empresa
        Empresa miEmpresa = new Empresa("Mi Empresa");
        //Crear empleados
        miEmpresa.crearEmpleado("EMP-INT", "Alberto", "Arroyo", 1, 1500);
        miEmpresa.crearEmpleado("EMP-EXT", "Erika", "Arroyo", 3, 7, 14);
        //Mostrar empleados
        miEmpresa.mostrarEmpleados();
        //Total sueldos
        System.out.println("Total de Sueldos abonados: " + miEmpresa.calcularSueldoTotal(10));



    }
}
