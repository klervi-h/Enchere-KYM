<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer un nouveau compte ENI-Encheres.org</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Bienvenue sur le site ENI-Enchère">
<meta name="keywords"
	content="Enchere, objet seconde main, Pas d'échange d'argent">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="images/marteau.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="images/marteau.png">
<link rel="stylesheet" href="css/StyleSheetM.css">
<!-- -------------- CSS Commun ------------------- -->
<link rel="stylesheet" href="css/styleCommun.css">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Raleway&display=swap');
</style>
<!-- ---------------------------------------------- -->
</head>
<body>
	<header>
		<nav class="navbar">
			<div class="logo">
				<img src="images/handshake3.png" class="imageLogo">
				<h1>
					<a href="AccueilConnectee">ENI - Enchères</a>
				</h1>
			</div>
			<div class="link">
				<div class="nav-item">
					<a class="nav-link" href="Connexion">Se connecter</a>
				</div>
				<div class="nav-item">
					<a class="nav-link" href="CreationCompte">S'inscrire</a>
				</div>

			</div>
		</nav>
	</header>

	<main>
		<h2 class="stylecentre">Mon profil</h2>
		<form action="" method="post">
			<table class="stylecentre">
				<tr>
					<td><label for="pseudo">Pseudo :</label><br> <input
						type="text" id="pseudo" name="pseudo" placeholder="Pseudo"
						required /><br></td>
					<td><label for="nom">Nom :</label><br> <input type="text"
						id="nom" name="nom" placeholder="nom" required /><br></td>
				</tr>

				<tr>
					<td><label for="prenom">Prénom :</label><br> <input
						type="text" id="prenom" name="prenom" placeholder="Votre prénom ?"
						required /><br></td>
					<td><label for="email">Email :</label><br> <input
						type="text" name="email" placeholder="email" required /><br></td>
				</tr>

				<tr>
					<td><label for="telephone">Téléphone :</label><br> <input
						type="text" name="telephone" placeholder="numéro de téléphone" /><br></td>
					<td><label for="rue">Rue :</label><br> <input type="text"
						name="rue" placeholder="rue" /><br></td>
				</tr>

				<tr>
					<td><label for="codePostal">Code Postal :</label><br> <input
						type="text" name="codePostal" placeholder="code postal" /><br></td>
					<td><label for="ville">Ville :</label><br> <input
						type="text" name="ville" placeholder="ville" /><br></td>
				</tr>

				<tr>
					<td><label for="password">Mot de Passe :</label><br> <input
						type="password" name="password" required /><br></td>
					<td><label for="fld-repeat-password">Confirmation :</label><br>
						<input type="password" name="fld-repeat-password" required /><br></td>
				</tr>
			</table>










			<div id="validation" class="stylecentre">
				<button type="submit" id="creerUtilisateur">Créer</button>
				<a href="Accueil" type="button" id="annulerCréation">Annuler</a>

			</div>
		</form>
	</main>
</html>