import modelo.entidad.*;

public class Main {
    public static void main(String[] args) {

        Vestimenta zapato1 = new Zapato(1, "Zapato Deportivo", 49.99, "Nike", "42", "Negro", "Cuero", "Cordones");
        Vestimenta zapato2 = new Zapato(2, "Zapato Casual", 39.99, "Adidas", "40", "Marrón", "Sintético", "Velcro");
        Vestimenta zapato3 = new Zapato(3, "Zapato Formal", 59.99, "Clarks", "43", "Negro", "Cuero", "Cordones");

        Vestimenta pantalon1 = new Pantalon(4, "Pantalón Vaquero", 34.99, "Levis", "M", "Azul", "Casual", "Denim");
        Vestimenta pantalon2 = new Pantalon(5, "Pantalón Chino", 29.99, "Zara", "L", "Beige", "Formal", "Algodón");
        Vestimenta pantalon3 = new Pantalon(6, "Pantalón Deportivo", 24.99, "Puma", "XL", "Gris", "Deportivo", "Poliéster");

        Vestimenta camiseta1 = new Camiseta(7, "Camiseta Básica", 14.99, "Uniqlo", "L", "Blanco", "Corta", "Redondo");
        Vestimenta camiseta2 = new Camiseta(8, "Camiseta Deportiva", 19.99, "Reebok", "M", "Negro", "Sin mangas", "Cuello V");

        Vestimenta sombrero1 = new Sombrero(9, "Sombrero Panamá", 49.99, "Sombreros Panamá", "Única", "Beige", "Panamá", "Grande");

        Vestimenta[] vestimentas = {zapato1, zapato2, zapato3, pantalon1, pantalon2, pantalon3, camiseta1, camiseta2, sombrero1};

        System.out.println("**For, forma1");
        for (int i = 0; i < vestimentas.length; i++) {
            vestimentas[i].mostrarInfo();
        }

        System.out.println("\n**For each, forma2");
        for (Vestimenta vestimenta : vestimentas){
            vestimenta.mostrarInfo();
        }
    }
}
