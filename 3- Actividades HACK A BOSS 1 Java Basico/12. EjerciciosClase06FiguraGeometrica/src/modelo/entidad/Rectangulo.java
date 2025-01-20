package modelo.entidad;

public class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    public Rectangulo(int id, String color, String coordenadas, double lado1, double lado2) {
        super(id, color, coordenadas);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                '}';
    }
}
