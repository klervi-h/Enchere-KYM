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
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="images/marteau.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="images/marteau.png">
<link rel="stylesheet" href="css/style2.css">
</head>
<body>
	<header>
		<nav id="nav-menu-container">
			<a href ="AccueilConnectee">ENI - Enchères</a>
		</nav>
	</header>

	<main>
		<form action="" method="post">
			<label for="pseudo">Pseudo :</label><br>
			<input type="text" id="pseudo" name="pseudo" placeholder="Pseudo" required /><br>
			<label for="nom">Mot de passe :</label><br> 
			<input type="password" id="password" name="password" placeholder="mot de passe"  required /><br>
			<div id="validation">
				<button type="submit" id="connexion">Connexion</button>
					<div>
						<!--  <input type="checkbox" id= remember name="remember"/>
						 <label for="achat">Se souvenir de moi</label> -->
					</div>
				<!--<a href="">Mot de passe oublié</a>-->
			</div>

			<a href="CreationCompte">Créer un compte</a>

		</form>

	</main>
</html>