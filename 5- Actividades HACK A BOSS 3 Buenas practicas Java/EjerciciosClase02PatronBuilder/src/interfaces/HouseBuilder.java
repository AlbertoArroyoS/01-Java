package interfaces;

import entidades.House;

// Interfaz para el constructor (Builder)
public interface HouseBuilder {

    void buildRooms();
    void buildRoof();
    House getResult();

}
