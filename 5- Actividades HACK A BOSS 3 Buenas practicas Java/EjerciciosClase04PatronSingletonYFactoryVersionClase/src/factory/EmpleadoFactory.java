package factory;

import entidades.Empleado;
import entidades.EmpleadoContratado;
import entidades.EmpleadoRelacionDependencia;

public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    private EmpleadoFactory()
    {
    }

    public static EmpleadoFactory getInstance()
    {
        if(instance == null)
            instance = new EmpleadoFactory();

        return instance;
    }

    public static Empleado crearEmpleado(String tipo)
    {
        Empleado empleadoAux = null;
        switch (tipo) {
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


