import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        boolean continuar = true;
        Scanner leer = new Scanner(System.in);
        String nombre="";
        double nota = 0;
        char opcion=' ';
        int id = 0;
        double notaLista = 0;
        double acumuladorNota = 0;


        while(continuar){

            System.out.println("Introduzca nombre de estudiante");
            nombre = leer.nextLine();
            System.out.println("Introduzca nota");
            nota = leer.nextDouble();
            id = listaEstudiantes.size()+1;
            Estudiante estudiante = new Estudiante (id, nombre,nota);
            listaEstudiantes.add(estudiante);
            System.out.println("Desea introducir otro estudiante? s/n ");
            opcion = leer.next().toLowerCase().charAt(0);
            if(opcion=='n'){
                continuar=false;
            }else{
                leer.nextLine();
            }

        }

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
            notaLista = estudiante.getNotas();
            acumuladorNota += notaLista;
        }
        System.out.println("Promedio :"+acumuladorNota/listaEstudiantes.size());

    }
}