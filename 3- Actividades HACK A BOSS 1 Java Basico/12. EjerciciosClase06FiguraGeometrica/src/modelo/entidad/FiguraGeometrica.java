package modelo.entidad;

public abstract class FiguraGeometrica {

    public int id;
    public String color;
    public String coordenadas;

    public FiguraGeometrica(int id, String color, String coordenadas) {
        this.id = id;
        this.color = color;
        this.coordenadas = coordenadas;
    }

    public abstract double calcularArea();
}
