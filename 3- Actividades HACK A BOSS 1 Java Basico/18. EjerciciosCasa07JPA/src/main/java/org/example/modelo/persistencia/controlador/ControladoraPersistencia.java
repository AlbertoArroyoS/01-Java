package org.example.modelo.persistencia.controlador;


import org.example.modelo.logica.entidad.Platillo;
import org.example.modelo.persistencia.dao.PlatilloJpaController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    private PlatilloJpaController platilloJPA = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        platilloJPA.crear(platillo);
    }

    public void editarPlatillo(Platillo platillo) {
        try {
            platilloJPA.editar(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPlatillo(int id) {
        try {
            platilloJPA.eliminar(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Platillo> obtenerTodos() {
        return platilloJPA.obtenerTodos();
    }
}