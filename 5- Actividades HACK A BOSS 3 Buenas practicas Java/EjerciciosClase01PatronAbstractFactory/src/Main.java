import implementaciones.ClassicFurnitureFactory;
import implementaciones.ModernFurnitureFactory;
import interfaces.Chair;
import interfaces.FurnitureFactory;
import interfaces.Table;

/*
***   Patrón Abstract Factory  ****
Imaginemos un sistema de creación de muebles donde se deben producir diferentes tipos de muebles,
como sillas y mesas, y cada tipo de mueble puede tener variantes según el estilo,
como moderno o clásico. Utilizaremos el patrón Abstract Factory para manejar la creación de estas
familias de productos.
 */
public class Main {
    public static void main(String[] args) {

        // Utilizando ModernFurnitureFactory (muebles modernos)
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn(); // Imprime "Sentándose en una silla moderna"
        modernTable.putOn(); // Imprime "Colocando objetos en una mesa moderna"

        // Utilizando ClassicFurnitureFactory (muebles clásicos)
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

        classicChair.sitOn(); // Imprime "Sentándose en una silla clásica"
        classicTable.putOn(); // Imprime "Colocando objetos en una mesa clásica"


    }
}