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
			<h1>ENI - Enchéres</h1>
		</nav>
	</header>

	<main>
		<form action="" method="post">
			<label for="pseudo">Identifiant :</label><br> <input type="text"
				id="pseudo" name="pseudo" placeholder="Pseudo" autofocus required /><br>
			<label for="nom">Mot de passe :</label><br> <input type="text"
				id="mdp" name="mdp" placeholder="mdp" autofocus required /><br>
			<div id="validation">
				<button type="submit" id="connexion">Connexion</button>
				<label for="achat">Se souvenir de moi</label> <input type="radio"
					name="remember" /> <a href="">Mot de passe oublié</a>
			</div>

			<button type="button" id="creerCompte">Créer un compte</button>

		</form>

	</main>
</html>