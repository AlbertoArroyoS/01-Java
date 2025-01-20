import entidades.House;
import entidades.HouseDirector;
import implementaciones.LuxuryHouseBuilder;
import implementaciones.NormalHouseBuilder;
import interfaces.HouseBuilder;
/*
Patrón Builder
Ejemplo Nº 2: Construcción de una casa
Vamos a utilizar el ejemplo de la construcción de una casa, donde hay diferentes tipos de casas
y cada una puede tener características diferentes, como el número de habitaciones, el tipo de techo, etc.
 */
public class Main {


    public static void main(String[] args) {
        // Construcción de una casa normal
        HouseBuilder normalHouseBuilder = new NormalHouseBuilder();
        HouseDirector normalHouseDirector = new HouseDirector(normalHouseBuilder);

        normalHouseDirector.constructHouse();
        House normalHouse = normalHouseDirector.getConstructedHouse();
        System.out.println("Casa normal: " + normalHouse);

        // Construcción de una casa de lujo
        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        HouseDirector luxuryHouseDirector = new HouseDirector(luxuryHouseBuilder);

        luxuryHouseDirector.constructHouse();
        House luxuryHouse = luxuryHouseDirector.getConstructedHouse();
        System.out.println("Casa de lujo: " + luxuryHouse);
    }

}