/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.persona.persistencia;

/**
 *
 * @author Alberto
 */
import com.clase.persona.logica.Persona;
import com.clase.persona.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    PersonaJpaController persoJPA = new PersonaJpaController();
    
    public void crearPersona (Persona perso) {
        persoJPA.create(perso);
    }
    
    public void eliminarPersona (Long id) {
        try {
            persoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> traerPersonas () {
    return persoJPA.findPersonaEntities();
    }
    
    public void editarPersona (Persona perso) {
        try {
            persoJPA.edit(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
