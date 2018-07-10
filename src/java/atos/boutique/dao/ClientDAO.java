/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.boutique.dao;

import atos.boutique.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class ClientDAO {

    public void ajouter(Client client) {
        EntityManager em = Persistence.createEntityManagerFactory("ClientBoutiquePU").createEntityManager();
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();

    }

    public List<Client> recupererUtilisateur() {
        EntityManager em = Persistence.createEntityManagerFactory("ClientBoutiquePU").createEntityManager();
        Query query = em.createQuery("SELECT c FROM Client c");
        
        return query.getResultList();

    }
        
}
