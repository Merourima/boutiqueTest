/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.boutique.service;

import atos.boutique.dao.ClientDAO;
import atos.boutique.entity.Client;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class ClientService {
    
    ClientDAO cltdao = new ClientDAO();
    
    public void ajouter(Client client) {
        
        cltdao.ajouter(client);

    }

    public List<Client> recuperer() {
       return cltdao.recupererUtilisateur();

    }
    
}
