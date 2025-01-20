package modelo.entidad;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(int id, String color, String coordenadas, double radio) {
        super(id, color, coordenadas);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                '}';
    }
}