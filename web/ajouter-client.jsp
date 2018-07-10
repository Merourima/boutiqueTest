<%-- 
    Document   : ajouter-client
    Created on : 10 juil. 2018, 09:56:10
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client</title>
        <link href="styleClient.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="mainBox">
            <div class="hdiv">  <h1> Inscription Client</h1>  </div>
                
            <div >   
                <form class="design " method="POST" >
                    <label> Nom: </label> 
                    <input type="text" name="nom" /> <br>
                    <label> Prénom: </label> 
                    <input type="text" name="prenom"/><br>
                    <label> Adresse: </label> 
                    <input type="text" name="adresse"/><br>
                    <label> Numéro de la Rue: </label> 
                    <input type="number" name="numRue"/><br>
                    <label> Code Postale: </label> 
                    <input type="number" name="codePost"/><br>
                    <input type="submit" /><br>
                    
                </form>
            </div>
        </div>
    </body>
</html>
