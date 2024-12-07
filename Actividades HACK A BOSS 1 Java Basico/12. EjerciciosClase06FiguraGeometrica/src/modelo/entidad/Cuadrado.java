package modelo.entidad;

public class Cuadrado extends FiguraGeometrica {

    private double lado;

    public Cuadrado(int id, String color, String coordenadas, double lado) {
        super(id, color, coordenadas);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                '}';
    }
}
