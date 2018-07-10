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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjouterClientServlet", urlPatterns = {"/ajouter-client"})
public class AjouterClientServlet extends HttpServlet {

    private ClientService serviceClit = new ClientService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        String nom = req.getParameter("nom");
        String prénom = req.getParameter("prenom");
        String adresse = req.getParameter("adresse");
        Integer numRue = Integer.parseInt(req.getParameter("numRue"));
        Integer codePost = Integer.parseInt(req.getParameter("codePost"));
        
        Client client = new Client();
        
        client.setNom(nom);
        client.setPrénom(prénom);
        client.setAdresse(adresse);
        client.setNumRue(numRue);
        client.setCodePost(codePost);
        
        serviceClit.ajouter(client);
        
         //resp.sendRedirect(nom);
        
    }
    
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("ajouter-client.jsp").forward(req, resp);
                    }
    
    
}
