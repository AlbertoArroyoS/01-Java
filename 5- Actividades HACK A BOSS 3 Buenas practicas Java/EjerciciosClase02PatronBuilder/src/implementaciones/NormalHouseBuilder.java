package implementaciones;

import entidades.House;
import interfaces.HouseBuilder;

// Implementación concreta del constructor para una casa normal
public class NormalHouseBuilder implements HouseBuilder {
    private House house;

    public NormalHouseBuilder() {
        this.house = new House(0, "Normal");
    }

    @Override
    public void buildRooms() {
        house = new House(4, house.getRoofType()); // Una casa normal suele tener 4 habitaciones
    }

    @Override
    public void buildRoof() {
        // Puede mantener el tipo de techo predeterminado o personalizar según sea necesario
    }

    @Override
    public House getResult() {
        return house;
    }

}
