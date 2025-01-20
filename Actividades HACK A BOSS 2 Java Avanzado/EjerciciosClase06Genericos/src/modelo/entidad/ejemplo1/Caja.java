package modelo.entidad.ejemplo1;

public class Caja <T>{

    private T contenido;

    public void ponerContenido(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerContenido() {
        return contenido;
    }

    //metodo para ver a que clase pertenece

    public String obtenerTipo() {
        if (contenido == null) {
            return "El contenido es null";
        }

        // Usamos instanceof para determinar tipos comunes
        if (contenido instanceof String) {
            return "El contenido es de tipo String";
        } else if (contenido instanceof Integer) {
            return "El contenido es de tipo Integer";
        } else if (contenido instanceof Boolean) {
            return "El contenido es de tipo Boolean";
        } else if (contenido instanceof Double) {
            return "El contenido es de tipo Double";
        } else if (contenido instanceof Float) {
            return "El contenido es de tipo Float";
        } else if (contenido instanceof Character) {
            return "El contenido es de tipo Character";
        } else {
            // Para otros casos, devolvemos el nombre completo de la clase
            return "El contenido es de tipo " + contenido.getClass().getSimpleName();
        }
    }

    public String obtenerTipo2() {
        if (contenido == null) {
            return "El contenido es null";
        }
        //return "El contenido es de tipo " + contenido.getClass().getName();
        return "El contenido es de tipo " + contenido.getClass().getSimpleName();
    }



}
