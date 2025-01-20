package factory;

import entidades.Empleado;
import entidades.EmpleadoContratado;
import entidades.EmpleadoRelacionDependencia;

public class EmpleadoFactory {
    // Instancia privada estática de la clase para implementar el patrón Singleton
    private static EmpleadoFactory instance;
    // Constructor privado para evitar que se creen instancias directamente
    private EmpleadoFactory() {
    }
    // Método público estático para obtener la única instancia de la clase (patrón Singleton)
    public static EmpleadoFactory getInstance() {
        if(instance == null)
            instance = new EmpleadoFactory();

        return instance;
    }
    // Método estático para crear un objeto Empleado basado en el tipo que se pase como argumento
    public static Empleado crearEmpleado(String tipoEmpleado) {
        Empleado empleadoAux = null;
        switch (tipoEmpleado) {
            case "EMP-INT":
                empleadoAux = new EmpleadoRelacionDependencia();
                break;
            case "EMP-EXT":
                empleadoAux =  new EmpleadoContratado();
                break;
        }
        return empleadoAux;
    }
}


