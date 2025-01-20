import java.util.List;

class Agente implements Runnable {
    private final int id;
    private final List<String> llamadas;

    public Agente(int id, List<String> llamadas) {
        this.id = id;
        this.llamadas = llamadas;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String llamada;
                synchronized (llamadas) {
                    if (llamadas.isEmpty()) break;
                    llamada = llamadas.remove(0);
                }

                System.out.println("Agente " + id + " atendiendo " + llamada);
                Thread.sleep((long) (Math.random() * 3000 + 1000));
                System.out.println("Agente " + id + " resolvió " + llamada);
            }
        } catch (InterruptedException e) {
            System.err.println("Agente " + id + " fue interrumpido.");
        }
    }
}