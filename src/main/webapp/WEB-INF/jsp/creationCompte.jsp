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
	<header>
		<nav id="nav-menu-container">
			<h1>ENI - Enchéres</h1>
		</nav>
	</header>
	
	<main>
			<h2>Mon profil</h2>
            <form action="" method="post">                   
                    <label for="pseudo">Pseudo :</label><br>
                        <input type="text" id="pseudo" name="pseudo" placeholder="Pseudo" autofocus required /><br>
                    <label for="nom">Nom :</label><br>
                        <input type="text" id="nom" name="nom" placeholder="nom" autofocus required/><br>
                    <label for="prenom">Prénom :</label><br>
                        <input type="text" id="prenom" name="prenom" placeholder="Votre prénom ?" required/><br>
                    <label for="email">Email :</label><br>
                         <input type="text" id="email" placeholder="email"required/><br>
                    <label for="telephone">Téléphone :</label><br>
                         <input type="text" id="telephone" placeholder="numéro de téléphone"/><br>
                     <label for="rue">Rue :</label><br>
                         <input type="text" id="rue" placeholder="rue"/><br>    
                     <label for="codePostal">Code Postal :</label><br>
                         <input type="text" id="codePostal" placeholder="code postal"/><br>
                     <label for="ville">Ville :</label><br>
                         <input type="text" id="ville" placeholder="ville"/><br>                  
                    <label for="password">Mot de Passe :</label><br>
                         <input type="text" id="password" required/><br>
                    <label for="fld-repeat-password">Confirmation :</label><br>
                         <input type="text" id="fld-repeat-password" required/><br>
                    
                    <div id="validation">
                    	<button type="submit" id="creerUtilisateur">Créer</button>
						<button type="button" id="annulerNewVente">Annuler</button>	
                    	
                    </div>
            </form>
	</main>
</html>