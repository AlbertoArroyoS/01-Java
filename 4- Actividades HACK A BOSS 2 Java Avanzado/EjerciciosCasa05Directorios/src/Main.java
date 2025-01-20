public class Main {
    public static void main(String[] args) {

        Directorio raiz = new Directorio("Raíz");
        Directorio documentos = new Directorio("Documentos");
        Directorio musica = new Directorio("Música");
        Directorio fotos = new Directorio("Fotos");

        // Crear archivos en el directorio raíz
        raiz.agregarArchivo("leeme.txt");
        raiz.agregarArchivo("config.ini");

        // Crear archivos en Documentos
        documentos.agregarArchivo("documento1.txt");
        documentos.agregarArchivo("documento2.txt");

        // Crear archivos en Música
        musica.agregarArchivo("cancion1.mp3");
        musica.agregarArchivo("cancion2.mp3");

        // Crear archivos en Fotos
        fotos.agregarArchivo("foto1.jpg");
        fotos.agregarArchivo("foto2.png");

        // Agregar subdirectorios a la raíz
        raiz.agregarSubdirectorio(documentos);
        raiz.agregarSubdirectorio(musica);
        raiz.agregarSubdirectorio(fotos);

        // Crear el explorador y explorar la estructura
        ExploradorDirectorios explorador = new ExploradorDirectorios();
        explorador.explorarDirectorio(raiz, "");
    }
}