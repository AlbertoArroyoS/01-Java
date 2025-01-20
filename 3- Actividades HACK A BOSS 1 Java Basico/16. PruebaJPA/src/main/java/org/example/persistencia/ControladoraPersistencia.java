package org.example.persistencia;

import org.example.logica.Persona;
import org.example.logica.Proyecto;
import org.example.persistencia.exceptions.NonexistentEntityException;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PersonaJpaController persoJPA = new PersonaJpaController();
    ProyectoJpaController proyectoJPA = new ProyectoJpaController();


    public void crearPersona(Persona pers) {
        persoJPA.create(pers);
    }

    public void borrarPersona(Long id) {
        try {
            persoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Persona> traerPersonas () {
        return persoJPA.findPersonaEntities();
    }

    public void modificarPersona (Persona pers) {

        try {
            persoJPA.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //*******************PROYECTO*************

    public void crearProyecto(Proyecto proyecto) {
        proyectoJPA.create(proyecto);
    }

    public void borrarProyecto(Long id) {
        try {
            proyectoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Proyecto> traerProyectos() {
        return proyectoJPA.findProyectoEntities();
    }

    public void modificarProyecto (Proyecto proyecto) {

        try {
            proyectoJPA.edit(proyecto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Metodo adicional para obtener proyectos por tipo
    public List<Proyecto> traerProyectosPorTipo(String tipo) {
        List<Proyecto> proyectosFiltrados = new ArrayList<>();
        try {
            // Obtener todos los proyectos
            List<Proyecto> listaProyectos = proyectoJPA.findProyectoEntities();

            // Recorrer la lista de proyectos y filtrar por el tipo
            for (Proyecto proyecto : listaProyectos) {
                if (proyecto.getTipo() != null && proyecto.getTipo().equals(tipo)) {
                    proyectosFiltrados.add(proyecto);
                }
            }
        } finally {
            //em.close();
        }
        return proyectosFiltrados;
    }


}