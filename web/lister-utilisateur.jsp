<%-- 
    Document   : lister-utilisateur
    Created on : 10 juil. 2018, 11:42:49
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Utilisateur </title>
    </head>
    <body>
        <h1> liste des utilisateurs </h1>
        <c:forEach items="${listeClient}" var="catAct">
            
            ${catAct.nom} 
             <br>
            ${catAct.prenom} 
             <br>
            ${catAct.adresse} 
             <br>
            ${catAct.numRue} 
             <br>
            ${catAct.codePost} 
             <br>
             
        </c:forEach>
    </body>
</html>
