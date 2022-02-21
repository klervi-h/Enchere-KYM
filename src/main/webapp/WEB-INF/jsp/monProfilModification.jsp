<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Créer un nouveau compte ENI-Encheres.org</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Bienvenue sur le site ENI-Enchère">
	<meta name="keywords" content="Enchere, objet seconde main, Pas d'échange d'argent">
	<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
	<link rel="icon" type="image/png" sizes="32x32" href="images/marteau.png">
	<link rel="icon" type="image/png" sizes="16x16" href="images/marteau.png">
	<link rel="stylesheet" href="css/style2.css">
</head>
<body>
	<%
    String pseudo = (String) request.getAttribute("pseudonyme");
    String nom = (String) request.getAttribute("nomUtil");
    String prenom = (String) request.getAttribute("prenomUtil");
    String email = (String) request.getAttribute("emailUtil");
    int telephone = (int) request.getAttribute("telephoneUtil");
    String rue = (String) request.getAttribute("rueUtil");
    int codePostal = (int) request.getAttribute("codePostaleUtil");
    String ville = (String) request.getAttribute("villeUtil");
    int credit = (int) request.getAttribute("creditUtil");
    %>
	<header>
		<nav id="nav-menu-container">
			<h1>ENI - Enchères</h1>
		</nav>
	</header>
	
	<main>
			<h2>Mon profil</h2>
            <form action ="" method="post">                   
                    <label for="pseudo">Pseudo :</label><br>
                        <input type="text" id="pseudo" name="pseudo" value="<%=pseudo %>" autofocus required /><br>
                    <label for="nom">Nom :</label><br>
                        <input type="text" id="nom" name="nom" value="<%=nom %>" autofocus required/><br>
                    <label for="prenom">Prénom :</label><br>
                        <input type="text" id="prenom" name="prenom" value="<%=prenom %>" required/><br>
                    <label for="email">Email :</label><br>
                         <input type="email" id="email" value="<%=email %>"required/><br>
                    <label for="telephone">Téléphone :</label><br>
                         <input type="tel" id="telephone" value="<%=telephone %>"/><br>
                    <label for="rue">Rue :</label><br>
                         <input type="text" id="rue" value="<%=rue %>"/><br>
                     <label for="codePostal">Code Postal :</label><br>
                         <input type="text" id="codePostal" value="<%=codePostal %>"/><br>
                     <label for="ville">Ville :</label><br>
                         <input type="text" id="ville" value="<%=ville %>"/><br>                  
                    <label for="password">Mot de Passe :</label><br>
                         <input type="password" id="password" required/><br>
                    <label for="newPassword">Nouveau mot de passe :</label><br>
                         <input type="password" id="newPassword" required/><br>
                    <label for="fld-repeat-password">Confirmation :</label><br>
                         <input type="password" id="fld-repeat-password" required/><br>
                    <table><tr><td>Crédit :</td><td><%=credit %></td></tr></table>

                         
                    
                    <div id="validation">
                    	<input type="submit" name="boutonEnregistrer" value="Enregistrer" title="Enregistrer"/>
                        <input type="reset" name="boutonSupprimer" value="Supprimer mon compte" title="Supprimer" />
                    </div>
            </form>
	</main>
</html>