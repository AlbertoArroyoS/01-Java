public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) throws InventarioInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InventarioInvalidoException("El nombre del producto no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new InventarioInvalidoException("El precio debe ser mayor que cero.");
        }
        if (cantidad < 0) {
            throw new InventarioInvalidoException("La cantidad no puede ser negativa.");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarStock(int cantidadAdicional) throws InventarioInvalidoException {
        if (cantidadAdicional <= 0) {
            throw new InventarioInvalidoException("La cantidad adicional debe ser mayor que cero.");
        }
        this.cantidad += cantidadAdicional;
    }

    public void reducirStock(int cantidadReducir) throws InventarioInvalidoException {
        if (cantidadReducir <= 0) {
            throw new InventarioInvalidoException("La cantidad a reducir debe ser mayor que cero.");
        }
        if (cantidadReducir > this.cantidad) {
            throw new InventarioInvalidoException("No hay suficiente stock para reducir. Stock disponible: " + this.cantidad);
        }
        this.cantidad -= cantidadReducir;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad;
    }
}