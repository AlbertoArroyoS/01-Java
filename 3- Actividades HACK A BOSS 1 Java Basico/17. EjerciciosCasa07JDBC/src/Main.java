import modelo.entidad.Estudiante;
import modelo.persistencia.dao.EstudianteDAO;

import java.sql.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EstudianteDAO estudianteDAO = new EstudianteDAO();

        // Agregar estudiantes
        estudianteDAO.agregarEstudiante(new Estudiante("Alberto", 40, 9.20));
        estudianteDAO.agregarEstudiante(new Estudiante("Erika", 5, 10));

        // Obtener y mostrar la lista de estudiantes
        List<Estudiante> estudiantes = estudianteDAO.obtenerEstudiantes();
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}