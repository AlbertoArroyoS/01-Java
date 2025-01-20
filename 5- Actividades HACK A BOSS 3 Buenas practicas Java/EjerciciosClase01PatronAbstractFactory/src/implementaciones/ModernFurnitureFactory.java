package implementaciones;

import interfaces.Chair;
import interfaces.FurnitureFactory;
import interfaces.Table;

// Implementación concreta de la fábrica de muebles modernos
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
