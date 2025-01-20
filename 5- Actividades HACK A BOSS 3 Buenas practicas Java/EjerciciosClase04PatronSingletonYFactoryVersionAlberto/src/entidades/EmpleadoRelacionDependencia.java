package entidades;

public class EmpleadoRelacionDependencia extends Empleado {

    private double sueldoMensual;

    public EmpleadoRelacionDependencia() {
        super();
    }

    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo, double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }


    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return dias * sueldoMensual / 30;
    }

    @Override
    public String toString() {
        return "EmpleadoRelacionDependencia{" +
                "sueldoMensual=" + sueldoMensual +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
