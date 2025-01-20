package entidades;

// Producto: Casa
public class House {

    private int rooms;
    private String roofType;
    // Puedes añadir más atributos según sea necesario

    public House(int rooms, String roofType) {
        this.rooms = rooms;
        this.roofType = roofType;
    }

    // Puedes añadir más métodos según sea necesario

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", roofType='" + roofType + '\'' +
                '}';
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }
}

