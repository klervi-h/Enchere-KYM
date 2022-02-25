<%@page import="encheres.buisness.bll.UtilisateurManager"%>
<%@ page import="java.util.List"%>
<%@ page import="encheres.buisness.bo.Article"%>
<%@page import="encheres.buisness.bo.Article"%>
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
<meta name="keywords"
	content="Enchere, objet seconde main, Pas d'échange d'argent">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<link rel="stylesheet" href="css/StylelSheet.css">

<style>
@import
	url('https://fonts.googleapis.com/css2?family=Raleway&display=swap');
</style>
</head>

<body>
	<header>
		<nav class="navbar">
			<div class="logo">
				<h1>ENI - Enchères</h1>
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
		<ul aria-label="Listes des articles" class="container">
			<%
			List<Article> listeArticle = (List<Article>) request.getAttribute("listeArticle");
			int longeurListe = listeArticle.size();
			Article article = null;
			UtilisateurManager uM = new UtilisateurManager();

			for (int i = 0; i < listeArticle.size(); i++) {
				article = listeArticle.get(i);
			%>
			<li>
				<h3>
					<a href="DetailVente?idArticle=<%=article.getNoArticle()%>"><%=article.getNomArticle()%></a>
				</h3>
				<p class="article">
					Prix :
					<%=article.getPrixVente()%>
					points<br /> Fin de l'enchère :
					<%=article.getDateFin()%>
					<br /> Vendeur : <a
						href="ProfilVendeur?idVendeur=<%=(uM.afficherParId(article.getNoUtilisateur())).getPseudo()%>"><%=(uM.afficherParId(article.getNoUtilisateur())).getPseudo()%></a>
				</p>
			</li>
			<%
			}
			%>
		</ul>
	</main>
</body>
</html>


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
