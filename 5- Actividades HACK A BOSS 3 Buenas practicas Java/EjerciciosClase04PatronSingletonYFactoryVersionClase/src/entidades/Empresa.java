package entidades;

import factory.EmpleadoFactory;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(){
    }

    public void crearEmpleados(){
        empleados = new ArrayList<>();

        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia) EmpleadoFactory.crearEmpleado("EMP-INT");
        emp1.setNombre("Alberto");
        emp1.setApellido("Arroyo");
        emp1.setSueldoMensual(1500);
        emp1.setLegajo(1);

        EmpleadoContratado emp2 = (EmpleadoContratado) EmpleadoFactory.crearEmpleado("EMP-EXT");
        emp2.setNombre("Erika");
        emp2.setApellido("Arroyo");
        emp2.setImportePorHora(7);
        emp2.setRetencionImpuesto(14);
        emp2.setLegajo(3);

        empleados.add(emp1);
        empleados.add(emp2);
    }

    public double calcularSueldoTotal(int dias){
        /*double total = 0;
        for(Empleado emp: empleados)
            total+=emp.calcularSueldo(dias);
        return total;*/

        return empleados.stream()
                .mapToDouble(e -> e.calcularSueldo(dias))
                .sum();
    }


    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    //Mostrar lista de empleados
    public void mostrarEmpleados(){
        empleados.forEach(System.out::println);
    }
}


