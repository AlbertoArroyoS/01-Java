package implementaciones;

import interfaces.Chair;
import interfaces.FurnitureFactory;
import interfaces.Table;
// Implementación concreta de la fábrica de muebles clásicos
public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
