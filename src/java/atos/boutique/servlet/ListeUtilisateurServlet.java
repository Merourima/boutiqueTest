/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.boutique.servlet;

import atos.boutique.entity.Client;
import atos.boutique.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListeUtilisateur", urlPatterns = {"/lister-utilisateur"})
public class ListeUtilisateurServlet extends HttpServlet {
    
    ClientService serviceClt = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            List<Client> clients = serviceClt.recuperer();
            
            req.setAttribute("listeClient", clients);
            
            req.getRequestDispatcher("lister-utilisateur.jsp").forward(req, resp);

    }
    
    
}
