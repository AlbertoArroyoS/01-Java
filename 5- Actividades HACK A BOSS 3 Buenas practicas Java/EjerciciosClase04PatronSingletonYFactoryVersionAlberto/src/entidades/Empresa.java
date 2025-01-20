package entidades;

import factory.EmpleadoFactory;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();;
    }

    //Metodo para crear empleados de tipo EMP-INT
    public void crearEmpleado(String tipoEmpleado, String nombre, String apellido, int legajo, double sueldoMensual) {

        EmpleadoRelacionDependencia empleado = (EmpleadoRelacionDependencia) EmpleadoFactory.crearEmpleado(tipoEmpleado);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setLegajo(legajo);
        empleado.setSueldoMensual(sueldoMensual);

        empleados.add(empleado);
    }
    //Metodo sobrecargado para crear empleados de tipo EMP-EXT
    public void crearEmpleado(String tipoEmpleado, String nombre, String apellido, int legajo, double importePorHora, double retencionImpuesto){

        EmpleadoContratado empleado = (EmpleadoContratado) EmpleadoFactory.crearEmpleado(tipoEmpleado);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setLegajo(legajo);
        empleado.setImportePorHora(importePorHora);
        empleado.setRetencionImpuesto(retencionImpuesto);

        empleados.add(empleado);
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
        System.out.println(this.razonSocial);
        empleados.forEach(System.out::println);
    }
}


