package com.hackaboss.alumno.controller;

import com.hackaboss.alumno.model.Alumno;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    List<Alumno> alumnos = new ArrayList<>();

    // Metodo para cargar datos iniciales al levantar el proyecto
    @PostConstruct
    public void init() {
        alumnos.add(new Alumno(1L, "Juan", "Pérez", "A12345", 9.5, "Primario"));
        alumnos.add(new Alumno(2L, "María", "Gómez", "B67890", 8.7, "Secundario"));
        alumnos.add(new Alumno(3L, "Carlos", "López", "C11223", 7.2, "Terciario"));
        alumnos.add(new Alumno(4L, "Ana", "Martínez", "D44556", 10.0, "Primario"));
        alumnos.add(new Alumno(5L, "Luis", "Fernández", "E77889", 6.8, "Secundario"));
    }

    // 1. Agregar un nuevo alumno
    //http://localhost:8080/alumnos
    @PostMapping
    public String agregarAlumno(@RequestBody Alumno alumno) {
        alumnos.add(alumno);
        return "Alumno agregado con éxito.";
    }

    // 2. Devolver una lista de todos los alumnos
    //http://localhost:8080/alumnos
    @GetMapping
    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnos;
    }

    // 3. Devolver un alumno de acuerdo con un id recibido como parámetro
    //http://localhost:8080/alumnos/1
    @GetMapping("/{id}")
    public Alumno obtenerAlumnoPorId(@PathVariable Long id) {
        return alumnos.stream()
                .filter(alumno -> alumno.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado con el id: " + id));
    }

    // 4.1 Devolver una lista de alumnos que pertenezcan a un determinado nivel PathVariable
    //http://localhost:8080/alumnos/nivel/Secundario
    @GetMapping("/nivel/{nivelEducativo}")
    public List<Alumno> obtenerAlumnosPorNivel(@PathVariable String nivelEducativo) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNivelEducativo().equalsIgnoreCase(nivelEducativo))
                .collect(Collectors.toList());
    }

    //4.2 Devolver una lista de alumnos que pertenezcan a un determinado nivel RequestParam
    //http://localhost:8080/alumnos/nivel?nivelEducativo=Secundario
    @GetMapping("/nivel")
    public List<Alumno> obtenerAlumnosPorNivel2(@RequestParam String nivelEducativo) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNivelEducativo().equalsIgnoreCase(nivelEducativo))
                .collect(Collectors.toList());
    }

    // 5. Editar un alumno existente
    //http://localhost:8080/alumnos/1
    @PutMapping("/{id}")
    public String editarAlumno(@PathVariable Long id, @RequestBody Alumno alumnoActualizado) {
        Alumno alumnoExistente = alumnos.stream()
                .filter(alumno -> alumno.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado con el id: " + id));

        // Actualizamos los campos del alumno existente con los datos del alumno actualizado
        alumnoExistente.setNombre(alumnoActualizado.getNombre());
        alumnoExistente.setApellido(alumnoActualizado.getApellido());
        alumnoExistente.setNumeroMatricula(alumnoActualizado.getNumeroMatricula());
        alumnoExistente.setNotaFinal(alumnoActualizado.getNotaFinal());
        alumnoExistente.setNivelEducativo(alumnoActualizado.getNivelEducativo());

        return "Alumno actualizado con éxito.";
    }

    // 6. Borrar un alumno existente
    //http://localhost:8080/alumnos/1
    @DeleteMapping("/{id}")
    public String borrarAlumno(@PathVariable Long id) {
        boolean eliminado = alumnos.removeIf(alumno -> alumno.getId().equals(id));
        if (!eliminado) {
            throw new RuntimeException("Alumno no encontrado con el id: " + id);
        }
        return "Alumno eliminado con éxito.";
    }
}
