package org.example;

import org.example.logica.Persona;
import org.example.logica.Proyecto;
import org.example.persistencia.ControladoraPersistencia;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
/*
        Persona persona1 = new Persona(1L,"Alberto",40);
        Persona persona2 = new Persona(2L,"Juan",30);
        Persona persona3 = new Persona(3L,"Pedro",20);
        System.out.println(persona1);

        //creamos una persona en la BD
        //controlPersis.crearPersona(persona2);
        //controlPersis.crearPersona(persona3);

        //borramos el registro "Prueba Borrar" mediante su id (en este caso sería la 2)

        //controlPersis.borrarPersona(2L);

        //editamos el primer registro cambiando la edad
        //antes era 32 ahora será 31
        persona3.setEdad(21);
        controlPersis.modificarPersona(persona3);

        //mostrar todas las personas de la tabla mediante find entities
        List<Persona> listaPersonas = controlPersis.traerPersonas();

        //usando for each para recorrer la collection
        System.out.println("----Lista de personas----");
        for (Persona per:listaPersonas) {
            System.out.println(per.toString());
        }*/

        // Crear un nuevo proyecto
        Proyecto proyecto1 = new Proyecto("Desarrollo de software", "Informatica", new Date());
        Proyecto proyecto2 = new Proyecto("Desarrollo2", "Informatica", new Date());
        Proyecto proyecto3 = new Proyecto("Desarrollo3", "Electronica", new Date());
        Proyecto proyecto4 = new Proyecto("Desarrollo4", "Informatica", new Date());

        controlPersis.crearProyecto(proyecto2);
        controlPersis.crearProyecto(proyecto3);
        controlPersis.crearProyecto(proyecto4);

        // Traer todos los proyectos
        List<Proyecto> listaProyectos = controlPersis.traerProyectos();
        System.out.println("Proyectos: " + listaProyectos);
        for (Proyecto proy :listaProyectos) {
            System.out.println(proy.toString());
        }

        // Modificar un proyecto
        proyecto1.setDescripcion("Desarrollo de software avanzado");
        controlPersis.modificarProyecto(proyecto1);

        // Buscar proyectos por tipo
        List<Proyecto> proyectosTecnologia = controlPersis.traerProyectosPorTipo("Informatica");
        System.out.println("Proyectos de Informática:");
        for (Proyecto proyecto : proyectosTecnologia) {
            System.out.println(proyecto);
        }
        // Borrar un proyecto
        //controlPersis.borrarProyecto(4L);
    }

}