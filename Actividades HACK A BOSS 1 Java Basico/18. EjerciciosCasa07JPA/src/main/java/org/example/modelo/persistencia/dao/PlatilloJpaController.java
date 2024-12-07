package org.example.modelo.persistencia.dao;


import org.example.modelo.logica.entidad.Platillo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PlatilloJpaController {

    private EntityManagerFactory emf;

    public PlatilloJpaController() {
        this.emf = Persistence.createEntityManagerFactory("jpaPU");
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crear(Platillo platillo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(platillo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void editar(Platillo platillo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(platillo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void eliminar(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Platillo platillo = em.find(Platillo.class, id);
            if (platillo != null) {
                em.remove(platillo);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Platillo> obtenerTodos() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Platillo p", Platillo.class).getResultList();
        } finally {
            em.close();
        }
    }
}
