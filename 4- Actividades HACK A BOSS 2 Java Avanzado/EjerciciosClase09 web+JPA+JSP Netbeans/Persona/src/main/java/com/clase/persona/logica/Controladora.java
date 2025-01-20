/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.persona.logica;

import com.clase.persona.persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Alberto
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
     public void crearPersona (Persona perso) {
        controlPersis.crearPersona(perso);
    }
    
    public void eliminarPersona (Long id) {
        controlPersis.eliminarPersona(id);
    }
    
    public List<Persona> traerPersonas () {
        return controlPersis.traerPersonas();
    }
    
    public void editarPersona (Persona perso) {
        controlPersis.editarPersona(perso);
    }
    
    public List<Persona> busquedaPorApellido(String apellido){
        
        //Obtener todas las personas
        List<Persona> listaPersonas = controlPersis.traerPersonas(); 

        //Filtro por apellido
        return listaPersonas.stream()
                .filter(persona -> persona.getApellido().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }
    
}

