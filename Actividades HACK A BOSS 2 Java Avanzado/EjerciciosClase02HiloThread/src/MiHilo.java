public class MiHilo extends Thread{

    private String nombre;

    public MiHilo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + ": Contador " + i);

            try {
                // Introducir una pequeña pausa para simular un trabajo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
