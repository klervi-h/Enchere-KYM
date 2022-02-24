<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bienvenue sur le site ENI-Encheres.org</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Bienvenue sur le site ENI-Enchère">
<meta name="keywords"content="Enchere, objet seconde main, Pas d'échange d'argent">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<link rel="icon" type="image/png" sizes="32x32" href="images/marteau.png">
<link rel="icon" type="image/png" sizes="16x16" href="images/marteau.png">
<link rel="stylesheet" href="css/style2.css">
</head>
<body>
	<header>
		<nav id="nav-menu-container">
			<h1>ENI - Enchéres</h1>
			<!--  --><ul class="nav-menu">
				<li class="nav-item"><a class="nav-link" href="Connexion">Se connecter</a></li>
				<li class="nav-item"><a class="nav-link" href="CreationCompte">S'inscrire</a></li>
			</ul>
		</nav>
	</header>

	<main>
		<input type="search" id="site-search" name="q"
		       aria-label="Search through site content">
		<button>Rechercher</button>
		<p>
		<label for="categorie">Catégorie</label> <select name="categorie"
			id="categorie">
			<option value="1">Informatique</option>
			<option value="2">Ameublement</option>
			<option value="3">Vêtement</option>
			<option value="4">Sport&Loisirs</option>
		</select>
		</p>

	<section class="container">
	
 <%// @include file="WEB-INF/listeArticle.html" %>
		
		<ul aria-label = "Listes des articles">
			<%
		
		
		%>
		
		</ul>
	
		
		
		<!--  <div class="item">
			<img src="https://via.placeholder.com/150x120">
			<h2 class="title">Montre classique</h2>
			<p class="text">Lorem ipsum dolor sit amet consecte tur
				adipisicing elit. Atque magnam unde ex plicabo veniam molestiae
				reprehenderit ea ad nihil, am et ipsum minus. Adipisci, architecto
				aspernatur officia labore quae rat cupiditate dolor itaque!</p>

			<p class="vendor">jojo44</p>

			<p class="price">210 points</p>
		</div>

		<div class="item">
			<img src="https://via.placeholder.com/150x120">
			<h2 class="title">Montre classique</h2>
			<p class="text">Lorem ipsum dolor sit amet consecte tur
				adipisicing elit. Atque magnam unde ex plicabo veniam molestiae
				reprehenderit ea ad nihil, am et ipsum minus. Adipisci, architecto
				aspernatur officia labore quae rat cupiditate dolor itaque!</p>

			<p class="vendor">jojo44</p>

			<p class="price">130 points</p>
		</div>

		<div class="item">
			<img src="https://via.placeholder.com/150x120">
			<h2 class="title">Montre Haut de Gamme</h2>
			<p class="text">Lorem ipsum dolor sit amet consecte tur
				adipisicing elit. Atque magnam unde ex plicabo veniam molestiae
				reprehenderit ea ad nihil, am et ipsum minus. Adipisci, architecto
				aspernatur officia labore quae rat cupiditate dolor itaque!</p>
			<p class="vendor">AliciaK</p>
			<p class="price">315 points</p>
		</div>

		<div class="item">
			<img src="https://via.placeholder.com/150x120">
			<h2 class="title">Montre enfant</h2>
			<p class="text">Lorem ipsum dolor sit amet consecte tur
				adipisicing elit. Atque magnam unde ex plicabo veniam molestiae
				reprehenderit ea ad nihil, am et ipsum minus. Adipisci, architecto
				aspernatur officia labore quae rat cupiditate dolor itaque!</p>
			<p class="vendor">Martin18</p>
			<p class="price">15 points</p>
		</div>  -->
	</section>
	</main>
	
	<footer> </footer>
</body>
</html>