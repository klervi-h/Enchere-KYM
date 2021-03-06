<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Connexion ENI-Encheres.org</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Bienvenue sur le site ENI-Enchère">
<meta name="keywords"
	content="Enchere, objet seconde main, Pas d'échange d'argent">
<link rel="stylesheet" href="css/styleAcceuill_connection.css">
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
		</nav>
	</header>

	<main>
		<div class="connection">
			<img alt="" aria-hidden="true" src="images/feuille.png"
				class="feuille">

			<form action="" method="post">
				<div class="champs">
					<label for="pseudo">Pseudo :</label>
				</div>
				<div class="champs">
					<input type="text" id="pseudo" name="pseudo" placeholder="Pseudo"
						required />
				</div>
				<div class="champs">
					<label for="nom">Mot de passe :</label>
				</div>
				<div class="champs">
					<input type="password" id="password" name="password"
						placeholder="mot de passe" required />
				</div>
				<div id="validation" class="bas">
					<button type="submit" id="connexion" class="boutton">Connexion</button>
					<a href="CreationCompte" class="leBouton leBouton2">Créer un
						compte</a>
					<div>
						<!--  <input type="checkbox" id= remember name="remember"/>
						 <label for="achat">Se souvenir de moi</label> -->
					</div>
					<!--<a href="">Mot de passe oublié</a>-->
				</div>

			</form>
		</div>
	</main>
</html>