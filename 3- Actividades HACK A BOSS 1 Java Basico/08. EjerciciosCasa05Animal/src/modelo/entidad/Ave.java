package modelo.entidad;

public class Ave extends Animal{

    private double envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion,
               double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave.");
    }

    @Override
    public String toString() {
        return "Ave{" +
                "tipoPico='" + tipoPico + '\'' +
                ", envergaduraAlas=" + envergaduraAlas +
                ", tipoVuelo='" + tipoVuelo + '\'' +
                ", colorPlumaje='" + colorPlumaje + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                '}';
    }
}
