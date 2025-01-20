package modelo.entidad;

public class SocioHabilitado extends Socio{

    private double costoPileta;
    private boolean estaHabilitado;

    public SocioHabilitado(int numeroSocio, String nombre, double cuotaMensual, String actividad, double costoPileta, boolean estaHabilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    @Override
    public double costoMensual() {
        return super.costoMensual()+this.costoPileta;
    }

    @Override
    public String toString() {
        return "SocioHabilitado{" +
                "numeroSocio=" + numeroSocio +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                ", estaHabilitado=" + estaHabilitado +
                ", costoPileta=" + costoPileta +
                '}';
    }
}
