package modelo.entidad;

public class Reptil extends Animal{

    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion,
                  double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil.");
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "habitat='" + habitat + '\'' +
                ", longitud=" + longitud +
                ", tipoEscamas='" + tipoEscamas + '\'' +
                ", tipoVeneno='" + tipoVeneno + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                '}';
    }
}
